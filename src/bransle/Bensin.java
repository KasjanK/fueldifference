package bransle;

import java.util.ArrayList;
import java.util.Scanner;

public class Bensin {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Tesla vs cars");
		
		ArrayList<Bil> bilar = new ArrayList<Bil>();
		bilar.add(new Bil("Tesla", 1.71f, 7));
		bilar.add(new Bil("Audi", 4.9f, 114));
		bilar.add(new Bil("BMW", 4.8f, 112));
		bilar.add(new Bil("Peugeot", 3.8f, 88));
		
		for (int i = 0; i < bilar.size(); i++) {
			for (int j = i + 1; j < bilar.size(); j++) {
					System.out.println(bilar.get(i).getName() + " vs " + bilar.get(j).getName());
					
					System.out.println(compareAndReturnPercent(bilar.get(i).getFuelConsumption(), bilar.get(j).getFuelConsumption()) + "%");
			}
		}
		
	}
	public static double compareAndReturnPercent(float x, float y) {
		double percent = x / y;
		double roundOff = Math.round(percent * 10000.0) / 100.0;	
		
		return roundOff;
	}
}
