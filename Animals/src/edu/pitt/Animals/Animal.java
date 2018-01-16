package edu.pitt.Animals;

public abstract class Animal{
	private String age;
	private String color;
	private String type;
	private int weight;
	private int minimumWeight = 1;
	
	public Animal(String age, String color, String type, int weight,int miniumWeight){
		this.age = age;
		this.color = color;
		this.type = type;
		this.weight = weight;
		this.minimumWeight = minimumWeight;
		
	}
	
	public Animal() {
		// TODO Auto-generated constructor stub
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
	
	public String output()
	   {
	      String str;
	      
	     str = "\nWeight: " + weight 
	      	 + "\nMinimum Weight: " + minimumWeight;
	      return str;
		
	}
}
