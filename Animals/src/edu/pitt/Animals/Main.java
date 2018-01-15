package edu.pitt.Animals;

import java.util.ArrayList;
import java.util.Iterator;




public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fish bass = new Fish();
		Fish trout = new Fish();
		Mammal monkey = new Mammal();
		Mammal gorilla = new Mammal();
		Bird parrot = new Bird();
		Bird humming = new Bird();
		
		System.out.println();
		bass.setWeight(7);
		trout.setWeight(6);
		monkey.setWeight(55);
		gorilla.setWeight(210);
		parrot.setWeight(3);
		humming.setWeight(2);
		
		ArrayList<Object> animal = new ArrayList<Object>();
		animal.add(bass);
		animal.add(trout);
		animal.add(monkey);
		animal.add(gorilla);
		animal.add(parrot);
		animal.add(humming);
		
	
		Iterator<Object> it = animal.iterator();
		while(it.hasNext()){  
	            Animal st=(Animal)it.next(); 
	            st.eat();
	            st.eat();
	            st.move();
	            System.out.println(st.output()); 
		}        
	            
		
		
		
	}

}
