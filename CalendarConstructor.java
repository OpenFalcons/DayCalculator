public class CalendarConstructor {
    
    void printCalendar(Date startDate)
    {
            System.out.println("     Calendar - %d\n\n" + startDate.getYear());

            // Print the current month name
            System.out.println(("\n ------------%s-------------\n" +  startDate.getMonth().displayName));

            // Print the columns
            System.out.println((" Sun   Mon  Tue  Wed  Thu  Fri  Sat\n"));

            // Print appropriate spaces
            int k;
            for (k = 0; k < startDate.day.dayIndex; k++)
                System.out.println(("     "));

            int days = startDate.getMonth().getNoOfDays(startDate.getYear());
            for (int j = 1; j <= days; j++)
            {
                    System.out.println(j);

                    if (++k > 6) {
                        k = 0;
                        System.out.println(("\n"));
                    }
                }
    }

    public static void main(String[] args) {
        Year year = new Year(2016);
        CalendarConstructor calendarConstructor = new CalendarConstructor();

        for (Month m : Month.values()) {

            // Index of the day from 0 to 6
            Day startDay = Day.getDay(1, m, year.year);

            Date date = new Date(startDay, m, year);
            calendarConstructor.printCalendar(date);
        }
    }
}
