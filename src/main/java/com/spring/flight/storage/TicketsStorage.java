package com.spring.flight.storage;

import com.spring.flight.entity.Ticket;
import org.jetbrains.annotations.NotNull;
import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import org.slf4j.LoggerFactory;

import java.util.*;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

public class TicketsStorage {

    private static org.slf4j.Logger LOGGER = LoggerFactory.getLogger(TicketsStorage.class);

    public static Ticket cache(int id) {
        LoadingCache<Integer, Ticket> ticketCache =
                CacheBuilder.newBuilder()
                        .maximumSize(100)
                        .expireAfterAccess(30, TimeUnit.MINUTES)
                        .build(new CacheLoader<Integer, Ticket>() {
                            @Override
                            public Ticket load(@NotNull Integer key){
                                return getFromDatabase(key);
                            }
                        });
        try {
            LOGGER.info("OK, ticket with: " + id + " was found");
            return ticketCache.get(id);
        } catch (CacheLoader.InvalidCacheLoadException | NullPointerException | ExecutionException e) {
            LOGGER.info("No such ticket");
            e.printStackTrace();
            return null;
        }
    }

    private static Ticket getFromDatabase(int ticketId) {
        Map<Integer, Ticket> database = new HashMap<Integer, Ticket>();
        database.put(1, new Ticket(true));
        database.put(2, new Ticket(false));
        database.put(3, new Ticket(true));
        database.put(4, new Ticket(false));
        database.put(5, new Ticket(true));
        database.put(6, new Ticket(false));
        return database.get(ticketId);
    }
}
