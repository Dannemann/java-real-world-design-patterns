# Decorator design pattern (structural)

Use the Decorator design pattern to dynamically augment the behavior of an object without subclassing it. Useful when you don't know how many functionalities will be created and attached to it over time. Consider Java's `Stream` and `File` APIs: you start with a core central object (the stream or the file), but you might not know how many additional layers of 'decorators' will be created. Think of Decorators as creating "plugins" for a class.

### About the code


