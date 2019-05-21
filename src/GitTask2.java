import java.util.Scanner;

public class GitTask2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Give two numbers, smallest first");
		int min = input.nextInt();
		int max = input.next();
		System.out.println((int)(Math.random()*max));

	}

}
