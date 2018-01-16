package edu.pitt.Animals;
public class Fish extends Animal{
	 
	
	 public Fish(String age, String color, String type, int weight, int minimumWeight) {
		super(age, color, type, weight, minimumWeight);
		// TODO Auto-generated constructor stub
	}

	public Fish() {
		// TODO Auto-generated constructor stub
	}

	public Fish(String age, String color, int weight, int minimumWeight) {
		super();
		
	}
	

	public void swim() {
		 									//Every time their animal moves they lose weight.
		int weight;
		weight = getWeight() -1;
		setWeight(weight); 
		System.out.println("Your fish swam forward");
	}

	
	
	
	
	
	
}
