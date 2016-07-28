package mylib;

/**
 * Created by bnamora on 7/27/16.
 */

public class MyDate {

    private int year;
    private int month;
    private int day;

    public MyDate() {
        this(System.currentTimeMillis());
    }

    public MyDate(long elapsedTime) {
        setDate(elapsedTime);
    }

    public void setDate(long elapsedTime) {
        year = getYearNow(elapsedTime);
        setDateAndMonth(elapsedTime);
    }

    private int getYearNow(long elapsedTime) {
        return 1970 + getTotalDays(elapsedTime) / 365;
    }

    private int getTotalDays(long elapsedTime) {
        // the divisions of elapsed time
        // to get total days since 1970/1/1
        // doesn't include today,
        // as today is a remainder.
        // that's why, total days is added with 1.
        return (int) (elapsedTime / 1000 / 60 / 60 / 24) + 1;
    }

    private void setDateAndMonth(long elapsedTime) {
        int totalDaysThisYear =
                getTotalDaysThisYear(elapsedTime);

        // initialize dateNow & monthNow
        int dateNow = totalDaysThisYear;
        int monthNow = 1;

        // find monthNow and dateNow
        while (monthNow < 13) {
            // cache totalDaysThisYear to dateNow
            // before it's subtracted
            dateNow = totalDaysThisYear;
            totalDaysThisYear -= getDaysInMonth(monthNow, this.year);

            if (totalDaysThisYear <= 0)
                break;

            monthNow++;
        }

        // set day and month
        // month is 0-based
        this.day = dateNow;
        this.month = monthNow - 1;
    }

    private int getTotalDaysThisYear(long elapsedTime) {
        int totalDays = getTotalDays(elapsedTime);
        for (int year = 1970; year < this.year; year++) {
            totalDays = (isLeapYear(year))
                    ? totalDays - 366
                    : totalDays - 365;
        }
        return totalDays;
    }

    private boolean isLeapYear(int year) {
        return year % 400 == 0 ||
                (year % 4 == 0 && year % 100 != 0);
    }

    private int getDaysInMonth(int month, int year) {
        if (month == 1 || month == 3 || month == 5 ||
                month == 7 || month == 8 ||
                month == 10 || month == 12)
            return 31;
        else if (month == 4 || month == 6 ||
                month == 9 || month == 11)
            return 30;
        else
            return isLeapYear(year) ? 29 : 28;
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }
}
