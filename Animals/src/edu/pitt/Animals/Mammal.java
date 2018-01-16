package edu.pitt.Animals;
public class Mammal extends Animal{

	public Mammal(String age, String color, String type, int weight, int minimumWeight) {
		super(age, color, type, weight, minimumWeight);
		// TODO Auto-generated constructor stub
	}
	
	public Mammal() {
		// TODO Auto-generated constructor stub
	}

	public Mammal(String age, String color, int weight, int minimumWeight) {
		
	}
	
	public void run() {
											//Every time their animal moves they lose weight.
		int weight;
		weight = getWeight() -1;
		setWeight(weight);
		System.out.println("Your mammal ran forward");

	}

	
		
	
	
}
