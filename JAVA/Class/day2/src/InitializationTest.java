class InitializationTest {

	static {
		System.out.println("static initialization block");
	}
	
	{
		System.out.println("instance initialization block");
	}
	
	InitializationTest(){
		System.out.println("constructor");
	}
	
	public static void main(String[] args) {
		System.out.println("Before creation instance");
		new InitializationTest();
		System.out.println("After creation instance");
	}
}
