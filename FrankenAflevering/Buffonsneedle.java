import java.util.*;

public class Buffonsneedle {

	public static void main(String[] args) {

		Scanner console = new Scanner(System.in);

		int numberOfSimulations = getInput(console);

		// Computes simulation of needle drop and assigns count
		// to variable numberOfSimulations.

		int successCount = needleSimulation(numberOfSimulations);

		// Computes the computation and approximation of pi.

		double approx = approximation(successCount, numberOfSimulations);

		report(numberOfSimulations, successCount, approx);

	}

	public static int needleSimulation(int iterations) {

		int successCount = 0;

		// Each time the vertical length from the bottom to the top of the
		// needle is greater than the length from the bottom of the needle
		// to the top, the count is increased by 1.

		for (int i = 1; i <= iterations; i++) {

			double distanceToLine = 2 * Math.random();

			double angleToLine = Math.PI * Math.random();

			if (distanceToLine <= Math.sin(angleToLine)) {

				successCount = successCount + 1;

			}

		}

		return successCount;

	}

	public static double approximation(double count, double iterations) {

		// If the count is 0 not enough simulations have been computed,
		// and we aren't allowed to divide by 0. Therefore 0 is returned.
		// Otherwise the approximation of pi computed from the count of
		// needleSimulation and numberOfSimlulations.

		if (count > 0) {

			double result = iterations / count;

			return result;

		}

		else {

			return 0;

		}

	}

	public static void report(int iterations, int count, double result) {

		// So long as the count isn't 0, the computation
		// and approximation of pi is reported back to the user.

		if (count == 0) {

			System.out.print("Successcount = 0. Try bigger number of simulations. ");

		}

		else {

			System.out.print("Computation: " + iterations + " / " + count + "\n" + "Approximation of Pi: " + result);

		}

	}

	public static int getInput(Scanner console) {

		System.out.println("Please specify the number of simulations \n" + "you wish to run: ");

		int n;

		if (console.hasNextInt()) {

			n = console.nextInt();

			return n;

		}

		else {

			System.out.println("Please specify an input in positive integers. \n");

			console.next();

			return getInput(console);

		}

	}

}
