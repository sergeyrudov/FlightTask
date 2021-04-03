# FlightTask


So, this task can be tested, for example with Postman.
1. To check availability of ticket, it can be made with GET request, like this:
localhost:8086/api/tickets/1

2. To check discount of ticked, it can be verified with POST request, like this:
{
    "id":2,
    "price":200
}

and response will be price, with new price
