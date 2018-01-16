package edu.pitt.Animals;

import java.util.ArrayList;
import java.util.Iterator;




public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal bass = new Fish();
		Animal trout = new Fish();
		Animal monkey = new Mammal();
		Animal gorilla = new Mammal();
		Animal parrot = new Bird();
		Animal humming = new Bird();
		
		
		bass.setWeight(7);
		trout.setWeight(6);
		monkey.setWeight(55);
		gorilla.setWeight(210);
		parrot.setWeight(3);
		humming.setWeight(2);
		
		((Fish) bass).swim();
		((Fish) trout).swim();
		((Mammal) monkey).run();
		((Mammal) gorilla).run();
		((Bird) parrot).fly();
		((Bird) humming).fly();
		
		ArrayList<Object> animal = new ArrayList<Object>();
		animal.add(bass);
		animal.add(trout);
		animal.add(monkey);
		animal.add(gorilla);
		animal.add(parrot);
		animal.add(humming);
		
		
		
		Iterator<Object> it = animal.iterator();
		for(int i=0;i<animal.size();i++)    {
			
			Animal st=(Animal)it.next(); 
				st.eat();						// Every time the animal eats they gain weight.
				st.eat();
				st.eat();
				System.out.println(st.output());

            
        }  

		
	}

}
