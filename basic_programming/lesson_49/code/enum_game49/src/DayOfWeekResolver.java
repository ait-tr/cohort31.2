import java.util.Scanner;

public class DayOfWeekResolver {

    private static Scanner scanner = new Scanner(System.in);

    public void start(){
     do {
         DayOfWeek dayOfWeek = readDayOfWeek();
         System.out.println("It is " + isDayOff(dayOfWeek));
         System.out.println("Do you want to check another day ? enter yes or any other word if not");
     }while (scanner.nextLine().equalsIgnoreCase("yes"));
        System.out.println("Thank you for using our service!");
      scanner.close();
    }

    private DayOfWeek readDayOfWeek(){
        DayOfWeek enumDay = null;
        boolean flag;
      do {
          flag = false;
          System.out.println("Enter day of the week");
          String day = scanner.nextLine();


          try {
              enumDay = DayOfWeek.valueOf(day.toUpperCase());
          } catch (IllegalArgumentException e) {
              System.out.println("Please enter a valid day of week");
              flag = true;

          }
      }while(flag);
      return enumDay;
    }

    private boolean isDayOff(DayOfWeek day){
        switch (day){
            case SATURDAY:
            case SUNDAY: return true;
            default: return false;
        }

    }
}
