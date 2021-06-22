public class Palindrome {
 public static void main(String[] args) {
	 
String s ="madam";
if (isPalindrome(s))
	System.out.println("Word " +s+ " is Palindrome");
else
	System.out.println("Word " +s+ " isn't Palindrome");

String w ="java";
if (isPalindrome(w))
	System.out.println("Word " +w+ " is Palindrome");
else
	System.out.println("Word " +w+ " isn't Palindrome");

String o ="Palindrome";
if (isPalindrome(o))
	System.out.println("Word " +o+ " is Palindrome");
else
	System.out.println("Word " +o+ " isn't Palindrome");

String n ="racecar";
if (isPalindrome(n))
	System.out.println("Word " +n+ " is Palindrome");
else
	System.out.println("Word " +n+ " isn't Palindrome");

String v ="apple";
if (isPalindrome(v))
	System.out.println("Word " +v+ " is Palindrome");
else
	System.out.println("Word " +v+ " isn't Palindrome");

String a ="kayak";
if (isPalindrome(a))
	System.out.println("Word " +a+ " is Palindrome");
else
	System.out.println("Word " +a+ " isn't Palindrome");

String t ="song";
if (isPalindrome(t))
	System.out.println("Word " +t+ " is Palindrome");
else
	System.out.println("Word " +t+ " isn't Palindrome");

String x ="noon";
if (isPalindrome(x))
	System.out.println("Word " +x+ " is Palindrome");
else
	System.out.println("Word " +x+ " isn't Palindrome");

}

public static String reverseString(String s)
{
String result = "";
	for(int i = s.length()-1; i>=0; i--) { 
		result += s.charAt(i); 
	} 
	result += ""; 
return result; 
}
public static boolean isPalindrome(String s)
{
	String result= reverseString(s);
	return s.equals(result);
}
}