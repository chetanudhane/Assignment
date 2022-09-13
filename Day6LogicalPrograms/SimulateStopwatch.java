package Day6LogicalPrograms;

import java.util.Scanner;

public class SimulateStopwatch {
	public long startTimer = 0;
	public long stopTimer = 0;
	public long elapsed;

	public void start() {
		startTimer = System.currentTimeMillis();
		System.out.println("Start Time is: " + startTimer);
	}

	public void stop() {
		stopTimer = System.currentTimeMillis();
		System.out.println("Stop Time is: " + stopTimer);
	}

	public long getElapsedTime() {
		elapsed = stopTimer - startTimer;
		return elapsed;
	}

	public static void main(String[] args) {
		SimulateStopwatch sw=new SimulateStopwatch();
		Scanner sc = new Scanner(System.in);
		System.out.println("Press 1 to start stopwatch...");
		System.out.println("Press 2 to stop stopwatch...");
		int n=sc.nextInt();
		int m=sc.nextInt();
		if(n==1) {
			sw.start();
		}
		if(m==2) {
			sw.stop();
		}
		
		long tm=sw.getElapsedTime();
		System.out.println("Total Elapsed Time is : "+tm+" sec.");
		
//		System.out.println("Total Elapsed Time(in sec.) is : "+ (tm*1000)+" sec.");

	}

}
