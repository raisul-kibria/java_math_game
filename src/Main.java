import java.util.*;
public class Main {
	static Scanner s= new Scanner(System.in);
	static int da, db, dc, dd, de, lev=1;
	static boolean permits[]= new boolean[1000];
	static void meth()
	{
		for(int i=1; i<1000; i++){
			permits[i]=false;
		}
	}
	static int n=1;
	static String name="child";
	public static boolean ans, truth;
	public static void main(String[] args) {
		boolean game=true;
		meth();
		int score=0;
		
		
		while(game){
			Random r= new Random();
			new TimeActivity(name);
			int a= r.nextInt(lev*10);
			truth=(a%2==0);
			int b= r.nextInt(lev*10);
			int c= a+b;
			if(!truth){
				if(c%3==0)
					c+=da;
				else if(c%4==0)
					c+=db;
				else if(c%5==0)
					c+=dc;
				else if(c%6==0)
					c+=dd;
				else
					c+=de;
			}
			
			System.out.println(n +". "+a+" + "+b+" = "+c);
			
			System.out.println("1. True\t\t2.False");
			int as=s.nextInt();
			ans=(as==1);
			if(permits[n]&(ans==truth)){
				score+=10;
				level(score);
				n++;
			}
			else{
				if(!permits[n])
					System.out.println("time over");
				System.out.println("Score: "+ score);
				game=false;
			}
			
		}
	}
	static void level(int num)
	{
		if(num<100){
			da=1;
			db=2;
			dc=3;
			dd=-1;
			de=-2;
			lev=1;
		}
		else if(num<200){
			da=5;
			db=3;
			dc=-6;
			dd=-1;
			de=1;
			lev=3;
		}
		else if(num<300){
			da=10;
			db=12;
			dc=1;
			dd=-20;
			de=-10;
			lev=6;
		}
		else{
			da=101;
			db=100;
			dc=-100;
			dd=-150;
			de=10;
			lev=8;
		}
	}
}
