import java.util.Scanner;
public class task4
{
	public static void main(String[] args){
		int[] mas1 = {1, 2, 3, 4, 5, 6, 7};
		int[] mas2 = {6,1, 4, 5, 6, 3};
		int[] mas6 = {9, 4, 26, 26, 0, 0, 5, 20, 6, 25, 5};
        System.out.println("First exercsise");
		System.out.println(task4_1(mas1));
		
		System.out.println("--------------------");
        System.out.println("Second exercsise");
		System.out.println(task4_2(mas2));
		
        System.out.println("--------------------");
        System.out.println("Third exercsise");
		System.out.println(task4_3("hTsii  s aimex dpus rtni.g"));
		
		System.out.println("--------------------");
        System.out.println("Fourth exercsise");
		System.out.println(task4_4("I just!!! can!!! not!!! believe!!! it!!!"));
		
		System.out.println("--------------------");
        System.out.println("Fifth exercsise");
		System.out.println(task4_5("The x ray is excellent"));
		
		
		System.out.println("--------------------");
        System.out.println("Sixth exercsise");
		System.out.println(task4_6(mas6));
		
		System.out.println("--------------------");
        System.out.println("Seventh exercsise");
		System.out.println(task4_7(832));
		
		System.out.println("--------------------");
        System.out.println("Eighth exercsise");
		System.out.println(task4_8("Watch the characters dance!"));
		
		System.out.println("--------------------");
        System.out.println("Nineth exercsise");
		System.out.println(task4_9(1222, 30277));
		
		
		System.out.println("--------------------");
        System.out.println("Tenth exercsise");
		System.out.println(task4_10("hello"));
	}
		public static boolean isAlpha(String n) {
			if((n.equals("o"))||(n.equals("O"))||(n.equals("i"))||(n.equals("I"))||(n.equals("u"))||(n.equals("U"))||(n.equals("y"))||(n.equals("Y"))||(n.equals("e"))||(n.equals("E"))||(n.equals("a"))||(n.equals("A")))
				return false;
			else
				return true;
		}
	
