package assignment3;

public class tt {
	public static void main(String[] args) {


        int inputSeconds, hour, minute, second = 1;
        minute = 60*second;
        hour = 3600*second;
        inputSeconds = 3695;

        hour = inputSeconds/hour;
        minute = inputSeconds/minute%60;
        second = inputSeconds/hour%60;


        System.out.println(hour + " hours, " +  minute + " minutes, " + second + " seconds");



    }

}
