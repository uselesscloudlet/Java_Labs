package com.uselesscloud;

import java.text.DateFormatSymbols;
import java.util.*;

public class FirstLab {

    public static void makeCalendar(int dayOfWeek) {
        Calendar gregorianCalendar = new GregorianCalendar(TimeZone.getDefault());
        Map<String, Integer> monthMap = gregorianCalendar.getDisplayNames(Calendar.MONTH, Calendar.LONG, Locale.ENGLISH);
        LinkedHashMap<String, Integer> sortedMonthMap = new LinkedHashMap<>();
        monthMap.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .forEachOrdered(x -> sortedMonthMap.put(x.getKey(), x.getValue()));

        List<String> weekDays = Arrays.asList(DateFormatSymbols.getInstance().getShortWeekdays());
        Collections.rotate(weekDays, weekDays.size() - (dayOfWeek));

        for (Map.Entry<String, Integer> entry : sortedMonthMap.entrySet()) {
            gregorianCalendar.set(gregorianCalendar.get(Calendar.YEAR),
                    entry.getValue(), Calendar.DAY_OF_MONTH);
            int daysInMonth = gregorianCalendar.getActualMaximum(Calendar.DAY_OF_MONTH);
            System.out.printf("%s %s%n", entry.getKey(), gregorianCalendar.get(Calendar.YEAR));
            for (String day : weekDays) {
                if (day.length() > 0) {
                    System.out.printf("%s ", day);
                }
            }
            System.out.println();
            gregorianCalendar.set(Calendar.DAY_OF_MONTH, 1);
            int firstDay = (gregorianCalendar.get(Calendar.DAY_OF_WEEK) - dayOfWeek + 1);
            while (firstDay <= 0) {
                firstDay += 7;
            }
            System.out.print("    ".repeat(firstDay - 1));
            for (int i = 1; i <= daysInMonth; i++) {
                gregorianCalendar.set(Calendar.DAY_OF_MONTH, i);
                int weekDay = (gregorianCalendar.get(Calendar.DAY_OF_WEEK) - dayOfWeek + 1);
                while (weekDay <= 0) {
                    weekDay += 7;
                }
                int monthDay = gregorianCalendar.get(Calendar.DAY_OF_MONTH);
                if (weekDay == 1 && i > 1) {
                    System.out.println();
                }
                System.out.printf(" %2d ", monthDay);
            }
            System.out.printf("%n%n");
        }
    }

    public static void main(String[] args) {
        int dayOfWeek = 1;
        if (args.length > 0) {
            dayOfWeek = Integer.parseInt(args[0]);
        }
        makeCalendar(dayOfWeek);
    }
}