/**
 * Created by gitika on 1/7/18.
 */
public class AngleBetweenHourAndMinuteHand {

    public static void main(String args[]) {
        float hour = 9;
        float minute = 15;
        float minuteAngle = (360/60)*minute;


        // If minute hand moves ahead then hour hand also moves by 30/360 degree for one minute.
        float changeInHourAngleBasedOnMinute = (minute/12.0f)*6;
        float hourAngle = (360/12)*hour + changeInHourAngleBasedOnMinute;
        if (hourAngle - minuteAngle > 180) {
            System.out.println(360 - (hourAngle - minuteAngle ));
        } else {
            System.out.println(hourAngle - minuteAngle);
        }

        System.out.println((30*hour - 5.5 * minute)%360);
    }

}
