package org.sample;
import java.util.*;
class helper extends TimerTask{
	public static int i = 0;
	public void run()
	{
		System.out.println("Timer ran " + ++i);
	}
}
public class utilexample {
	public static void main(String[] args) {
		Random random = new Random();
		System.out.println(random.nextInt(10));
		System.out.println(random.nextBoolean());
		System.out.println(random.nextDouble());
		System.out.println(random.nextFloat()) ;
		Timer timer = new Timer();
		TimerTask task = new helper();
		timer.schedule(task, 2000, 5000);
	}
}
