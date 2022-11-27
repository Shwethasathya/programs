package com.xworkz.inheritancec.string;

public class StringMethods {

	

	public static void main(String[] args) {
		String tripleRide = "Triple Riding is a Kannada movie released on 25 Nov, 2022. The movie is directed by Mahesh Gowda and featured Aditi Prabhudeva, Rachana Inder, Sadhu Kokila and Rangayana Raghu as lead characters";
		int digits = 0;

		tripleRide=tripleRide.toLowerCase();
		System.out.println(tripleRide);
		
		tripleRide=tripleRide.toUpperCase();
		System.out.println(tripleRide);
		
		System.out.println("splitting the string by comma");
	    String[] split = tripleRide.split(",");
	    for (int i=0; i < split.length; i++)
	    {
	    	
	      System.out.print(split[i]);
	    }
		
	    
	    char[] ch=tripleRide.toCharArray();
	    
	    for (char c : ch) {
	    	  
            System.out.println(c);
        }
	    String s1="Triple Riding is a Kannada movie released on 25 Nov, 2022. The movie is directed by Mahesh Gowda and featured Aditi Prabhudeva, Rachana Inder, Sadhu Kokila and Rangayana Raghu as lead characters\";";
	    char[] car = s1.toCharArray();
	    System.out.println("The string is:" + s1);
	    
	    System.out.println("duplicate characters in the string are");
	    for (int i = 0; i < s1.length(); i++) {
	    	   for (int j = i + 1; j < s1.length(); j++) {
	    	      if (car[i] == car[j]) {
	    	         System.out.print(car[j] + " ");
	    	         break;
	    	      }
		}
	}
	    System.out.println("number of digits in the string is");
	    
        for (int i = 0; i < tripleRide.length(); i++) {
            if (Character.isDigit(tripleRide.charAt(i)))
                digits++;
        }
        System.out.println("Total number of Digits = "
                           + digits);
	}
}
