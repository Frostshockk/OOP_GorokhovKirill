import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Arrays;
import java.util.Collections;
import java.io.IOException;
import java.util.ArrayList;

public class task6
{
	public static void main(String[] args){
		int[] mas4 = {1, 2, 3, 9, 4, 5, 15, 3};
		String message = "mubashirhassan";
		String key = "crazy";	
		
		int[] mas10 = {1, 2, 3, 7, 9};
        System.out.println("First exercsise");
		System.out.println(task6_1("Mr. Mojo Rising could be a song title", "Jim Morrison") );
		
		System.out.println("--------------------");
        System.out.println("Second exercsise");
		System.out.println(task6_2("message1", 2));
		
		System.out.println("--------------------");
        System.out.println("Third exercsise");
		System.out.println(task6_3(message, key));
		
		System.out.println("--------------------");
        System.out.println("Fourth exercsise");
		System.out.println(task6_4(mas4, 45));
		
		System.out.println("--------------------");
        System.out.println("Fifth exercsise");
		System.out.println(task6_5(12));
		
		System.out.println("--------------------");
        System.out.println("Sixth exercsise");
		System.out.println(task6_6("0.(6)"));
		
		System.out.println("--------------------");
        System.out.println("Seventh exercsise");
		System.out.println(task6_7("CANIMAKEAGUESSNOW"));
		
		System.out.println("--------------------");
        System.out.println("Eigthth exercsise");
		System.out.println(task6_8(4));
		
		System.out.println("--------------------");
        System.out.println("Nineth exercsise");
		System.out.println(task6_9("aaaj"));
		
		System.out.println("--------------------");
        System.out.println("Tenth exercsise");
		System.out.println(task6_10(mas10));
			
	}
	public static String task6_10(int[] a){
		String o = "[";
		int[][] mas = new int[a.length][a.length];
		int ch = 0;
		for (int i = 0; i< a.length; i++){
			for(int j = 0; j<i; j++){
				if(a[i]+a[j] == 8){
					if(a[j]>a[i]){
						mas[ch][0]=a[i];
						mas[ch][1] = a[j];
						ch++;
					}
					else{
						mas[ch][1]=a[i];
						mas[ch][0] = a[j];
						ch++;
					}
				}
			}
		}
		for(int i = 0; i<mas.length; i++){
			if((mas[i][0]!= 0)&&(mas[i][1]!= 0))
				o +="["+Integer.toString(mas[i][0])+", "+Integer.toString(mas[i][1])+"],";
		}
		if(o.substring(o.length()-1,o.length()).equals(","))
			o = o.substring(0,o.length()-1);
		o+="]";
		if (o.equals("["))
			return "[]";
		else
			return o;
	}
	public static String task6_9(String a){
		HashMap<String, String> map = new HashMap<>();
		int flag = 0;
		int c = 0;
		String[] k = new String[a.length()];
		for(int i = 0; i<a.length(); i++){
			String key = a.substring(i,i+1);
			if (map.containsKey(key))
			{
				int ch = Integer.parseInt(map.get(key));
				ch++;
				map.put(key,Integer.toString(ch));
				
			}
			else{
				map.put(key, "1");
				k[c] = key;
				c++;
			}			
		}
		for(String i:k){
			if (map.containsKey(i))
			{
				if(map.get(i).equals("1")){
					flag = 1;
				}
				else{
					flag = 0;
					break;
				}
			}
		}
		if(flag == 1)
			return "YES";
		else
			return "NO";
	}
	public static String task6_8(int n){
		String o1 = "";
		String o2 = "";
		String o3 = "";
		int dli = (int)Math.pow(2,n);
		for(int i = 0; i<dli; i++){
			int t = i;
			while(t>1){
				o1+=Integer.toString(t%2);
				t/=2;
				
			}
			o1+=Integer.toString(t);
			while(o1.length() < n){
				o1+="0";
				
			}
			for(int j=0;j<o1.length();j++){
				o2+=o1.substring(o1.length()-(j+1),o1.length()-(j));
			}
			if (o2.indexOf("11") == -1)
				o3+=o2;
			o1 = "";
			o2 = "";
			o3+=" ";
		}
		return o3;
	}
	public static String task6_7(String a){
		String o ="";
		int ch =0;
		int k=0;
		int[] mas = {3,1,4,1,5,9,2,6,5,3,5,8,9,7,9};
		for(int i=0;i<a.length();i++){
			
			if(ch == mas[k]){
				o+= " "+a.substring(i,i+1);
				k++;
				ch=1;
				
			}
			else{
				o+= a.substring(i,i+1);
				ch++;
				
			}
			while((i==a.length()-1)&&(ch !=mas[k]))
				a+=a.substring(i,i+1);
		}		
		o+=" ";
		return o;
	}
	public static String task6_6(String a){
		ArrayList<Integer> arrayListVes = new ArrayList<>();
		ArrayList<Integer> arrayListDoPeriod = new ArrayList<>();
		String numberVes = a;
		numberVes = numberVes.replaceAll("\\)", "");
		numberVes = numberVes.replaceAll("\\(", "");
		int osnNum = (int)Double.parseDouble(numberVes);
		int i = 0;
		while (numberVes.charAt(numberVes.length()- i - 1) != '.'){
			int numVs = numberVes.charAt(numberVes.length()- i - 1) - '0';
			arrayListVes.add(numVs);
			i++;
		}
		int j = 0;
		while (a.charAt(a.indexOf('(') - j - 1) != '.'){//chisla pered skobkoi
			int numPeriod = a.charAt(a.indexOf('(') - j - 1) - '0';
			arrayListDoPeriod.add(numPeriod);
			j++;
		}
		Collections.reverse(arrayListDoPeriod);// razvorot chisel
		Collections.reverse(arrayListVes);
		int numVs = 0;
		for (int z = 0;z < i;z++){// nijnii delitel
			numVs = numVs + arrayListVes.get(z) * (int) Math.pow(10,i - 1 - z);
		}
		int numDoPeriod = 0;
		for (int z = 0;z < j;z++){//chislo do period
			numDoPeriod = numDoPeriod + arrayListDoPeriod.get(z) * (int) Math.pow(10, j - (z + 1));
		}
		int raznost = numVs - numDoPeriod;// raznost do tochki i chisla do perioda
		int numPeriod = i - j;//wifri v periode
		int delitel = 0;
		for (int z = 0;z < numPeriod;z++){//verxnee chislo
			delitel = delitel + 9 * (int) Math.pow(10, numPeriod - (z + 1));// 9 - cifri do perioda
		}
		delitel = delitel * (int) Math.pow(10,j);// col 0 ot period
		raznost = raznost + osnNum * delitel;
		int Flag = 1;
		while(Flag == 1){//sokrasheniye drobei
			Flag = 0;
			for (int z = 2;z <= 100;z++){
				if (raznost % z == 0 && delitel % z == 0){
					raznost /= z;
					delitel /= z;
					Flag = 1;
				}
			}
		}
		return raznost + "/" + delitel;
	}
	public static int ch = 2;
	public static int ot = 1;
	public static String task6_5(int a){
		if(a>=ch){
			if(a/ch == 1)
				return "["+Integer.toString(ot)+", "+Integer.toString(ch)+"]";
			else{
				ot*=a;
				a /= ch;
				ch++;
				return task6_5(a);
			}
		}
		else
			return "[]";
	}
	public static ArrayList<Integer> task6_4(int[] a, int n){
		int mi = 0;
		int ma = 0;
		ArrayList<Integer> arrayList2 = new ArrayList<>();
		for (int i = 1;i < a.length;i++)
		{
			for (int j = i - 1;j >= 0;j--)
			{
					if (a[i] * a[j] == n)
					{
						if(i>j){
							mi = j;
							ma = i;
						}
						else{
							mi = i;
							ma = j;
						}
						arrayList2.add(a[mi]);
						arrayList2.add(a[ma]);
						return arrayList2;
					}
			}
		}
		return arrayList2;
	}
	public static String task6_3(String sl, String key){
		char k;
		String t = "";
		String s = "";
		for(int j = 0; j<key.length();j++){
			k = key.charAt(j);
			for(char i='a'; i<='z'; i++){
				if(k == i){
					int c=i;
					t+=Integer.toString(c)+" ";
					s+= i+" ";
				}
			}
		}
		String[] t1 = t.split(" ");
		String[] s1 = s.split(" ");
		String[] s2 = new String[s1.length];
		String[] s3 = new String[s1.length];
		for(int i = 0; i< t1.length;i++){
			int ch=0;
			int a = Integer.parseInt(t1[i].trim());
			for(int j = 0; j< s1.length;j++){
				int a1 = Integer.parseInt(t1[j].trim());
				if(a<a1){
					ch++;
				}
			}
			s2[s1.length-1-ch]=s1[i];
		}
		for(int i = 0; i< s2.length;i++){
			ch = 0;
			for(int j = 0; j< s1.length;j++){
				if(s1[j].equals(s2[i])){
					s3[ch]=Integer.toString(i+1);
				}
				else
					ch++;
			}
			
		}
		String k1;
		String k2;
		ch=0;
		String r;
		HashMap<String, String> slov = new HashMap<>();
		for(int i = 0; i<sl.length();i++){
			for(int j=0;j<key.length(); j++){
				if((i+j+1<=sl.length())&&(ch<sl.length())){
					k2 = sl.substring(i+j,i+j+1);
					k1 = key.substring(j,j+1);
					r = slov.get(k1);
					if (r == null){
						r=k2;
					}
					else
						r+= k2;
					slov.put(k1, r);
					ch++;
				}
			}
			if(i+key.length()-1 < sl.length()-1)
				i+=key.length()-1;
		}
		for(int i = 1; i<key.length();i++){
			String z1 = slov.get(s1[i]);
			String z2 = slov.get(s1[0]);
			if(z1.length() != z2.length()){
				z1+=" ";
				slov.put(s1[i], z1);
			}
		}
		int ch2=1;
		String otve = "";
		for(int i = 0; i<s3.length;i++){
			for(int j=0;j<s3.length;j++){
				if(ch2 == Integer.parseInt(s3[i].trim())){
					otve+=slov.get(s2[i]);
					break;
				}
				else
					ch2++;
			}
			ch2=1;
		}
		return otve;
	}
	public static ArrayList<String> task6_2(String a, int n){
		String k;
		int ch=0;
		String ch1="";
		ArrayList<String> otv = new ArrayList<>();
		if(a.length()>=n){
			for(int i=0;i<a.length()+1;i++){
				if(i<a.length())
					k = a.substring(i,i+1);
				else
					k = "";
				if(ch==n){
					ch=0;
					otv.add(ch1);
					ch1="";
					i--;
				}
				else{
					ch++;
					ch1+=k;
				}
			}
		}
		return otv;
	}
	public static String task6_1(String stroka1,String stroka2){
	String noFound = "noutfond";
	String alphavit = "qwertyuiopasdfghjklzxcvbnm";
	String clStr = "";
	String clAnagram = "";
	stroka1 = stroka1.toLowerCase();
	stroka2 = stroka2.toLowerCase();
	int maxLen = Math.max(stroka1.length(), stroka2.length());
	for (int i=0; i < maxLen; i++){
		if (stroka1.length() > i){
			if (alphavit.contains(stroka1.substring(i, i+1))){
				clStr += stroka1.substring(i, i+1);
			}
		}
		if (stroka2.length() > i){
			if (alphavit.contains(stroka2.substring(i, i+1))){
				clAnagram += stroka2.substring(i, i+1);
			}
		}
	}
	for (int i = 0; i < clStr.length(); i++){
		if (!clAnagram.contains(clStr.substring(i, i+1))){
			continue;
		}
		String anagramCopy = clAnagram;
		int lIndex = i;
		String ans = "";
		while (lIndex < clStr.length()){
			String letter = clStr.substring(lIndex, lIndex + 1);
			if (anagramCopy.contains(letter)){
				ans += letter;
				anagramCopy = anagramCopy.replaceFirst(letter, "");
			}
			else{
				break;
			}
			if (anagramCopy.length() == 0){
				return ans;
			}
			lIndex++;
			}
		}
		return noFound;
	}
			
}