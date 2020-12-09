package be.pxl.h2.oef2;

import java.sql.Timestamp;

public class TimeStamp
{
    private int seconds, clockHours, clockMinutes, clockSeconds;

    public TimeStamp(int seconds)
    {
        this(seconds,0,0,0);
    }

    public TimeStamp(int seconds, int clockHours, int clockMinutes, int clockSeconds)
    {
        this.seconds = seconds;
        this.clockHours = clockHours;
        this.clockMinutes = clockMinutes;
        this.clockSeconds = clockSeconds;
    }

    //copy constructor
    public TimeStamp(TimeStamp copytime)
    {
        this(copytime.clockHours, copytime.clockMinutes, copytime.clockSeconds, copytime.seconds);
    }


    //control function
    public void timeCheck(int seconds)
    {

    }

    //change variables
    public void changeHours(int clockHours)
    {
        this.clockHours = clockHours;
    }

    public void changeMinutes(int clockMinutes)
    {
        this.clockMinutes = clockMinutes;
    }

    public void changeSeconds(int clockSeconds)
    {
        this.clockSeconds = clockSeconds;
    }
}
