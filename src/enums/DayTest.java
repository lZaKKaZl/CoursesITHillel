package enums;

/**
 * Created by NewClass2 on 21.08.2015.
 */
public class DayTest {
    public void tellItLikeItIs(Day day){
        switch(day){
            case MONDAY:
                System.out.println("Mondays are bad");
                break;
            case FRIDAY:
                System.out.println("Fridays are better");
                break;
            case SATURDAY:

            case SUNDAY:
                System.out.println("Weekends are best");
                break;
            default:
                System.out.println("Midweek days are so-so");
                break;
        }
    }
    public boolean isItBadDay(int day){
        if (day == ){
            return true;
        }else {
            return false;
        }

    }

    public static void main(String[] args) {
        DayTest dayTest = new DayTest();
        Day monday = Day.MONDAY;
        dayTest.tellItLikeItIs(monday);

        dayTest.tellItLikeItIs(Day.SATURDAY);
        dayTest.tellItLikeItIs(Day.SUNDAY);

        for(Day day : Day.values()){
            System.out.print(day.name() + " ");
            dayTest.tellItLikeItIs(day);
        }

    }
}
