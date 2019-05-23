import java.util.Scanner;

public class GitTask2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Give two numbers, smallest first");
		int min = input.nextInt();
		int max = input.nextInt();
		//changed to nextInt
		System.out.println((int)(Math.random()*(max-min))+min);
		//now correct range and starting point for random

	}

}
