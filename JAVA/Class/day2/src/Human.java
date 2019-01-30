

class Human {
	String name;
	int age;
	float height;
	float weight;
	
	void eat() { weight += 0.5f; }
	void diet() {weight -= 0.1f; }
}

class HumanTest {
	public static void main(String[] args) {
		Human bill = new Human();
		bill.name = "Bill Gates";
		bill.weight = 70.f;
		bill.eat();
		System.out.println(bill.name + " is " + bill.weight + "kg");

	}
}
