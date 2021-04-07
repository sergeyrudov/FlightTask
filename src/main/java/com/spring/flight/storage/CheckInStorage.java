package com.spring.flight.storage;

import com.spring.flight.dto.CheckinDTO;
import com.spring.flight.entity.CheckIn;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class CheckInStorage {

    private List<CheckIn> checkInData;

    public CheckInStorage() {
        checkInData = new ArrayList<>();
        fillCheckinData();
    }

    private void fillCheckinData() {
        checkInData.add(new CheckIn(1, 1, 0));
        checkInData.add(new CheckIn(2, 4, 1));
        checkInData.add(new CheckIn(3, 5, 1));
        checkInData.add(new CheckIn(4, 86, 0));
        checkInData.add(new CheckIn(5, 23, 1));
    }

    public CheckIn isIdPresent(int destinationId, int baggageId) {
        return checkInData
                .stream()
                .filter(t -> t.getBaggageId() == baggageId)
                .filter(t -> t.getDestinationId() == destinationId)
                .findFirst()
                .orElseThrow(() -> new NoSuchElementException("element wasn't found"));
    }

    public int demo (CheckinDTO checkinDTO) {
        CheckIn checkIn = isIdPresent(checkinDTO.getDestinationId(), checkinDTO.getBaggageId());
        return checkIn.getBaggageId();
    }

}
