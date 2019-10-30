import java.text.DecimalFormat;
import java.util.Scanner;

public class CompoundInterestCalculator {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		double p, r, t;

		System.out.println("Enter the Principal amount ");
		p = s.nextDouble();

		System.out.println("What is the Rate of Interest?");
		r = s.nextDouble()/100;

		System.out.println(
				"How frequent does the interest compounded? Enter the following numbers below: \n 1: Daily (365 days in a Year) "
						+ "\n 2: Monthly (Every Month) \n 3: Quarterly (Every Four Months) \n 4: Half-Yearly (Half a Year) \n 5: Yearly (Every Year)");
		int n = s.nextInt();

		while (n < 1 || n > 5) {
			System.out.println("Invalid number");
			n = s.nextInt();
		}

		switch (n) {
		case 1:
			n = 365;
			break;
		case 2:
			n = 12;
			break;
		case 3:
			n = 3;
			break;
		case 4:
			n = 2;
			break;
		case 5:
			n = 1;
			break;
		}
		System.out.println("Number of years the money invested for?");
		t = s.nextDouble();
		
		while(t < 0.0) {
		System.out.println("The number of year you put is a negative number.");
		t = s.nextDouble();
		}
		double interest = Math.pow(1 + (r/n), n*t);
		double amount = p*interest;
		DecimalFormat tf = new DecimalFormat("#.##");
		double fin = Double.valueOf(tf.format(amount));
		System.out.print("The Amount of future investment is: " + fin);
		}
	}
