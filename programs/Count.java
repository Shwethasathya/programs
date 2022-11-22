
//count number of vowels and consonants in the string

package com.xworkz.basicprograms.programs;

public class Count {

	public static void main(String[] args) {

		String str = "flowers have fragrance";
		int vowelsCount = 0;
		int consonenetsCounts = 0;

		for (int i = 0; i < str.length(); i++) {
			if(str.charAt(i)!=' ') {
				
			
			if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
					|| str.charAt(i) == 'u')

				vowelsCount++;
			
		else{
			consonenetsCounts++;
		}
	}
}
	System.out.println("vowels count in the string is "+vowelsCount);
	System.out.println("Consonents count in the string is "+consonenetsCounts);
	}

}
