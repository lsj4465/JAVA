
class Variables {

	static int a;
	int b;
	
	void method() {
		int c = a+b;
		System.out.println("a = " + a + ", b = " + b + ", c = " +c);
	}
	
	
public static void main(String[] args) {
	Variables v1 = new Variables();
	v1.b = 10;
	
	Variables v2 = new Variables();
	v2.b = 20;
	
	Variables.a = 5;
	
	v1.method();
	v2.method();
}
}