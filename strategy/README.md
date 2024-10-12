# Strategy design pattern (behavioral)

Enables **selecting an algorithm** at runtime.

For this example, imagine you are an employee at Google Maps working on route calculations. Users can select from various transport types, such as car, bike, or motorcycle. Each algorithm (strategy) calculates the optimal route based on the chosen transport type and GPS coordinates. 

### About the code

Package `com.google.maps.routing` contains the strategies that would be from Google Maps application and API. Package `org.example` contains the client code from someone who would use the Google Maps API.
