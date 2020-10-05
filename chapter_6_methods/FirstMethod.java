import java.util.Scanner;
public class FirstMethod {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		sayHello(3);
		say("Hello?", 3);
		System.out.print("Input string and in next line number of repetitions. ");
		say(input.nextLine(), input.nextInt());
	}
	public static void sayHello(int repeat) {
		for (int i = 0; i < repeat; i++) {
			System.out.printf("%s\n", "Hello!");
		}
	}
	public static void say(String printString, int repetition) {
		for (int i = 0; i < repetition; i++) {
			System.out.printf("%s\n", printString);
		}
	}

}
