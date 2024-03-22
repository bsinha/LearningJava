package com.minipod.app;

import com.minipod.model.Abc;
import com.minipod.model.Content;
import com.minipod.model.Genre;

public class Application {

	public static void main(String[] args) {
		Abc abc = new Abc();
		abc.fun();
		
		Content c2= new Content();
		//c2.genre = Genre.ROMANCE;
		
		System.out.println("Content c2::" + c2);

	}

}
