public class TimeActivity extends Main implements Runnable{

	Thread t;
	TimeActivity(String str){
		name= str;
		t= new Thread(this, name);
		t.start();
		
	}
	public void run()
	{
		
		try{
			    int i= n;
				permits[i]= true;
				Thread.sleep(5000);
				permits[i]= false;
				
		}
		catch(InterruptedException e){
			System.out.println("ERROR");
		}
		
	}
}
