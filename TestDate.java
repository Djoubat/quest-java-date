import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;
 

class TestDate {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please fill a day (1-31) :");
        int day = sc.nextInt();
        System.out.println("Please fill a month (1-12) :");
        int month = sc.nextInt();
        System.out.println("Please fill a year :");
        int year = sc.nextInt();
        sc.close();

        // TODO : your code after this line
        String stringDate = String.valueOf(month) + "-" + String.valueOf(day) + "-" + String.valueOf(year);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM-dd-yyyy"); // "dd/MM/yyyy" "MM-dd-yyyy"
        Date date = null;
        try {
			date = simpleDateFormat.parse(stringDate);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        Calendar calendar = new GregorianCalendar(year, month - 1, day);
        		
        
        if(date != null) {
        	System.out.println("The date is : " + date);
        	System.out.println("The date is : " + simpleDateFormat.format(date));
        	System.out.println("The day of week is :" + calendar.get(Calendar.DAY_OF_WEEK) );
        }
        System.out.println("Fin !!");
        	
        
    }
}