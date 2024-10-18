# Adapter design pattern (structural)

This example simulates a project in which you are working with libraries from various smart TVs of different brands. Imagine that you are creating a universal remote control that needs to function with Samsung, LG, AOC, and others. This is a perfect use case for the Adapter design pattern because TVs typically perform the same functions in almost all aspects, regardless of the brand.

This is what the Adapter design pattern is about: creating a unified interface when you have a collection of different implementations for the same logical operations.

### About the code

Package `com.smarttv.libs` contains the supposed TV libraries from different brands that you need to work with. Each one has its own brand-specific implementations for the same functionalities, like connecting to Wi-Fi or opening a widget. Package `my.application.adapters` contains the adapters (the actual design pattern) for each brand.
