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
		List<TaxPayer> list = new ArrayList<>();
		
		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			System.out.println("Tax payer #" + i + " data:");
			System.out.print("Individual or Company (i/c)? ");
			char ch = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Anual Income: ");
			Double annualIncome = sc.nextDouble();
			if(ch == 'i') {
				System.out.print("Health expenditures: ");
				double outlay = sc.nextDouble();
				list.add(new Individual(name, annualIncome, outlay));
			}
			else if(ch == 'c'){
				System.out.print("Number of Employees: ");
				int numberEmp = sc.nextInt();
				list.add(new Company(name, annualIncome, numberEmp));
			}
		}
		
		double sum = 0.0;
		System.out.println("\nTAXES PAID:");
		for(TaxPayer tp : list) {
			double tax = tp.tax();
			System.out.println(tp.getName() + ": $ " + String.format("%.2f", tp.tax()));
			sum += tax;
		}
		
		System.out.println("\nTOTAL TAXES: $" + String.format("%.2f", sum));
		
		
		sc.close();
	}

}
