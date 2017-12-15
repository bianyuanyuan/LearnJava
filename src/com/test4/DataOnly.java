package com.test4;

public class DataOnly {
    private Date date;
    private Time time;

    public Date getDate() {//get date
        return date;
    }

    private void setDate(Date date) {//set date
        this.date = date;
    }

    public Time getTime() {//get time
        return time;
    }

    private void setTime(Time time) {//set time
        this.time = time;
    }

    //    public DataOnly(Date date,Time time) {
//        this.date=date;
//        this.time=time;
//    }
    private void show() {
        date.getDate();
        time.getTime();
    }

    public static void main(String[] args) {
        Date date = new Date();
        Time time = new Time();
        DataOnly datetime = new DataOnly();
        datetime.setDate(date);
        datetime.setTime(time);
        datetime.date.setDate(2017, 12, 14);
        datetime.time.setTime(17, 52, 10);
        datetime.show();
    }
}

class Time {//Time class
    private int hour;
    private int minute;
    private int second;

    public void setTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public void getTime() {
        System.out.println(hour + "hour " + minute + "minute " + second + "second");
    }

}

class Date {//Date class
    private int year;
    private int month;
    private int date;

    public void setDate(int year, int month, int date) {
        this.year = year;
        this.month = month;
        this.date = date;
    }

    public void getDate() {
        System.out.println(year + "year " + month + "month " + date + "day");
    }

    //DataOnly dataOnly = new DataOnly();

}