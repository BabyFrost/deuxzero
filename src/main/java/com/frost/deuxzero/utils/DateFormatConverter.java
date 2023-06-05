/**
 *
 */
package com.frost.deuxzero.utils;


import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.*;
import java.util.*;

/**
 *
 */
public class DateFormatConverter {

    /**
     * _DATE_MAX
     */
    public static final String _DATE_MAX = "9999-12-31 23:59:59";

    @SuppressWarnings("deprecation")

    /**
     * MAX_DATE
     */
    public static final Date MAX_DATE = new Date(9999, 1, 1);

    /**
     * _DATE_MIN
     */
    public static final String _DATE_MIN = "1000-01-02 00:00:00";
    /**
     * _fmtYear
     */
    private static final SimpleDateFormat _fmtYear = new SimpleDateFormat("yyyy");
    /**
     * _fmtMonth
     */
    private static final SimpleDateFormat _fmtMonth = new SimpleDateFormat("MM");
    /**
     * time zone
     */
    private static TimeZone _tz = TimeZone.getTimeZone("UTC");

    public static long getTimeZoneUTCAndDSTOffset(Date date, TimeZone timeZone) {
        long timeZoneDSTOffset = 0;
        if (timeZone.inDaylightTime(date)) {
            timeZoneDSTOffset = timeZone.getDSTSavings();
        }
        return timeZone.getRawOffset() + timeZoneDSTOffset;
    }

    public static LocalDate toLocalDate(Date date) {
        return Instant.ofEpochMilli(date.getTime())
                .atZone(ZoneId.systemDefault())
                .toLocalDate();
    }

    public static LocalDateTime toLocalDateTime(Date date) {
        return Instant.ofEpochMilli(date.getTime())
                .atZone(ZoneId.systemDefault())
                .toLocalDateTime();
    }
    
    public static Long toLocalDateTimeInMilliseconds(Date date) {
        LocalDateTime now = DateFormatConverter.toLocalDateTime(date);
        ZonedDateTime zdt = now.atZone(ZoneId.systemDefault());
        return zdt.toInstant().toEpochMilli();
    }

