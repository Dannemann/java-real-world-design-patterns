# Strategy design pattern (behavioral)

Enables selecting and swapping algorithms at runtime. Provides different implementations of the same behavior.

For this example, imagine you are an employee at Google Maps working on route calculations. Users can select from various transport types, such as car, bike, or motorcycle. Each algorithm (strategy) calculates the optimal route based on the chosen transport type and GPS coordinates.

Much like the Template design pattern, Strategy is basically an OOP feature demonstration, specifically **dynamic binding**. It illustrates how to use abstract classes or interfaces to implement this concept correctly, using an example centered around a family of interchangeable algorithms.
