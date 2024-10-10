# Strategy (a.k.a. "policy") design pattern (behavioral)

Enables **selecting an algorithm** at runtime.

For this example, imagine you are an employee at Google Maps, working on route calculations. Users can select from various transport types, such as car, bike, or motorcycle. Your task is to calculate the optimal `Route` based on the chosen `TransportType` and GPS coordinates. To accomplish this, you will need a routing algorithm tailored to each available `TransportType`.
