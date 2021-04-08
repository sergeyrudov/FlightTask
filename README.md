# FlightTask


So, this task can be tested, for example with Postman.
1. To check availability of ticket, it can be made with GET request, like this:
localhost:8086/api/tickets/1

2. To check discount of ticked, it can be verified with POST request, like this:
localhost:8086/api/coupon
{
    "id":2,
    "price":200
}
and response will be amount of user discount

UPDATE:

3. Added API endpoint. 'Check-in'. To check availability for check in, user should input destinationId, and baggageId, and perform POST request, like this:
localhost:8086/api/baggage 

{
    "destinationId":1,
    "baggageId":0
}

and response will be true, or false

UPDATE:
added Lombok support
