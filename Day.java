public enum Day {
    SUNDAY(1),
    MONDAY(2),
    TUESDAY(3),
    WEDNESDAY(4),
    THRUSDAY(5),
    FRIDAY(6),
    SATURDAY(7);

    int dayIndex;

    Day(int dayIndex)
    {
        this.dayIndex = dayIndex;
    }

    public static Day getDay(int day, Month month, int year)
    {

        int t[] = { 0, 3, 2, 5, 0, 3,
                5, 1, 4, 6, 2, 4 };

        year -= month.indexNo < 3? 1: 0;
        return getDay((year + year / 4
                - year / 100
                + year / 400
                + t[month.indexNo - 1] + day)
                % 7);
    }

    static Day getDay(int dayIndex)
    {
        for(Day d : values())
        {
            if(d.dayIndex == dayIndex)
            {
                return d;
            }
        }

        return null;
    }
}
