// Represents the hh:mm time format using an AM/PM format. 
public class TimeFormat {
	public static void main(String[] args) {
		int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
		// Does the same with the minutes part of the input.
		int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
		String AMPM;
		if (hours >= 12) {
			AMPM = "PM";
			if (hours > 12) {
				hours = hours - 12;
			}
		} else {
			AMPM = "AM";	
		}
		if (minutes < 10) {
			System.out.println(hours + ":0" + minutes + " " + AMPM);
		} else {
			System.out.println(hours + ":" + minutes + " " + AMPM);
		}	
	}
}