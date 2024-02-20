package com.hw2.run;

import com.hw2.model.dto.Animal;
import com.hw2.model.dto.Monkey;
import com.hw2.model.dto.Tiger;
import com.hw2.model.service.Zoo;

public class Run {

	public static void main(String[] args) {
		
		Zoo zoo = new Zoo();
		
		Animal tiger =  new Tiger("호랑이");
		Animal monkey =  new Monkey("원숭이");
		
		zoo.addAnimal(tiger);
		zoo.addAnimal(monkey);
		
		zoo.displayMenu();
		
	}
}