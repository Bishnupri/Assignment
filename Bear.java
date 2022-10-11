package assignment.java;

public class  Bear{ 
	void eat() {
		System.out.println("I am eating honey ");
	}
	}

	class Bee extends Bear{ 
		void sit() {
			System.out.println("I am sittting  on flower ");
		}
	}

	class Rose extends Bee{ 
		void grew() {
			System.out.println("I grew every morning ");
		}
	}
