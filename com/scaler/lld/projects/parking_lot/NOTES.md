

If we take just a string (vehicleNumber) as input to generate a ticket, then in 
future if we want to add new params for generating ticket, then we will have multiple overloaded
variants of the generateTicket > TicketController. Simple way to solve this is via DTOs.
DTO: Data Transfer Objects
RequestDTOs will have all the things necessary for getting the request from the client
ResponseDTOs will have all the things that will be sent to the client. We can protect 
attributes like password using this.

Learnings:
1. Use DTOs to get request and send response in the controller.
2. Whenever we want to get data out of DB for an entity, we should do it via service for that entity. Service will internally talk to repository.
3. Put common utility methods inside utils package.
4. We can combine factory with strategy to change strategies at runtime