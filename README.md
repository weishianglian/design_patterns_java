# Structural Patterns
## Facade, Decorator, Composite and Flyweight

### Facade
  > Facade is a structural design pattern that provides a simplified interface to a library, a framework, or any other complex set of classes.

### Decorator
> Decorator is a structural design pattern that lets you attach new behaviors to objects by placing these objects inside special wrapper objects that contain the behaviors.

### Composite
> Composite is a structural design pattern that lets you compose objects into tree structures and then work with these structures as if they were individual objects.

### Flyweight
> Flyweight is a structural design pattern that lets you fit more objects into the available amount of RAM by sharing common parts of state between multiple objects instead of keeping all of the data in each object.

## Compile Commands

```sh
javac -d dacade/target facade/HomeTheaterTestDrive.java
javac -d decorator/target decorator/StarbuzzCoffe.java
javac -d composite/target composite/MenuTestDrive.java
javac -d flyweight/target flyweight/Demo.java
```
## Execute Commands
```sh
javac -cp dacade/target facade.HomeTheaterTestDrive
javac -cp decorator/target decorator.StarbuzzCoffe
javac -cp composite/target composite.MenuTestDrive
javac -cp flyweight/target flyweight.Demo
```