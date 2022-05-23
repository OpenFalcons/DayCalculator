public class Date {
    Year year;
    Month month;
    Day day;

    Date(Day day, Month m, Year year)
    {
        this.day = day;
        this.month = m;
        this.year = year;
    }

    public Year getYear() {
        return year;
    }

    public void setYear(Year year) {
        this.year = year;
    }

    public Month getMonth() {
        return month;
    }

    public void setMonth(Month month) {
        this.month = month;
    }

    public Day getDay() {
        return day;
    }

    public void setDay(Day day) {
        this.day = day;
    }

}
