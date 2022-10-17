package randomNumbers;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class GenerateRandomNumbers {
	public static void main(String args[]) {
		Random random = new Random();
		int counter = 500;
		int[] numbers = new int[counter];

		for (int i = 0; i < counter; i++) {
			numbers[i] = random.nextInt(500);
			System.out.println(i);
		}

		Arrays.sort(numbers);

		Scanner scanner = new Scanner(System.in);
		System.out.println("Please provide the Nth number: ");
		int n = scanner.nextInt();

		System.out.println("The Nth smallest number is = " + numbers[n]);
	}

}
