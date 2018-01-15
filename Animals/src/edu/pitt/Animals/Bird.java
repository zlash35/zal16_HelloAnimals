package edu.pitt.Animals;
public class Bird extends Animal implements IMovable{

	public Bird(String age, String color, String type, int weight, int minimumWeight) {
		super(age, color, type, weight, minimumWeight);
		// TODO Auto-generated constructor stub
	}
	public Bird() {
		
	}
	
	public  Bird(String age, String color, int weight, int minimumWeight) {
		
	}
	
	public void fly () {
		System.out.println("This bird flew ");
	}
	
	@Override
	public void move(){
		int weight;
		
		weight = getWeight() -2;
		setWeight(weight);
		//System.out.println("The bird flew " + place + " spot"); I included these because I wasn't sure exactly how the program is 
		// supposed to work.
		
		
	}
	
}
