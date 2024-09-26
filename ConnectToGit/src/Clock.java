
public class Clock {
	//instance variables
	private int hr;
	private int min;
	private int sec;
	//constructor method (overloaded) Constructors must be called same as class
	
	public Clock() {
		
		setTime(0,0,0);
		
	}
	
	public Clock(int hours, int minutes, int seconds) {
		
		hr=hours;
		min=minutes;
		sec=seconds;
		
	}
	//setter--mutator methods
	public void setHour(int hours) {
		
		hr=hours;
		
	}
	//getter--accessor methods
	public int getHour() {
		
		return hr;
		
	}
	//regular methods
	public void setTime(int hr, int min, int sec) {
		
		if (hr>=0 && hr<24)
			this.hr=hr;
		else
			this.hr=0;
		if (min>=0 && min<60)
			this.min=min;
		else
			this.min=0;
		if (sec>=0 && sec<60)
			this.sec=sec;
		else
			this.sec=0;
		
	}
	
	public void incrementHours() {
		
		hr++;
		if (hr>23)
			hr=0;
		
	}
	
	public void incrementMinutes() {
		
		min++;
		if (min>59) {
			min=0;
			incrementHours();
		}
		
	}
	
	public void printTime() {
		
		System.out.print("\n");
		if (hr<10)
			System.out.print(0);
		System.out.print(hr);
		System.out.print(":");
		if (min<10)
			System.out.print(0);
		System.out.print(min);
		System.out.print(":");
		if (sec<10)
			System.out.print(0);
		System.out.print(sec);
		
	}
	//to string: override
	public String toString() {
		
		String pClock="hour: ";
		
		if (hr<10)
			pClock+="0";
		pClock+=""+hr+"\nminute: ";
		if (min<10)
			pClock+="0";
		pClock+=""+min+"\nseconds: ";
		if (sec<10)
			pClock+="0";
		pClock+=""+sec+"\n";
		return pClock;
		
	}
	
}
