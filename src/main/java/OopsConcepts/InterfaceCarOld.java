
package OopsConcepts;

public interface InterfaceCarOld {
	// Full Abstraction
	// In Interface, we can define only and only Abstract Methods. <<No Method
	// Body>>
	// In Interface, we cannot have Concrete Methods.
	// To Achieve 100% Abstraction we use Interface.
	// Through Interface we can achieve Multiple Inheritance.
	// We cannot create an Object for Interface.
	// In Interface, All methods are by Default Public and Abstract.
	// In Interface, we can have only and only Non-Static Methods.

	// In Interface Variables that we declare are by Default Static in Nature.
	// Since we cannot create an object of Interface to access Non-Static Variables.

	int min_speed = 100;

	public void start();

	public void stop();

	public void gear();
}
