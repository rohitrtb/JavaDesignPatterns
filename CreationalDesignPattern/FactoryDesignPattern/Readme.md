Factory Design Pattern:

* This design pattern is also called as Virtual Constructor.
* Basically, this pattern says that just define an interface class or an abstract class for creating an object but let the subclasses decide which class to instantiate. 

Advantages:
* This type of pattern promotes loose coupling between the client code and the actual classes used for modelling. This allows development of the client code to be independent of the subclasses implemented. 
* The typ eof object instantiated is decided by the subclasses at run time. 