	public static String task4_1(int[] a){
		int flag = 0;
		for(int i = 0; i< a.length; i++){
			if(a[i]%10 == 7){
				flag = 1;
				break;
			}
		}
		if (flag == 1)
			return "Boom!";
		else
			return "There is no 7 in the array";
	}
	public static boolean task4_2(int[] a){
		int n = a.length;
		int flag = 0;
		int j = 0;
		int x = 0;
		int z = a[0];
		for(int i = 2; i<n; i++){
			x = a[i];
			a[0]=x;
			j=i-1;
			while(x<a[j]){
				a[j+1] = a[j];
				j--;
			}
		a[j+1] = x;
		}
		a[0] = z;
		for(int k = 1; k<n; k++){
			if (a[k-1] >a[k]){
				x = a[k-1];
				a[k-1]=a[k];
				a[k]=x;
			}
		}
		for(int i = 1; i<n; i++){
			if (a[i-1] == a[i]-1){
				flag = 1;
			}
			else{
				flag = 0;
				break;
			}
			
		}
		if (flag == 1)
			return true;
		else
			return false;
		
	}
	public static String task4_3(String a){
		int t;
		String q = "";
		for(int i=0;i<a.length();i++){
			String c = a.substring(i,i+1);
			q += a.substring(i+1,i+2)+a.substring(i,i+1);
			i++;
		}
		return q;
	}
	public static String task4_4(String a){
		
		int t = 0;
		while ((a.substring(a.length()-(t+1),a.length()-t).equals("!"))||(a.substring(a.length()-(t+1),a.length()-t).equals("?"))){
			t++;
		}
		return a.substring(0,a.length()-(t-1));

	}
	public static String task4_5(String a){
		String q = "";
		String k;
		String c;
		for(int i=0;i<a.length()-1;i++){
			k = a.substring(i,i+1);
			c = a.substring(i+1,i+2);
			if ((c.equals("x"))&&(k.equals(" ")))
				q+="z";
			else{
				if (c.equals("x"))
					q+="cks";
				else
					q+=c;
			}
		}
		return q;
	}
	public static int task4_6(int[] a){
		int n = a.length;
		String q = "";
		int mi = 0;
		int j = 0;
		int x = 0;
		int z = a[0];
		for(int i = 2; i<n; i++){
			x = a[i];
			a[0]=x;
			j=i-1;
			while(x<a[j]){
				a[j+1] = a[j];
				j--;
			}
		a[j+1] = x;
		}
		a[0] = z;
		for(int k = 1; k<n; k++){
			if (a[k-1] >a[k]){
				x = a[k-1];
				a[k-1]=a[k];
				a[k]=x;
			}
		}
		for(int t = 1; t<n; t++){
			if(mi < a[t]-a[t-1])
				mi = a[t]-a[t-1];
		}
		return mi;
	}
	public static String task4_8(String mas){
		String[] s = mas.split(" ");
		String cl,pr;
		int a = 0;
		int i = 0;
		int e = 0;
		int y = 0;
		int u = 0;
		int o = 0;
		for(String q:s){
			for(int w=q.length()-1;w>0;w--){
			cl = q.substring(w-1,w);
			if ((cl.equals("e"))){
				e++;
				break;}
			else{
				if ((cl.equals("y"))){
					y++;
					break;}
				else{
					if((cl.equals("u"))){
						u++;
						break;}
					else{
						if((cl.equals("i"))){
							i++;
							break;}
						else{
							if((cl.equals("o"))){
								o++;
								break;}
							else{
								if ((cl.equals("a"))){
									a++;
								break;}
							}
						}
					}
				}
			}
			}
		}
		if (e>y){
			if(e>u){
				if(e>i){
					if(e>o){
						if(e>a)
							return "e";
						else
							return "a";
					}
					else{
						if(o>a)
							return "o";
						else
							return "a";
					}
				}
				else{
					if(i>o){
						if(i>a)
							return "i";
						else
							return "a";
					}
					else{
						if(o>a)
							return "o";
						else
							return "a";
					}
				}
			}
			else{
				if(u>i){
					if(u>o){
						if(u>a)
							return "u";
						else
							return "a";
					}
					else{
						if(o>a)
							return "o";
						else
							return "a";
					}
				}
				else{
					if(i>o){
						if(i>a)
							return "i";
						else
							return "a";
					}
					else{
						if(o>a)
							return "o";
						else
							return "a";
					}
				}
			}
		}
		else{
			if(e>u){
				if(e>i){
					if(e>o){
						if(e>a)
							return "e";
						else
							return "a";
					}
					else{
						if(o>a)
							return "o";
						else
							return "a";
					}
				}
				else{
					if(i>o){
						if(i>a)
							return "i";
						else
							return "a";
					}
					else{
						if(o>a)
							return "o";
						else
							return "a";
					}
				}
			}
			else{
				if(y>i){
					if(y>o){
						if(y>a)
							return "y";
						else
							return "a";
					}
					else{
						if(o>a)
							return "o";
						else
							return "a";
					}
				}
				else{
					if(i>o){
						if(i>a)
							return "i";
						else
							return "a";
					}
					else{
						if(o>a)
							return "o";
						else
							return "a";
					}
				}
			}
			
		}
	}
	public static String task4_9(int a, int b){
		String q="";
		String z="";
		if(a>b){
			while (a>10){
				q += Integer.toString(b%10+a%10)+" ";
				b = b/10;
				a = a/10;
				
			}
		q += Integer.toString(b+a)+" ";}
		else{
			while (b>10){
				q += Integer.toString(b%10+a%10)+" ";
				b = b/10;
				a = a/10;
				
			}
			q += Integer.toString(b+a)+" ";
		}
		String[] s = q.split(" ");
	
		for(int i=0;i<s.length;i++){
			z+=s[s.length-1-i];
		}
		return z;
	}
	public static String task4_10(String a){
		a+=" ";
		String o = "";
		String k;
		String c;
		for(int i=0; i<a.length()-1;i++){
			k = a.substring(i,i+1);
			c = a.substring(i+1,i+2);
			o+=k;
			while (k.equals(c)){
				i++;
				c=a.substring(i+1,i+2);
			}
		}
		return o;
	}
	public static int task4_7(int a){
		int q = a;
		int w = 0;
		String n = Integer.toString(a);
		int[] mas = new int[n.length()];
		
		for (int i=0; i<n.length(); i++){
			mas[i] = a%10;
			a = a/10;
			
		}
		int e = n.length();
		int flag = 0;
		int j = 0;
		int x = 0;
		int z = mas[0];
		for(int i = 2; i<e; i++){
			x = mas[i];
			mas[0]=x;
			j=i-1;
			while(x<mas[j]){
				mas[j+1] = mas[j];
				j--;
			}
		mas[j+1] = x;
		}
		mas[0] = z;
		for(int k = 1; k<e; k++){
			if (mas[k-1] >mas[k]){
				x = mas[k-1];
				mas[k-1]=mas[k];
				mas[k]=x;
			}
		}
		for (int i = 0; i<n.length(); i++){
			w += mas[i];
			if(i!=n.length()-1){
			w*= 10;
			}
		}
		
		return q-w;
	}
}