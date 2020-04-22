package interfaceInjava;

public interface Example7 extends Example5, Example6{
	
	
	void tset56();
	
	default void test1(){
		System.out.println("I am default");
	}
	
	static void test2(){
		System.out.println("I am static");
	}

}
