package Assignment2;

public class Stringclassmethod {
	public static void main(String[] args) {
		
		String a = "";
		System.out.println(a.length());
		
		String str = "Hello World";
		System.out.println(str.charAt(4));
		
		String Str="Harshal";
		String b ="Rushi";
		System.out.println(str.equals(b));
		System.out.println(b==a);
		
		String str1 = "java";
		System.out.println(str1.toUpperCase());
		
		String a1 = "Java";
				System.out.println(a1.trim());
		
				String str2 = "Hello World";
				System.out.println(str2.substring(5));
				
				String str3 = "Programming";
				System.out.println(str3.substring(3,6));
				
				String c = "apple";
				System.out.println(c.compareTo("banana"));
				//Substarct form character banana to apple and output is -1
				
				String c1 = "PrefixExample";
				
				if (c1.startsWith("Pre")) {
					System.out.println("the string start with 'pre'");
					
				} else {
					System.out.println("string does not start with 'pre'");

				}
				
				String c3 = "OpenAI";
				System.out.println(c3.indexOf('A'));
				
				String str4 = "abracadabra";
				System.out.println(str4.lastIndexOf('a'));
				
				String d = "Hello";
				System.out.println(d.concat("World"));
				
//				String d2 = "abc";
//				System.out.println(d2.'b','x');
				
				String str5 = "This is a test string.";

				if (str.contains("test")) {
				    System.out.println("The string contains 'test'.");
				} else {
				    System.out.println("The string does not contain 'test'.");
				    
				}
				
				String str6="";
				System.out.println(str6.isEmpty());
				
				//return true 
				
				String str7 = "Test";
				System.out.println(str7.toLowerCase());
				
				
				
				String str8 = "a,b,c";
				String[] elements = str.split(",");

				for (String element : elements) {
				    System.out.println(element);
				}
				
				String str9="Hello";
				System.out.println(str9.equals(new String ("Hello")));
				
				String str10 = "java";
				System.out.println(str10.repeat(3));
				
				
				
	}

}
