import jdk.swing.interop.SwingInterOpUtils;

import javax.imageio.metadata.IIOInvalidTreeException;
import java.util.*;


public class days {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int[] numDays = {31,28,31,30,31,30,31,31,30,31,30,31};
        System.out.println("a month, day and year in number form");
        int month = kb.nextInt();
        kb.nextLine();
        int day  = kb.nextInt();
        kb.nextLine();
        int year = kb.nextInt();
        kb.nextLine();

        int wasteYears = (year-1)%400;
        int wasteDays = 0;

        while(wasteYears != 0){
            if(wasteYears >= 100){
                wasteDays += 5;
                wasteYears -=100;
            }else{
                int leapQ = wasteYears/4;
                int normQ = (wasteYears-leapQ);
                wasteDays += (leapQ*2) + normQ;
                wasteYears = 0;
            }
        }

        int monthDays = 0;
        for(int i = month-1; i > 0;i--) {
            if (year % 4 == 0 && i == 2) {
                if(year%100==0&&year%400!=0){
                    monthDays += 28;
                }else{
                    monthDays += 29;
                }
            } else {
                monthDays += numDays[i-1];
            }
        }
        wasteDays = (wasteDays + monthDays + day)%7;
        String[] daysOfTheWeek = {"Sunday" , "Monday" , "Tuesday" , "Wednesday" , "Thursday " , "Friday" , "Saturday"};

        System.out.println(daysOfTheWeek[wasteDays]);




    }

}
