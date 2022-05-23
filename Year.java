public class Year {
    int year;

    Year(int year)
    {
        this.year = year;
    }

    public boolean isLeapYear() {
        if (year % 400 == 0
                || (year % 4 == 0
                && year % 100 != 0))
            return true;
        else
            return false;
    }
}
