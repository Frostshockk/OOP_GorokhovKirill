import java.util.Scanner;
import javafx.application.Application;
public class Main
{
public static void main(String[] args){
	
	exe1();
	
System.out.println("First exercsise");
System.out.println("Enter number of minutes");
Scanner sn = new Scanner(System.in);
int Minutes = sn.nextInt();
int Seconds = exe2(Minutes);
System.out.println("In "+Minutes+" minutes = "+Seconds+" seconds");

System.out.println("--------------------");
System.out.println("Second exercsise");
System.out.println("Enter numbers of 2 points");
int pt2 = sn.nextInt();
System.out.println("Enter numbers of 3 points");
int pt3 = sn.nextInt();
int sumpt = exe3(pt2,pt3);
System.out.println("Overall score is = "+ sumpt);

System.out.println("--------------------");
System.out.println("Third exercsise");
System.out.println("Enter number of wins = ");
int win = sn.nextInt();
System.out.println("Enter numbers of draws");
int draws = sn.nextInt();
System.out.println("Enter number of loses");
int loses = sn.nextInt();
int fbpoints = exe4(win,draws,loses);
System.out.println("Overall score is  = "+ fbpoints);

System.out.println("--------------------");
System.out.println("Fourth exercsise");
System.out.println("Enter number");
int number = sn.nextInt();
exe5(number);

System.out.println("--------------------");
System.out.println("Fifth exercsise");
System.out.println("Enter first number 1/0 (true or false)");
int firstnum = sn.nextInt();
System.out.println("Enter first number 1/0 (true or false)");
int secondnum = sn.nextInt();
exe6(firstnum,secondnum);

System.out.println("--------------------");
System.out.println("Sixth exercsise");
System.out.println("Enter value of volume");
int volume = sn.nextInt();
System.out.println("Enter value of width");
int width = sn.nextInt();
System.out.println("Enter value of hight");
int hight = sn.nextInt();
int overallwalls = exe7(volume,width,hight);
System.out.println("otvet = " + overallwalls);

System.out.println("--------------------");
System.out.println("Seventh exercsise");
System.out.println("Enter a number");
int a = sn.nextInt();
int power  = exe8(a);
System.out.println("otvet = "+ power);

System.out.println("--------------------");
System.out.println("Eight exercsise");
System.out.println("Enter prob");
double prob = sn.nextDouble();
System.out.println("Enter number of prize");
int prize = sn.nextInt();
System.out.println("Enter number of pay");
int pay = sn.nextInt();
exe9(prob,prize,pay);

System.out.println("--------------------");
System.out.println("Nineth exercsise");
System.out.println("Enter count of minutes for fps");
int fpsminutes = sn.nextInt();
System.out.println("Enter value of frames");
int frames = sn.nextInt();
int fps = exe10(fpsminutes,frames);
System.out.println("Value of frames = "+ fps);

System.out.println("--------------------");
System.out.println("Tenth exercsise");
System.out.println("Enter a divisor");
int divisor = sn.nextInt();
System.out.println("Enter a denominator");
int denominator = sn.nextInt();
int remains = exe11(divisor,denominator);
System.out.println("otvet = "+ remains);
}
public static void exe1(){
System.out.println("Hi,word");
}
public static int exe2(int minutes){
return minutes*60;
}
public static int exe3(int pt2,int pt3){
pt2=pt2 *2;
pt3=pt3 *3;
return pt2+pt3;
}
public static int exe4(int win, int draws, int loses){
	win=win * 3;
	loses = 0;
return win+draws+loses;
}
public static void exe5(int number){
if (number%5==0)
{
System.out.println("true");
}
else
System.out.println("false");
}

public static void exe6(int firstnum,int secondnum){
if ((firstnum == 1)&&(secondnum == 1))
{
System.out.println("true");
}
else
System.out.println("false");}


public static int exe7(int volume, int width, int hight){
return (hight*width)/volume;
}

public static int exe8(int a){
return a*a;
}

public static void exe9(double prob,int prize, int pay){
if (prob*prize>pay){
System.out.println("true");
}
else
System.out.println("false");}

public static int exe10(int frames,int fpsminutes){
return frames*fpsminutes*60;
}
public static int exe11(int divisor, int denominator){
while ( divisor > denominator)
{
	divisor = divisor - denominator;
}
return divisor;
}
}