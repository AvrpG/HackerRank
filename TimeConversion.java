import java.util.Scanner;

public class TimeConversion {
    static String timeConversion(String s) {
        String hourPart = s.substring(0,2);
//        System.out.println(hourPart);
        int hourValue = Integer.parseInt(hourPart);
        String minuteSecondPart = s.substring(2,8);
//        System.out.println(minuteSecondPart);
        String amPMpart = s.substring(8);
//        System.out.println(amPMpart);

        int hour24value = 0;

        if(amPMpart.equals("AM")){
            if(hourValue==12)
                hour24value=0;
            else hour24value = hourValue;
        }else if (amPMpart.equals("PM")){
            if (hourValue!=12)
                hour24value = hourValue+12;
            else hour24value = hourValue;
        }
        String result =  ""+hour24value;
        if (result.length()<2)
            result = "0"+result;

        return (result+minuteSecondPart);
        // Complete this function

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = timeConversion(s);
        System.out.println(result);
    }
}
