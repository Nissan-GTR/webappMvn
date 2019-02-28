package com.oak.grove.coppell;

public class Welcome {
	
	public String sayHola(String str, String sex) {
		
		String greetings = "";
		if(sex.contains("Male")) {
			System.out.println("Hola Amigo " + str);
			greetings = "Hola Amigo " + str;
		}else {
			System.out.println("Hola Amiga " + str);
			greetings = "Hola Amiga " + str;
		}
			
		return greetings;
	}

}
