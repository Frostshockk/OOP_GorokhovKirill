import java.util.Scanner;
public class task3
{
	public static void main(String[] args){
		
		
		System.out.println("First exercsise");
		Scanner sn = new Scanner(System.in);
		String[][] cities = new String[4][2];
		cities[0][0] = "Nice";
		cities[0][1] = "942208";
		cities[1][0] = "Abu Dhabi";
		cities[1][1] = "1482816";
		cities[2][0] = "Naples";
		cities[2][1] = "2186853";
		cities[3][0] = "Vatican City";
		cities[3][1] = "572";
		for (int i = 0; i<cities.length;i++)
			System.out.println((cities[i][0])+" "+task3_1(cities[i][1]));
		
		System.out.println("--------------------");
        System.out.println("Second exercsise");
		int a = 2;
		String otv2 = task3_2(a);
		String[] st = otv2.split(" ");
		System.out.print(st[0]+ " ");
		double st1 = Double.parseDouble(st[1]);
		System.out.println(String.format("%.2f",st1));
		
		
        System.out.println("--------------------");
        System.out.println("Third exercsise");
		System.out.println(task3_3("rock","paper"));
		
		
		System.out.println("--------------------");
        System.out.println("Fourth exercsise");
		int[] mas = {5, 9, 45, 6, 2, 7, 34, 8, 6, 90, 5, 243};
		System.out.println(task3_4(mas));
		
		
		System.out.println("--------------------");
        System.out.println("Fifth exercsise");
		System.out.println(task3_5("Happy Birthday"));
		
		
		System.out.println("--------------------");
        System.out.println("Sixth exercsise");
		System.out.println(task3_6("Shrink"));
		
		
		System.out.println("--------------------");
        System.out.println("Seventh exercsise");
		System.out.println(task3_7(1, 1, 1, 1, 1));
		
		
		System.out.println("--------------------");
        System.out.println("Eight exercsise");
		System.out.println(String.format("%.2f",task3_8(36.1, 8.6, 3, true)));
		
		
		System.out.println("--------------------");
        System.out.println("Nineth exercsise");
		double[] mas1 = {1, 0, 4, 5, 2, 4, 1, 2, 3, 3, 3};
		System.out.println(String.format("%.2f",task3_9(mas1)));
		
		
		System.out.println("--------------------");
        System.out.println("Tenth exercsise");
		System.out.println(task3_10(243));
		
	}
	public static String task3_1(String a){
			a = String.valueOf((Math.round(Double.valueOf(a)/1000000))*1000000);
			return a;
	}
	
	public static String task3_2(int a){
		double c = a*2;
		double b = Math.sqrt(Math.pow(c,2) - Math.pow(a,2));
		String otv = Double.toString (c)+" " + Double.toString (b);
		return otv;
	}
	public static String task3_3(String i1, String i2){
		if (((i1 == "rock")&&(i2=="paper"))||((i1 == "paper")&&(i2=="scissors"))||((i1 == "scissors")&&(i2=="rock")))
			return "Player 2 wins";
		else{
			if (((i2 == "rock")&&(i1=="paper"))||((i2 == "paper")&&(i1=="scissors"))||((i2 == "scissors")&&(i1=="rock")))
				return "Player 1 wins";
			else{
				if (((i1 == "rock")&&(i2=="rock"))||((i1 == "paper")&&(i2=="paper"))||((i1 == "scissors")&&(i2=="scissors")))
					return "TIE";
				else
					return "";
	}}}
	public static int task3_4(int[] a){
		int ch = 0;
		int chn = 0;
		for (int i = 0; i< a.length; i++)
			if (a[i]%2==0)
				ch += a[i];
			else
				chn+= a[i];
		if (ch>chn)
			return (ch - chn);
		else
			return (chn - ch);
	}
	public static String task3_5(String a){
		String res = "";
		String[] mas1 = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
		String[] Mas1 = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
		for (int i = 0; i<a.length(); i++){
			String c = a.substring(i,i+1);
			for (int k = 0; k < mas1.length; k++){
				if (c.equals(mas1[k]))
					res += Mas1[k];
				else
					if (c.equals(Mas1[k]))
						res += mas1[k];
					else{
						if (c.equals(" ")){
							res += " ";
						break;}
					}
			}	
		}
		return res;
	}
	public static String task3_6(String a){
		String otv = "";
		int flag = 0;
		String[] mas1 = {"B", "C", "D", "F", "G", "H", "J", "k", "L", "M", "N", "P", "Q", "R", "S", "T", "V", "W", "X", "Y", "Z"};
		String[] mas2 = {"A", "E", "I", "O", "U", "Y"};
		String c = a.substring(a.length()-1, a.length());
		for (int k = 0; k < mas1.length; k++){
			if (c.equals(mas1[k])){
				flag = 1;
			break;}
			else
				flag = 0;
		}	
		if (flag == 1)
			otv += a+"inator "+(a.length()*1000);
		else
			otv += a+"-inator "+Integer.toString(a.length()*1000);
		return otv;
	}
	public static boolean task3_7(int a, int b, int c, int w, int h){
		if ((a*b==w*h)||(a*c==w*h)||(b*c==w*h))
			return true;
		else
			return false;
	}
	public static double task3_8(double a, double b,double c, boolean d){
		double k = 1.0+(0.05*c);
		if (d)
			return ((a*100)/(b*k*1.1));
		else
			return ((a*100*100)/(b*k));
	}
	public static double task3_9(double[] a){
		double ch = 0;
		double su = 0;
		for (int i=0;i<a.length;i++){
			ch++;
			su+=a[i];
		}
		return su/ch;
	}
	public static boolean task3_10(int n){
		int su = 0;
		int i = 0;
		String c = "";
		String a = Integer.toString(n);
		for (int k = 0; k<a.length(); k++){
			c = a.substring(k,k+1);
			i = Integer.parseInt (c.trim ());
			su+= i;
		}
		if (su%2==n%2)
			return true;
		else
			return false;
	}
}