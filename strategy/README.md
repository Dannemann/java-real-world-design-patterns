# Strategy design pattern (behavioral)

Enables selecting and swapping algorithms at runtime. Provides different implementations of the same behavior.

For this example, imagine you are an employee at Google Maps working on route calculations. Users can select from various transport types, such as car, bike, or motorcycle. Each algorithm (strategy) calculates the optimal route based on the chosen transport type and GPS coordinates. 

### About the code

Package `com.google.maps.routing` contains the strategies that would be from Google Maps application and API. Package `org.example` contains the client code from someone who would use the Google Maps API.

### Related patterns

If you're familiar with the Adapter design pattern, you'll notice some similarities. Both patterns address different implementations of the same logical operations. The key difference is that the Adapter pattern works with existing or third-party code, which you may not always have access to. It adapts different method names across various classes to a unified interface. In contrast, the Strategy pattern inherently uses the same method names across different classes, as they follow the Strategy interface.
