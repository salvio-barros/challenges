package hackerrank.desafios;

import java.io.IOException;
import java.util.Scanner;

public class TimeConversion {

    /*
     * Complete the timeConversion function below.
     */
    static String timeConversion(String s) {
        /*
         * Write your code here.
         */
    	
    	//07:05:45PM
    	Integer hour = Integer.parseInt(s.substring(0, 2));
    	String hourString = s.substring(0, 2);
    	boolean useZeroHour = false;
    	String minutes = s.substring(3, 5);
    	String seconds = s.substring(6,8);
    	String format = s.substring(8,10);
    	    	
    	if(format.contentEquals("PM") && hour.compareTo(12) < 0) {
    		hour = hour + 12;
    	} else if(format.equals("AM") && hour.compareTo(12) == 0 ) {
    		useZeroHour = true;
    	}
    	if(useZeroHour) {
    		return "00"+":"+minutes+":"+seconds;
    	} else {
    		if(format.contentEquals("AM")){
    			return hourString+":"+minutes+":"+seconds;
    		} 
    		return hour+":"+minutes+":"+seconds;
    	}
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        //BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scan.nextLine();

        String result = timeConversion(s);

        System.out.println(result);
       
    }
}
