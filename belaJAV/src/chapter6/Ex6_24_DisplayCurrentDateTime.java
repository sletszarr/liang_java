package chapter6;

/**
 * Created by bnamora on 6/30/16.
 */
public class Ex6_24_DisplayCurrentDateTime {

    public static void main(String[] args) {

        long millis = System.currentTimeMillis();
        int gmtOffset = 7;

        printDateTime(millis, gmtOffset);

    }

    public static void printDateTime(long millis, int gmtOffset) {

        // get time
        int hoursNow = (int) getTotalHours(millis) % 24;
        int hoursGMTOffset = hoursNow + gmtOffset;
        int minutesNow = (int) getTotalMinutes(millis) % 60;
        int secondsNow = (int) getTotalSeconds(millis) % 60;

        // get date
        int todayDate = (int) getDate(millis);
        int todayMonth = (int) getMonth(millis);
        int todayYear = (int) getYear(millis);

        // gmt offset state
        boolean nextDay = hoursGMTOffset >= 24;
        boolean prevDay = hoursGMTOffset <= 0;

        if (nextDay) {
            // december 31
            if (todayDate == 31 && todayMonth == 12) {
                todayDate = 1;
                todayMonth = 1;
                todayYear++;
            }
            // the end of any other month
            else if (todayDate == getDaysInMonth(todayMonth, (long) todayYear)) {
                todayDate = 1;
                todayMonth++;
            }
            else {
                todayDate++;
            }

            // hours now with gmt offset
            hoursGMTOffset %= 24;
        }

        if (prevDay) {
            // january 1
            if (todayDate == 1 && todayMonth == 1) {
                todayDate = 31;
                todayMonth = 12;
                todayYear--;
            }
            // the first of any other month
            else if (todayDate == 1) {
                todayDate = getDaysInMonth(todayMonth - 1, (long) todayYear);
                todayMonth--;
            }
            else{
                todayDate--;
            }

            // hours now with gmt offset
            hoursGMTOffset += 24;
        }

        System.out.println(hoursGMTOffset + ":" + minutesNow + ":" + secondsNow);
        System.out.println(getMonthsName(todayMonth) + " " + todayDate + ", " + todayYear);

    }

    public static long getTotalSeconds(long millis) {
        return millis / 1000;
    }

    public static long getTotalMinutes(long millis) {
        return getTotalSeconds(millis) / 60;
    }

    public static long getTotalHours(long millis) {
        return getTotalMinutes(millis) / 60;
    }

    public static long getTotalDay(long millis) {
        return getTotalHours(millis) / 24;
    }

    public static long getTotalDaysThisYear(long millis) {

        final int START_YEAR_OF_MILLIS = 1970;

        long todayYear = getYear(millis);

        int totalDayBeforeThisYear = 0;

        for (int year = START_YEAR_OF_MILLIS; year < todayYear; year++) {
            if (isLeapYear(year)) {
                totalDayBeforeThisYear += 366;
            }
            else {
                totalDayBeforeThisYear += 365;
            }
        }

        return getTotalDay(millis) - totalDayBeforeThisYear + 1;
    }

    public static long getYear(long millis) {
        return getTotalDay(millis) / 365 + 1970;
    }

    public static long getMonth(long millis){

        long totalDayThisYear = getTotalDaysThisYear(millis);
        long todayYear = getYear(millis);
        long todayMonth=0;

        for (int month = 1; month <= 12; month++) {
            if (totalDayThisYear - getDaysInMonth(month, todayYear) <= 0) {
                todayMonth = month;
                break;

            }

            totalDayThisYear -= getDaysInMonth(month, todayYear);

        }

        return todayMonth;
    }

    public static long getDate(long millis) {

        long totalDayThisYear = getTotalDaysThisYear(millis);
        long todayYear = getYear(millis);
        long todayDate = 0;

        for (int month = 1; month <= 12; month++) {
            if (totalDayThisYear - getDaysInMonth(month, todayYear) <= 0) {
                todayDate = totalDayThisYear;
                break;
            }

            totalDayThisYear -= getDaysInMonth(month, todayYear);

        }

        return todayDate;
    }

    public static boolean isLeapYear(long year) {
        return (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0));
    }

    public static int getDaysInMonth(int month, long year) {

        if (month == 1 || month == 3 || month == 5 || month == 7 ||
                month == 8 || month == 10 || month == 11) {
            return 31;
        }
        else if (month == 4 || month == 6 || month == 9 || month == 11) {
            return 30;
        }
        else {
            if (isLeapYear(year)) {
                return 29;
            }
            else {
                return 28;
            }
        }
    }

    public static String getMonthsName(int month) {

        String[] monthsName = {"January", "February", "March",
                "April", "May", "June", "July", "August",
                "September", "October", "November", "Deceember"
        };

        return monthsName[month - 1];
    }

}
