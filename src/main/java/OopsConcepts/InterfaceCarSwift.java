package OopsConcepts;

public class InterfaceCarSwift implements InterfaceCarOld
{
	@Override
	public void start()
	{
		System.out.println("Swift <<<>>> Start");
	}

	@Override
	public void stop()
	{
		System.out.println("Swift <<<>>> Stop");
	}

	@Override
	public void gear()
	{
		System.out.println("Swift <<<>>> Gear");
	}
	
	public void theftSafety()
	{
		System.out.println("Swift <<<>>> Theft Safety");
	}
}
