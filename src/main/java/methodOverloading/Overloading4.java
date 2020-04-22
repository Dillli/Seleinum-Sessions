package methodOverloading;

public class Overloading4 {

	void add() {

	}

	static int add(int a, int b) {

		return a + b;

	}

	static double add(int a, int b, int c) {

		return a + b + c;
	}

	public void main(String[] args) {

		
     add(10,20);
     add();
     add(10,20,30);
	}
}
