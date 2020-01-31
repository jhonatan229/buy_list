package application;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import listProduct.products;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<products> product = new ArrayList<>();

		System.out.print("how many product you wnat add? ");
		int n = sc.nextInt();
		sc.nextLine();
		for (int i = 1; i <= n; i++) {

			System.out.println("Enter with name product, price and quantity: ");
			
			String buy = sc.nextLine();
			String[] list = buy.split(",");

			String name = list[0];
			String price = list[1];
			String quantity = list[2];

			product.add(new products(name, price, quantity));
			
		}

		File path = new File("C:\\out\\summary.csv");

		try (BufferedWriter write = new BufferedWriter(new FileWriter(path))) {
			for (products c : product) {
				write.write(c.getName() + "," + String.format("%.2f", c.totalValue()));
				write.newLine();
			}

		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

		sc.close();
	}

}
