public enum Month {
    JANUARY(0, "January", 31),
    FEBRUARY(1, "February", 28),
    MARCH(2, "March", 31),
    APRIL(3, "April", 30),
    MAY(4, "May", 31),
    JUNE(5, "June", 30),
    JULY(6, "July", 31),
    AUGUST(7, "August", 31),
    SEPTEMBER(8, "September", 30),
    OCTOBER(9, "October", 31),
    NOVEMBER(10, "November", 30),
    DECEMBER(11, "December", 31);

    int indexNo;
    String displayName;
    int defaultNoOfDays;

    Month(int indexNo, String displayName, int defaultNoOfDays)
    {
        this.indexNo = indexNo;
        this.displayName = displayName;
        this.defaultNoOfDays = defaultNoOfDays;
    }

    public int getNoOfDays(Year year) {

        if(getMonth(this.indexNo) == FEBRUARY)
        {
            if(year.isLeapYear())
            {
                return defaultNoOfDays + 1;
            }
            else
            {
                return defaultNoOfDays;
            }
        }

        return defaultNoOfDays;
    }

    static Month getMonth(int monthIndex)
    {
        for(Month m : Month.values())
        {
            if(m.indexNo == monthIndex)
            {
                return m;
            }
        }

        return null;
    }
}