    /**
     * return the first day of the current month
     *
     * @param date
     * @return {@link Date}
     */
    public static Date getFirstDateOfMonth(Date date) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.set(Calendar.DAY_OF_MONTH, cal.getActualMinimum(Calendar.DAY_OF_MONTH));
        return cal.getTime();
    }

    /**
     * return the last day of the current month
     *
     * @param date
     * @return {@link Date}
     */
    public static Date getLastDateOfMonth(Date date) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.set(Calendar.DAY_OF_MONTH, cal.getActualMaximum(Calendar.DAY_OF_MONTH));
        return cal.getTime();
    }

    /**
     *
     * @param date
     * @return
     */
    public static Date getFirstDayOfCurrentWeek(Date date) {
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.HOUR_OF_DAY, 0); // ! clear would not reset the hour of day !
        cal.clear(Calendar.MINUTE);
        cal.clear(Calendar.SECOND);
        cal.clear(Calendar.MILLISECOND);
        cal.set(Calendar.DAY_OF_WEEK, cal.getFirstDayOfWeek());
        return cal.getTime();
    }

    /**
     * Is Date A Business Day?
     *
     * @param cal
     * @return boolean
     */
    public static boolean isBusinessDay(Calendar cal) {

        // check if weekend
        if (cal.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY || cal.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) {
            return false;
        }

        // check if New Year's Day
        if (cal.get(Calendar.MONTH) == Calendar.JANUARY && cal.get(Calendar.DAY_OF_MONTH) == 1) {
            return false;
        }

        // check if Christmas
        if (cal.get(Calendar.MONTH) == Calendar.DECEMBER && cal.get(Calendar.DAY_OF_MONTH) == 25) {
            return false;
        }

        // IF NOTHING ELSE, IT'S A BUSINESS DAY
        return true;
    }

    /**
     * @param date
     * @param amount
     * @return
     */
    public static Date addYears(Date date, int amount) {
        return add(date, Calendar.YEAR, amount);
    }

    /**
     * @param date
     * @param amount
     * @return
     */
    public static Date addMonths(Date date, int amount) {
        return add(date, Calendar.MONTH, amount);
    }

    /**
     * @param date
     * @param amount
     * @return
     */
    public static Date addWeeks(Date date, int amount) {
        return add(date, Calendar.WEEK_OF_YEAR, amount);
    }

    /**
     * @param date
     * @param amount
     * @return
     */
    public static Date addDays(Date date, int amount) {
        return add(date, Calendar.DAY_OF_MONTH, amount);
    }

    /**
     * @param date
     * @param amount
     * @return
     */
    public static Date addHours(Date date, int amount) {
        return add(date, Calendar.HOUR_OF_DAY, amount);
    }

    /**
     * @param date
     * @param amount
     * @return
     */
    public static Date addMinutes(Date date, int amount) {
        return add(date, Calendar.MINUTE, amount);
    }

    /**
     * @param date
     * @param amount
     * @return
     */
    public static Date addSeconds(Date date, int amount) {
        return add(date, Calendar.SECOND, amount);
    }

    /**
     * convert from MMM/dd/YYYY
     *
     * @param dateStr
     * @return
     * @throws ParseException
     */
    public static Date getDatefromString(String dateStr) throws ParseException {
        String actualDate = "";
        String[] dates = dateStr.split("/");
        System.out.println("date leng" + dates.length);
        if (dates.length >= 3) {
            actualDate = dates[1] + "-" + dates[0] + "-" + dates[2];
            DateFormat mediumFormat = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
            return mediumFormat.parse(actualDate);
        }
        return MAX_DATE;
    }

    /**
     * This function is use to convert string date format to data format
     *
     * @param dateStr
     * @return
     */
    public static Date toDate(String dateStr) {
        return toDate(dateStr, null);
    }

    /**
     * Convert string date format with time zone
     *
     * @param dateStr
     * @param tz
     * @return
     */
    public static Date toDate(String dateStr, TimeZone tz) {
        if (tz == null)
            tz = TimeZone.getDefault();
        ZoneId.systemDefault();
        if (dateStr == null)
            return null;

        SimpleDateFormat fmt = null;
        if (dateStr.length() == 19) {
            fmt = new SimpleDateFormat("dd/MM/yyyy");
            fmt.setTimeZone(tz);
        } else {
            fmt = new SimpleDateFormat("dd/MM/yyyy");
        }
        try {
            return fmt.parse(dateStr);
        } catch (ParseException e) {

            return null;
        }
    }

    public static Date toTime(String dateStr, TimeZone tz) {
        if (tz == null)
            tz = TimeZone.getDefault();
        ZoneId.systemDefault();
        if (dateStr == null)
            return null;

        SimpleDateFormat fmt = null;
        if (dateStr.length() == 19) {
            fmt = new SimpleDateFormat("HH:mm");
            fmt.setTimeZone(tz);
        } else {
            fmt = new SimpleDateFormat("HH:mm");
        }
        try {
            return fmt.parse(dateStr);
        } catch (ParseException e) {

            return null;
        }
    }

    /**
     * Convert date to XML format
     *
     * @param date
     * @return
     */
    public static String formatXml(Date date) {
        return formatXml(date, null);
    }

    /**
     * Convert date with time zone to XML format
     *
     * @param date
     * @param tz
     * @return
     */
    public static String formatXml(Date date, TimeZone tz) {
        if (tz == null)
            tz = TimeZone.getDefault();
        if (date.after(getMax()))
            date = getMax();
        SimpleDateFormat outputXmlFmt = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        outputXmlFmt.setTimeZone(tz);
        String result = outputXmlFmt.format(date) + " " + getGMTString(date, tz);
        return result;
    }

    /**
     * @param date
     * @return
     */
    public static String toStringWithoutGMT(Date date) {
        return toStringWithoutGMT(date, null);
    }

    /**
     * @param date
     * @param tz
     * @return
     */
    public static String toStringWithoutGMT(Date date, TimeZone tz) {
        if (tz == null)
            tz = TimeZone.getDefault();
        if (date.after(getMax()))
            date = getMax();
        SimpleDateFormat outputXmlFmt = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        outputXmlFmt.setTimeZone(tz);
        return outputXmlFmt.format(date);
    }

    /**
     * @param date
     * @return
     */
    public static String toDbString(Date date) {
        return toDbString(date, (TimeZone) null);
    }

    /**
     * @param date
     * @param timeZone
     * @return
     */
    public static String toDbString(Date date, String timeZone) {
        return toDbString(date, TimeZone.getTimeZone(timeZone));
    }

    /**
     * @param date
     * @param timezone
     * @return
     */
    public static String toDbString(Date date, TimeZone timezone) {
        if (date == null)
            return null;
        if (timezone == null)
            timezone = TimeZone.getDefault();
        SimpleDateFormat dbFmt = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        dbFmt.setTimeZone(timezone);
        return dbFmt.format(date);
    }

    /**
     * @param date
     * @param timezone
     * @return
     */
    public static String toDateString(Date date, TimeZone timezone) {
        if (date == null)
            return null;
        if (timezone == null)
            timezone = TimeZone.getDefault();
        SimpleDateFormat dbFmt = new SimpleDateFormat("yyyy/MM/dd");
        dbFmt.setTimeZone(timezone);
        return dbFmt.format(date);
    }

    /**
     * @param date
     * @param format
     * @param timezone
     * @return
     */
    public static String toDateString(Date date, String format, TimeZone timezone) {
        if (date == null)
            return null;
        if (timezone == null)
            timezone = TimeZone.getDefault();
        SimpleDateFormat dbFmt = new SimpleDateFormat(format, Locale.getDefault());
        dbFmt.setTimeZone(timezone);
        return dbFmt.format(date);
    }

    public static String toDateString(Date date, String format, TimeZone timezone, Locale locale) {
        if (date == null)
            return null;
        if (timezone == null)
            timezone = TimeZone.getDefault();
        SimpleDateFormat dbFmt = new SimpleDateFormat(format, locale);
        dbFmt.setTimeZone(timezone);
        return dbFmt.format(date);
    }

    /**
     * @return
     */
    public static Date getMax() {
        return toDate(_DATE_MAX);
    }

    /**
     * @return
     */
    public static Date getMin() {
        return toDate(_DATE_MIN);
    }


    /**
     * @param date
     * @param timeZone
     * @return
     */
    public static int getYear(Date date, TimeZone timeZone) {
        if (date == null)
            throw new IllegalArgumentException("date is required.");
        if (timeZone == null)
            timeZone = TimeZone.getDefault();
        _fmtYear.setTimeZone(timeZone);
        try {
            return Integer.parseInt(_fmtYear.format(date));
        } catch (NumberFormatException e) {
            throw new IllegalStateException("Failed to format date : " + e.getMessage());
        }
    }

    /**
     * @param date
     * @param timeZone
     * @return
     */
    public static int getMonth(Date date, TimeZone timeZone) {
        if (date == null)
            throw new IllegalArgumentException("date is required.");
        if (timeZone == null)
            timeZone = TimeZone.getDefault();
        _fmtMonth.setTimeZone(timeZone);
        try {
            return Integer.parseInt(_fmtMonth.format(date));
        } catch (NumberFormatException e) {
            throw new IllegalStateException("Failed to format date : " + e.getMessage());
        }
    }

    /**
     * Get UTC time now
     *
     * @return
     */
    public static Date getUTCNow() {
        int offset = TimeZone.getDefault().getOffset(new Date().getTime());
        return new Date(new Date().getTime() - offset);
    }

    /**
     * Convert date to specified time zone
     *
     * @param date
     * @param tz
     * @return
     */
    public static Date getConvertDate(Date date, TimeZone tz) {
        if (date == null)
            return null;
        int offset = tz.getRawOffset();
        if (tz.inDaylightTime(date))
            offset += 3600000;
        return new Date(date.getTime() + offset);
    }

    /**
     * @param date
     * @param tz
     * @return
     */
    public static Date getUTCDate(Date date, TimeZone tz) {
        if (date == null)
            return null;
        int offset = tz.getRawOffset();
        if (tz.inDaylightTime(date))
            offset += 3600000;
        return new Date(date.getTime() - offset);
    }

    /**
     * @param date
     * @return
     */
    public static String toString(Date date) {
        return getConvertDateString(date, _tz, "dd/MM/yyyy HH:mm:ss");
    }

    /**
     * @param date
     * @param tz
     * @param fmt
     * @return
     */
    public static String getConvertDateString(Date date, TimeZone tz, String fmt) {
        if (date == null)
            return null;
        SimpleDateFormat format = new SimpleDateFormat(fmt);
        Date newDete = getConvertDate(date, tz);
        return format.format(newDete);
    }

    /**
     * @param date
     * @param tz
     * @param add
     * @return
     */
    public static Date addDate(Date date, TimeZone tz, int add) {
        Calendar cal = Calendar.getInstance(tz);
        cal.setTime(date);
        cal.add(Calendar.DATE, add);
        Date toDate = cal.getTime();
        return toDate;
    }

    /**
     * Generate an rfc822 date for use in the Date HTTP header.
     */
    public static String gethttpDate() {
        final String DateFormat = "EEE, dd MMM yyyy HH:mm:ss ";
        SimpleDateFormat format = new SimpleDateFormat(DateFormat, Locale.US);
        format.setTimeZone(TimeZone.getTimeZone(ZoneId.systemDefault()));
        return format.format(new Date());
    }

    /**
     * @param date
     * @return
     */
    public static XMLGregorianCalendar getDateToXMLGregorianCalendar(Date date) {
        XMLGregorianCalendar xmlDate = null;
        GregorianCalendar gc = new GregorianCalendar();

        gc.setTime(date);

        try {
            xmlDate = DatatypeFactory.newInstance().newXMLGregorianCalendar(gc);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return xmlDate;
    }

    /**
     * Checking the date of the end of Month
     *
     * @return true/false
     */
    public static boolean isLastDayOfMonth() {
        try {

            Date today = new Date();
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(today);
            calendar.add(Calendar.MONTH, 1);
            calendar.set(Calendar.DAY_OF_MONTH, 1);
            calendar.add(Calendar.DATE, -1);
            Date lastDayOfMonth = calendar.getTime();
            DateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            if (sdf.format(today).equals(sdf.format(lastDayOfMonth))) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            System.err.println("Checking isLastDayOfMonth error: " + e.getMessage());
            return false;
        }
    }

    /**
     * Checking the date of the end of Month
     *
     * @return true/false
     */
    public static Date getLastDayOfNextMonth() {
        Date lastDateOfNextMonth = null;
        try {
            Date today = new Date();
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(today);
            calendar.add(Calendar.MONTH, 2);
            calendar.set(Calendar.DAY_OF_MONTH, 1);
            calendar.add(Calendar.DATE, -1);
            lastDateOfNextMonth = calendar.getTime();
        } catch (Exception e) {
            System.err.println("getLastDayOfNextMonth error: " + e.getMessage());
        }
        return lastDateOfNextMonth;
    }

    public static Date setTime(final Date date, final int hourOfDay, final int minute, final int second) {
        final GregorianCalendar gc = new GregorianCalendar();
        gc.setTime(date);
        gc.set(Calendar.HOUR_OF_DAY, hourOfDay);
        gc.set(Calendar.MINUTE, minute);
        gc.set(Calendar.SECOND, second);
        return gc.getTime();
    }

    /**
     * This method return a arry of days of the week
     *
     * @param refDate
     * @return
     */
    public static Date[] getDaysOfCurrentWeek(Date refDate) {
        Date[] days = getDaysOfWeek(refDate, Calendar.getInstance().getFirstDayOfWeek());
        return days;
    }

    /**
     * @param refDate
     * @return
     */
    public static Date[] getDaysOfLastWeek(Date refDate) {
        Date[] days = getDaysOfLastWeek(refDate, Calendar.getInstance().getFirstDayOfWeek());
        return days;
    }

    /**
     * @param refDate
     * @return
     */
    public static Date[] getDaysOfLastMonth(Date refDate) {
        Date[] days = getDaysOfLastMonth(refDate, Calendar.getInstance().getFirstDayOfWeek());
        return days;
    }

    /**
     * @param refDate
     * @param firstDayOfWeek
     * @return
     */
    private static Date[] getDaysOfWeek(Date refDate, int firstDayOfWeek) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(refDate);
        calendar.set(Calendar.DAY_OF_WEEK, firstDayOfWeek);
        Date[] daysOfWeek = new Date[7];
        for (int i = 0; i < 7; i++) {
            daysOfWeek[i] = calendar.getTime();
            calendar.add(Calendar.DAY_OF_MONTH, 1);
        }
        return daysOfWeek;
    }

    /**
     * @param refDate
     * @param firstDayOfWeek
     * @return
     */
    private static Date[] getDaysOfLastWeek(Date refDate, int firstDayOfWeek) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(refDate);
        cal.add(Calendar.DAY_OF_YEAR, -7);
        Date[] daysOfWeek = new Date[7];
        for (int i = 0; i < 7; i++) {
            cal.add(Calendar.DAY_OF_YEAR, 1);
            daysOfWeek[i] = cal.getTime();
        }
        return daysOfWeek;
    }

    /**
     * @param refDate
     * @param firstDayOfWeek
     * @return
     */
    private static Date[] getDaysOfLastMonth(Date refDate, int firstDayOfWeek) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(refDate);
        cal.add(Calendar.DAY_OF_YEAR, -30);
        Date[] daysOfMonth = new Date[30];
        for (int i = 0; i < 30; i++) {
            cal.add(Calendar.DAY_OF_YEAR, 1);
            daysOfMonth[i] = cal.getTime();
        }
        return daysOfMonth;
    }

    /**
     * @param date
     * @param tz
     * @return
     */
    private static String getGMTString(Date date, TimeZone tz) {
        DecimalFormat fmt = new DecimalFormat("'GMT'+00':00';'GMT'-00':00'");
        int off = tz.getRawOffset();
        if (tz.inDaylightTime(date))
            off += 3600000;
        off = off / 3600000;
        return fmt.format(off);
    }

    private static Date add(Date date, int calendarField, int amount) {
        if (date == null) {
            throw new IllegalArgumentException("The date must not be null");
        }
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        c.add(calendarField, amount);
        return c.getTime();
    }

}
