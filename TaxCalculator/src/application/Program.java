package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Company;
import entities.Individual;
import entities.TaxPayer;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of tax payers: ");
		int N = sc.nextInt();
		
		List<TaxPayer> list = new ArrayList<>();
		
		for(int i = 1; i <= N; i++) {
			System.out.println("Tax payer #" + i + " data:");
			System.out.print("Individual or company (i/c)? ");
			char type = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Anual income: ");
			double anualIncome = sc.nextDouble();
			if (type == 'i') {
			   System.out.print("Health expenditures: ");
			   double healthExpenditures = sc.nextDouble();
			   Individual x = new Individual(name, anualIncome, healthExpenditures);
			   list.add(x);
			}
			else {
				System.out.print("Number of employees: ");
				Integer numberOffEmployees = sc.nextInt();
				list.add(new Company(name , anualIncome, numberOffEmployees));
			}
		}
		
		System.out.println();
		System.out.println("TAXES PAID:");
		for (TaxPayer tp : list) {
			System.out.println(tp.getName() + ": $" + String.format("%2f", tp.tax()));
		}
		
		double sum = 0.0;
		for (TaxPayer tp : list) {
			sum += tp.tax();
		}
		
		System.out.println();
		System.out.println("TOTAL TAXES: $ " + String.format("%.2f", sum));
		
	sc.close();	
		
	}
	
	
}
