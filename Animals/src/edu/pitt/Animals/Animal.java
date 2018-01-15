package edu.pitt.Animals;

public abstract class Animal implements IMovable{
	private String age;
	private String color;
	private String type;
	private int weight;
	private int minimumWeight = 1;
	
	public Animal(String age, String color, String type, int weight,int miniumWeight){
	
		
	}
	public Animal() {
		
	}
	public Animal(String age, String color, int weight, int minimumWeight){
	
		
	}
	public void eat(){
		
		weight++;
	}
	
	public int getWeight(){
		if(weight < minimumWeight) {
			System.out.println("Weight is not valid");
			return (Integer) null;
		}
		else 
			return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}
	@Override
	public void move() {
		 
	}
	public String output()
	   {
	      String str;
	      
	     str = "\nWeight: " + weight 
	      	 + "\nMinimum Weight: " + minimumWeight;
	      return str;
		
	}
}
