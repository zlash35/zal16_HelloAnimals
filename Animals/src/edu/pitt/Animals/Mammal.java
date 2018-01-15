package edu.pitt.Animals;
public class Mammal extends Animal implements IMovable{

	public Mammal(String age, String color, String type, int weight, int minimumWeight) {
		super(age, color, type, weight, minimumWeight);
		// TODO Auto-generated constructor stub
	}
	
	public Mammal() {
		// TODO Auto-generated constructor stub
	}

	public Mammal(String age, String color, int weight, int minimumWeight) {
		
	}
	
	public void run () {
		System.out.println("This mammal ran ");

	}

	
	@Override
	public void move() {
		int weight;
		weight = getWeight() -1;
		setWeight(weight);
		//System.out.println("The mammal ran " + place + " spot"); I included these because I wasn't sure exactly how the program is 
		// supposed to work.
		
		
	}
	
}
