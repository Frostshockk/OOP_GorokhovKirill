import java.util.Scanner;
public class task5
{
	public static void main(String[] args){
		String[] mas = {"trance", "recant"};
		int[] mas5 = {5, 4, 2, 1};
		
		String[] mas6 = {"53%", "79%"};
        System.out.println("First exercsise");
		System.out.println(task5_1("ADA","ASA"));
		
		System.out.println("--------------------");
        System.out.println("Second exercsise");
		System.out.println(task5_2("A4", "B2"));
		
		System.out.println("--------------------");
        System.out.println("Third exercsise");
		System.out.println(task5_3("3773hjj743"));
		
		System.out.println("--------------------");
        System.out.println("Fourth exercsise");
		System.out.println(task5_4(mas, "recant"));
		
		System.out.println("--------------------");
        System.out.println("Fifth exercsise");
		System.out.println(task5_5(mas5));
		
		System.out.println("--------------------");
        System.out.println("Sixth exercsise");
		System.out.println(task5_6(mas6));
		
		System.out.println("--------------------");
        System.out.println("Seventh exercsise");
		System.out.println(task5_7("4of Fo1r pe6ople g3ood th5e the2"));
		
		System.out.println("--------------------");
        System.out.println("Eighth exercsise");
		System.out.println(task5_8(9328,456));
		
		System.out.println("--------------------");
        System.out.println("Nineth exercsise");
		System.out.println(task5_9("New York", "December 31, 1970 13:40", "Beijing"));
		
		System.out.println("--------------------");
        System.out.println("Tenth exercsise");
		System.out.println(task5_10(5));
		
		
	}
	public static boolean isAlpha(String name) {
	return name.matches("[0-9]+");}
	public static boolean task5_1(String a, String c){
		String k;
		String k_c;
		boolean Flag = false;
		int j = 0;
		int n = a.length();
		int c_j = 0;
		String b ="";
		String b_c="";
		for(int i =0; i<n;i++){
			k = a.substring(i,i+1);
			while((!(k.equals(a.substring(j,j+1))))&&(j<i+1)){
			j++;}
			b+=Integer.toString(j+1)+" ";
			
			j=0;
		}
		for(int i =0; i<n;i++){
			k = c.substring(i,i+1);
			while((!(k.equals(c.substring(c_j,c_j+1))))&&(c_j<i+1)){
			c_j++;}
			b_c+=Integer.toString(c_j+1)+" ";
			c_j=0;
		}
		for(int i=0;i<n;i++){
			k = b.substring(i,i+1);
			k_c = b_c.substring(i,i+1);
			if (k.equals(k_c))
				Flag = true;
			else
				Flag = false;
		}
		return Flag;
	}
	public static int task5_3(String a){
		String k;
		String q="";
		for(int i = 0; i<a.length();i++){
			k = a.substring(i,i+1);
			if(isAlpha(k))
				q+=k;
		}
		int i = Integer.parseInt (q.trim ());
		if(i<10)
			return 1;
		else
			return 1+task5_3(Integer.toString(i/10));
		
	}
	public static int task5_4(String[] a, String b){
		String k;
		String k_m;
		int ch_ot = 0;
		int ch = 0;
		for(String h:a){
			k = h;
			for(int m = 0;m<b.length();m++){
				k_m = b.substring(m,m+1);
				if (k.indexOf(k_m) != -1){
					int q = k.indexOf(k_m);
					String d = k.substring(0, q) + k.substring(q+ 1);
					k=d;
					ch++;
				}
			}
			if(ch==h.length()){
				if(ch == 6)
					ch_ot += 54;
				else{
					if(ch == 5)
						ch_ot += 3;
					else{
						if(ch == 4)
							ch_ot+=2;
						else{
							if(ch == 3)
								ch_ot+=1;
							else
								ch_ot+=0;
						}
					}
				}
			}
			ch=0;
		}
		return ch_ot;
	}
	public static int task5_5(int[] a){
		int ch = 1;
		int ma = 0;
		for (int i=0; i<a.length-1; i++){
			if((a[i]+1 == a[i+1])||(a[i]==a[i+1]+1)){
				ch++;
			}
			else{
				if(ch>ma)
					ma = ch;
				ch = 0;
			}
		}
		return ma;
	}
	public static boolean task5_10(int a){
		int a1= a;
		boolean flag = false;
		int min = 999999;
		int ch = 0;
		String d = Integer.toString(a);
		int dlina = d.length();
		int[] b = new int[dlina];
		while (a>10){
			b[dlina-1-ch] = a%10;
			if (a%10< min){
				min = a%10;
			}
			a /= 10;
			ch++;
		}
		b[dlina-1-ch] = a%10;
		if(dlina == 1)
			flag = true;
		for (int i = 0; i<dlina-1; i++){
			if((b[i]<b[i+1])||(b[i]==0)||(b[i+1]==0))
				flag = true;
			else
				flag = false;
		} 
		
		
		return flag;
		
	}
	public static int task5_8(int a,int b){
		int ch_a = 0;
		int o = 0;
		String d_a = Integer.toString(a);
		int dlina_a = d_a.length();
		int[] a1 = new int[dlina_a];
		int ch_b = 0;
		String d_b = Integer.toString(b);
		int dlina_b = d_b.length();
		int[] b1 = new int[dlina_b];
		while(a>10){
			a1[dlina_a-1-ch_a] = a%10;
			a /= 10;
			ch_a++;
		}
		a1[dlina_a-1-ch_a] = a%10;
		while(b>10){
			b1[dlina_b-1-ch_b] = b%10;
			b /= 10;
			ch_b++;
		}
		b1[dlina_a-1-ch_a] =  b%10;
		for(int i = 0; i<dlina_a; i++){
			for(int j = 0; j<dlina_b; j++){
				if(a1[i]<b1[j]){
					a1[i]=b1[j];
				}
			}
			for(int j = 0; j<dlina_b; j++){
				if(a1[i]==b1[j]){
					b1[j]=0;
				}
			}
		}
		for(int i = 0;i<dlina_a-1; i++){
			o+=a1[i];
			o*=10;
		}
		o +=a1[dlina_a-1];
		return o;
	}
	public static String task5_7(String a){
		String[] mas = a.split(" ");
		String o = "";
		String[] mass = new String[mas.length];
		for(String j:mas){
			for (int i = 0; i<j.length(); i++){
				String slo = j.substring(i,i+1);
				if(isAlpha(slo)){
					int chi = Integer.parseInt(slo.trim())-1;
					int q = j.indexOf(slo);
					mass[chi]= j.substring(0, q) + j.substring(q+1);
				}
			}
		}
		for(String i:mass){
			o+=i+" ";
		}
		return o;
	}
	public static String task5_6(String[] a){
		int ch =0;
		int sum =0;
		for(String i:a){
			String k = i.substring(0,i.length()-1);
			int c = Integer.parseInt(k.trim());
			ch ++;
			sum += c;
		}
		int sr = sum/ch-5;
		int x = sr*(ch+1)-sum;
		return Integer.toString(x)+"%";
	}
	public static String task5_9(String st, String data, String pr){
		double vrem_pu = 0;
		double ob_m  = 0;
		double ob_h = 0;
		String[] gor = {"Los Angeles","New York","Caracas","Buenos Aires","London","Rome","Moscow","Tehran","New Delhi","Beijing","Canberra"};
		String[] months = {"January","February","March","April","May","June","July","August","September","October","November","December"};
		double[] tim = {-8,-5,-4.5,-3,0,1,3,3.5,5.5,8,10};
		for(int i = 0; i<gor.length;i++){
			for(int j = 0; j<gor.length;j++){
				if((gor[i].equals(st))&&(gor[j].equals(pr))){
					vrem_pu = tim[j]-tim[i];
				}
			}
		}
		String[] time = data.split(", ");//[MM+DD],[YYYY+Time]
		String[] da = time[0].split(" ");//[MM],[DD]
		int d = Integer.parseInt(da[1].trim());
		String me = da[0];
		String[] vrem = time[1].split(" ");//[YYYY],[Time]
		int g = Integer.parseInt(vrem[0].trim());
		String[] vr = vrem[1].split(":");//[HH],[MinMin]
		double h = Double.parseDouble(vr[0].trim());
		double m = Double.parseDouble(vr[1].trim());
		if(vrem_pu%1>0){
			ob_m = m+(vrem_pu%1*60);
			ob_h = h+(vrem_pu/1);
		}
		else
			ob_m = m;
			ob_h = h+vrem_pu;
		while(ob_m>60){
			ob_m-=60;
			ob_h+=1;
		}
		while(ob_h>24){
			ob_h-=24;
			d++;
		}
		int h1 = (int)ob_h;
		int m1 = (int)ob_m;
		int index = 0;
		for(int i = 0; i<months.length;i++){
			if(months[i].equals(me)){
				index = i;
			}
		}
		if((d>=29)&&(index == 1)){
			me = months[2];
			index++;
			d=1;
		}
		else{
			if((d>=31)&&((index == 3)||(index == 5)||(index == 8)||(index == 10))){
				me = months[index+1];
				index++;
				d=1;
			}
			else{
				if((d>=32)&&((index == 0)||(index == 2)||(index == 4)||(index == 6)||(index == 7)||(index == 9))){
					me = months[index+1];
					index ++;
					d=1;
				}
				else{
					if((d>=32)&&(index == 11)){
					me = months[0];
					index = 0;
					d=1;
					g+=1;}
				}
			}
		}
		String otvet;
		if((m1<10)&&(h1<10)){
			 otvet = Integer.toString(g)+"-"+Integer.toString(index+1)+"-"+Integer.toString(d)+" 0"+Integer.toString(h1)+":0"+Integer.toString(m1);
		}
		else{
			if((m1<10)&&(h1>=10))
				 otvet = Integer.toString(g)+"-"+Integer.toString(index+1)+"-"+Integer.toString(d)+" "+Integer.toString(h1)+":0"+Integer.toString(m1);
			else{
				if((m1>=10)&&(h1<10))
					 otvet = Integer.toString(g)+"-"+Integer.toString(index+1)+"-"+Integer.toString(d)+" 0"+Integer.toString(h1)+":"+Integer.toString(m1);
				else{
					 otvet = Integer.toString(g)+"-"+Integer.toString(index+1)+"-"+Integer.toString(d)+" "+Integer.toString(h1)+":"+Integer.toString(m1);
				}
			}
		}
		return otvet;
	}
	public static String task5_2(String a,String b){
		String ot = "";
		int indx1 = 0;
		int indx2 = 0;
		int indy1 = 0;
		int indy2 = 0;
		String[] x = {"A","B","C","D","E","F","G","H"};
		String[] y = {"0","1","2","3","4"};
		String x1 = a.substring(0,1);
		String y1 = a.substring(1,2);
		String x2 = b.substring(0,1);
		String y2 = b.substring(1,2);
		for(int i = 0; i<x.length; i++){
			if(x[i].equals(x1))
				indx1 = i;
			if(x[i].equals(x2))
				indx2 = i;
		}
		for(int i = 0; i<y.length; i++){
			if(y[i].equals(y1))
				indy1 = i;
			if(y[i].equals(y2))
				indy2 = i;
		}
		int xr = Math.abs(indx1-indx2);
		int yr = Math.abs(indy1-indy2);
		ot+=x[indx1]+y[indy1]+"-";
		
		if(indy1-indy2<0){
			for(int i=0;i<yr;i++){
				indy1++;
				ot+=x[indx1]+y[indy1]+"-";
			}
		}
		else{
			for(int i=0;i<yr;i++){
				indy1--;
				ot+=x[indx1]+y[indy1]+"-";
			}
		}
		if(indx2-indx1>0){
			for(int i=0;i<xr;i++){
				indx1++;
				ot+=x[indx1]+y[indy1]+"-";
			}
		}
		else{
			for(int i=0;i<xr;i++){
				indx1--;
				ot+=x[indx1]+y[indy1]+"-";
			}
		}
		return ot.substring(0,ot.length()-1);
		
	}
	
}