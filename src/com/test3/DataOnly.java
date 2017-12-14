package com.test3;

public class DataOnly {
    public static Date date;
    public static Time time;

    public void show() {
        date.getDate();
        time.getTime();
    }

    public static void main(String[] args) {
        DataOnly datetime = new DataOnly();
        datetime.date.setDate(2017,12,14);
        datetime.time.setTime(17,52,10);
        datetime.show();
    }
}

class Time {//Time class
    public int hour;
    public int minute;
    public int second;

    public void setTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public void getTime() {
        System.out.println(hour + "hour" + minute + "minute" + second + "second");
    }

}

class Date {//Date class
    public int year;
    public int month;
    public int date;

    public void setDate(int year, int month, int date) {
        this.year = year;
        this.month = month;
        this.date = date;
    }

    public void getDate() {
        System.out.println(year + "year" + month + "month" + date + "date");
    }

    //DataOnly dataOnly = new DataOnly();

}