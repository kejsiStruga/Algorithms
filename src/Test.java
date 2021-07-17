import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

public class Test {
    public static String getYesterdayDate(){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date startDate = new Date();
        Calendar cal = Calendar.getInstance();
        cal.setTime(startDate);
        cal.add(Calendar.DATE, -1);
        Date yesterday = cal.getTime();

        return simpleDateFormat.format(yesterday);
    }
    public static void main(String[] args) {

        String pattern = "yyyy-MM-dd";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        String endDate = simpleDateFormat.format(new Date());


        System.out.println("EndDate: " + endDate);


        System.out.println("StartDate: "+ getYesterdayDate());

        System.out.println(LocalDate.now());

    }

}
