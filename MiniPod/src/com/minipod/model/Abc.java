package com.minipod.model;

public class Abc {
	public void fun() {
		Content c1= new Content(); // Called default constructor
		//c1.setId(1);
		c1.getId();
		c1.setType(Type.AUDIO);
		c1.getType();
		c1.getLanguage();
		
		Content c2= new Content();
		
		
		c2.getType();
		Producer p1= new Producer();
		p1.setName("Pooja");
		c2.setProducer(p1);
		//c1.size = 20;
		//c1.id = 1;
		//c1.genre= Genre.ACTION;
		//System.out.println("Content is here:: "+ c1.size +c1.genre+ c1.id);
		System.out.println("Content c1::" + c1.toString());
	}
	
	public void fun2() {
		
		UserProfile user1= new UserProfile("Pooja", "pooja@contact.com");
		UserProfile user2 = new UserProfile(21, "SOnu");
	}

}
