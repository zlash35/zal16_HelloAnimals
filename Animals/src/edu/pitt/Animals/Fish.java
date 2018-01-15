package edu.pitt.Animals;
public class Fish extends Animal implements IMovable{
	 
	
	 public Fish(String age, String color, String type, int weight, int minimumWeight) {
		super(age, color, type, weight, minimumWeight);
		// TODO Auto-generated constructor stub
	}

	public Fish() {
		// TODO Auto-generated constructor stub
	}

	public Fish(String age, String color, int weight, int minimumWeight) {
		
	}
	

	public void swim() {
		 	 
		System.out.println("This fish swam ");
	}

	
	@Override
	public void move() {
		int place = 0;  // I also added this because I didn't know exactly what you wanted. 
		int weight;
		weight = getWeight() -1;
		setWeight(weight);
		//System.out.println("The fish swam " + place + " spot"); I included these because I wasn't sure exactly how the program is 
		// supposed to work.
		
	}
	
	
	
	
}
