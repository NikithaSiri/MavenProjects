package com.lti.stringmethods;

public class StringCompare {
public static void main(String[] args) {
	String s1="Hello";// java-db
	String s2= "Hello";
	System.out.println(s1.hashCode());
	System.out.println(s2.hashCode());
	String s3=new String("Hello"); //gui
	System.out.println(s3.hashCode());
	System.out.println(s1==s3); //false
	System.out.println(s1.contentEquals(s3)); //true
}
}



	/*String Str = new String(" Aelxander");   
       //first way of implementation
        System.out.print("The extracted substring: "); 
        System.out.println(Str.substring(3)); 
                
        //2nd way of implementation 
//        System.out.println(Str.substring(3,5));//xa //start from 3rd index and  ends till 5 th index 
//        System.out.println(Str.substring(3,8));//xande
//        System.out.println(Str.substring(3,9));//xander
//       
        System.out.println(Str.substring(2,6));//exan
        
        //System.out.println(Str.substring(3,10));index out of bound 
        
        //start index is inclusive and end index is exclusive.
        //In other words, 
        //start index starts from 0 whereas end index starts from 1.
        
        //eg use to remove Mr. Mrs. Rs etc 
        
===========================================


/*char x='p';

String word;

//assign the string to the variable:
word = "Alexander";
//preform some actions on the string:

//1. retrieve the length by calling the
//length method:

int length = word.length();
System.out.println("Length: " + length);

//2. use the case functions:
System.out.println("toUpperCase: " + word.toUpperCase());
System.out.println("toLowerCase: " + word.toLowerCase());

//3. use the trim function to eliminate leading
//or trailing white spaces:
word = word.trim();
System.out.println("trim:" + word);

//4. check for a certain character using indexOf()
System.out.println("indexOf('e'): " + word.indexOf('e'));    
System.out.println("Last 'e' is located at index "+word.lastIndexOf('e'));

//5. print out the beginning character using charAt()
System.out.println("first character: " + word.charAt(5));

//6. make the string shorter   

 word = word.substring(3,8);
 System.out.println("shorter string: " + word);
*/
