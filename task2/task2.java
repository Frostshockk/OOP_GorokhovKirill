import java.util.Scanner;
import javafx.application.Application;
public class task2
{
public static void main(String[] args){

System.out.println("First exercsise");
System.out.println("Enter number of house");
Scanner sn = new Scanner(System.in);
int house = sn.nextInt();
System.out.println("Enter lenght of street");
int lenght = sn.nextInt();
int street = task2_1(house, lenght);
System.out.println("Opposite house is = "+street);

Scanner o = new Scanner(System.in);
System.out.println("--------------------");
System.out.println("Second exercsise");
System.out.println("Enter first name and second name");
String name = o.nextLine();
task2_2(name);

System.out.println("--------------------");
System.out.println("Third exercsise");
System.out.println("Enter price");
int price = sn.nextInt();
System.out.println("Enter % of discount");
int discount = sn.nextInt();
double overallprice = tast2_3(price, discount);
System.out.println("Price is = "+overallprice);

System.out.println("--------------------");
System.out.println("Fourth exercsise");
System.out.println("Enter value elements of array ");
String DifArray = o.nextLine();
int difference = task2_4(DifArray);
System.out.println("Difference is = "+difference);

System.out.println("--------------------");
System.out.println("Fifth exercsise");
System.out.println("Enter first number");
int fn = sn.nextInt();
System.out.println("Enter second number");
int snn = sn.nextInt();
System.out.println("Enter third number");
int tn = sn.nextInt();
int CountOfSameNum = task2_5(fn, snn, tn);
System.out.println("Count of same number is = "+CountOfSameNum);

System.out.println("--------------------");
System.out.println("Sixth exercsise");
System.out.println("Enter sentence");
String sentence = o.nextLine();
String ReverseText = task2_6(sentence);
System.out.println("Reverse text  = "+ReverseText);

System.out.println("--------------------");
System.out.println("Seventh exercsise");
System.out.println("Enter first number");
int fn1 = sn.nextInt();
System.out.println("Enter second number");
int sn2 = sn.nextInt();
System.out.println("Enter third number");
int tn3 = sn.nextInt();
int Diff = task2_7(fn1, sn2, tn3);
System.out.println("Difference of salary is = "+Diff);

System.out.println("--------------------");
System.out.println("Eight exercsise");
System.out.println("Enter array of letters");
String ArrayOfLeters = o.nextLine();
String sentence1 = task2_8(ArrayOfLeters);
if (sentence1 == "true")
	System.out.println("true");
else
	System.out.println("false");

System.out.println("--------------------");
System.out.println("Nineth exercsise");
System.out.println("Enter a sentence");
String bomb = o.nextLine();
String NextMove = task2_9(bomb);
if (NextMove == "true")
	System.out.println("DUCK!");
else
	System.out.println("Relax, there's no bomb.");

System.out.println("--------------------");
System.out.println("Tenth exercsise");
System.out.println("Enter first sentence");
String FirstArray = o.nextLine();
System.out.println("Enter second sentence");
String SecondArray = o.nextLine();
String equality = task2_10(FirstArray,SecondArray);
System.out.println("Answer is = "+equality);
}
public static int task2_1(int house, int lenght){
int street = (lenght*2-house+1);
return street;
}
public static void task2_2(String name){
	String[] name2 = name.split(" ");
System.out.println(name2[1]+" "+name2[0]);
}
public static double tast2_3(int n, int p){
	return n-(n*p/100.0);
}
public static int task2_4(String sp){
	String[] s = sp.split(" ");
	int max = 0;
	int min = 10000;
	for (String y :s) {
		int i = Integer.parseInt (y.trim ());
		if ( i > max) 
			max =  i;
		if (i<min)
			min = i;
	} 
	return max-min;
}
public static int task2_5(int num1, int num2, int num3){
	if(num1 == num2){
		if (num2 == num3){
			return 3;
		}
		else
			return 2;
	}
	else{
		if (num2 == num3)
			return 2;
		else{
			if (num1 == num3)
				return 2;
			else
				return 0;
		}
	}
		
}
public static String task2_6(String sente){
	String result = "";
	for(int i = sente.length()-1; i>=0; i--) { 
		result += sente.charAt(i); 
	} 
	result += " "; 
return result; 
} 
public static int task2_7(int num1, int num2, int num3){
	int max = 0;
	int min = 0;
	if (num1 > num2){
		if (num1>num3)
			max = num1;
		else
			max = num3;
	}
	else{
		if (num2>num3)
			max = num2;
		else
			max = num3;
	}
	if (num1 < num2){
		if (num1<num3)
			min = num1;
		else
			min = num3;
	}
	else{
		if (num2<num3)
			min = num2;
		else
			min = num3;
	}
	return max-min;
}
public static String task2_8(String sente){
	int count_x = 0;
	int count_o = 0;
	for(int i = sente.length()-1; i>=0; i--) {
		String letter = sente.substring(i,i+1);
		if(letter.equals("x"))
				count_x++;
		else{
			if (letter.equals("o"))
				count_o++;
		}
	}
	
	if (count_o == count_x)
		return "true";
	else
		return "false";
}
public static String task2_9(String sente){
	String[] string = sente.split(" ");
	int t = 0;
	for (String word:string) {
		if ((word.toLowerCase().equals("bomb."))||(word.toLowerCase().equals("bomb,"))||(word.toLowerCase().equals("bomb?"))||(word.toLowerCase().equals("bomb"))||(word.toLowerCase().equals("bomb!"))){
			t = 1;
			break;
		}	
	}
	if (t == 1)
		return "true";
	else
		return "false";

}
public static String task2_10(String text1,String text2){
	int Askii1 = 0;
		char[] array1 = text1.toCharArray();
		for (int i = 0;i <= text1.length()-1;i++)
		{
			Askii1 = Askii1 + (int) array1[i];
		}
		
		int Askii2 = 0;
		char[] array2 = text2.toCharArray();
		for (int i = 0;i <= text2.length()-1;i++)
		{
			Askii2 = Askii2 + (int) array2[i];
		}
		if (Askii1 == Askii2)
			return "true";
		else
			return "false";
}
}
