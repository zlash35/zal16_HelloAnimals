package edu.pitt.Animals;
public class Bird extends Animal{

	public Bird(String age, String color, String type, int weight, int minimumWeight) {
		super(age, color, type, weight, minimumWeight);
		// TODO Auto-generated constructor stub
	}
	public Bird() {
		
	}
	
	public  Bird(String age, String color, int weight, int minimumWeight) {
		
	}
	
	public void fly() {
													//Every time their animal moves they lose weight.
			int weight;
			weight = getWeight() -2;
			setWeight(weight);
			System.out.println("Your bird flew forward");
	}
	
	
		
	
	
}
