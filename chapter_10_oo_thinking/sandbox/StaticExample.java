public class StaticExample {

	static int numberOfCalls = 0;
	public int myCall;
	
	StaticExample() {
		myCall = StaticExample.numberOfCalls++;
		// System.out.printf("I was called on #%d\n", myCall);
	}

	public String getMyCall() {
		return "My call was " + myCall;
	}
	
	public static void main(String[] args) {
		
		int repeat = 100;
		
		StaticExample[] example = new StaticExample[repeat];
		
		for (int i = 0; i < 100; i++) {
			example[i] = new StaticExample();
		}
		
		System.out.printf("%s\n", example[2].getMyCall());
		System.out.printf("Total call number is %d\n", StaticExample.numberOfCalls);
		System.out.printf("%s\n", example[51].getMyCall());
		System.out.printf("Total call number is %d\n", StaticExample.numberOfCalls);
		System.out.printf("%s\n", example[67].getMyCall());
		System.out.printf("Total call number is %d\n", StaticExample.numberOfCalls);
	}
	
}
