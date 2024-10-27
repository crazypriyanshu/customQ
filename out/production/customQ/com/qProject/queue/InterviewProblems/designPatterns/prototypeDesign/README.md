Prototype design pattern is creational design pattern.
Used when cost of creating an object from scratch is very expensive or complicated and 
you want to avoid re-initializing objects or performing expensive database operations

### How the Prototype Pattern Works:
In the Prototype Pattern, the object that you wish to clone implements a cloneable interface 
(or a similar method), allowing a client to create new instances by cloning the prototype.

## Steps to Implement the Prototype Pattern:
1. Define a Prototype Interface or Abstract Class: This declares a clone() method.
2. Implement Concrete Classes: The classes implement the prototype interface and provide the cloning mechanism.
3. Client: The client clones instances by calling the clone() method.
