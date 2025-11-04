package arrayExceptionHandling;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        String[] daysOfWeek = {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
        Scanner sc = new Scanner(System.in);
        System.out.println("which day are you looking for:  ");
        int day = sc.nextInt();
        checkDaysOfWeek(day, daysOfWeek);
    }

    private static void checkDaysOfWeek(int day, String[] daysOfWeek) {
        try {
            if(day >= daysOfWeek.length){
                throw new Exception("Invalid number enter between 0 to 6");
            }
            else {
                System.out.println("The day is "+daysOfWeek[day]);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
