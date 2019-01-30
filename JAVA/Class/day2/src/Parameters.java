class Parameters {

	public static void main(String[] args) {
		
		int i = 0;
		String str = "Hello";
		Variables v = new Variables();
		
		Variables v2 = method(i, str, v);
	}
	
	static Variables method(int p1, String p2, Variables p3) {
		
		p1 += 100;
		p2 += ", World";
		p3.b = 42;
		
		p3 = new Variables();
		
		return p3;
	}
}
