import java.util.Scanner;

public class WeeklyIncomeTax {
	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter weekly income: ");
		double weeklyIncome = scanner.nextDouble();
		
		double taxRate;
		if (weeklyIncome < 500) {
			taxRate = 0.10;
		} else if (weeklyIncome < 1500) {
			taxRate = 0.15;
		} else if (weeklyIncome < 2500) {
			taxRate = 0.20;
		} else {
			taxRate = 0.30;	
		}
		
		double taxWithholding = weeklyIncome * taxRate;
		double averageTaxWithholding = taxWithholding / 7;
		
		System.out.println("Weekly Income: $" + weeklyIncome);
		System.out.println("Tax Withholding Rate: " + (taxRate * 100) + "%");
		System.out.println("Tax Withholding Amount: $" + taxWithholding);
		System.out.println("Avg Daily Tax Withholding: $" + averageTaxWithholding);
		
		scanner.close();
	}

}
