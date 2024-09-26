import java.util.Scanner;

public class ClockDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader=new Scanner(System.in);
		Clock myClock=new Clock();
		Clock yourClock=new Clock(23,59,59);
		myClock.setTime(1, 2, 3);
		myClock.setHour(23);
		System.out.println(yourClock.getHour());
		System.out.println(myClock);
		myClock.incrementHours();
		System.out.println(yourClock);
		yourClock.incrementMinutes();
		System.out.println(yourClock);
		yourClock.printTime();
		myClock.printTime();

	}

}
