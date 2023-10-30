public class TestTime {
    public static void main(String[] args) {
        Time time1 = new Time();
        Time time2 = new Time();
        time1.hours = 17;
        time1.minutes = 37;

        time2.hours = 9;
        time2.minutes = 20;
        Time newTime = time1.addTime(time2);
        newTime.printTime();
    }
}

class Time {
    int hours;
    int minutes;


    public Time addTime(Time otherTime) {
        Time newTime = new Time();
        newTime.hours = hours + otherTime.hours;
        newTime.minutes = minutes + otherTime.minutes;

        if (newTime.minutes > 59) {
            newTime.hours += (newTime.minutes / 60);
            newTime.minutes %= 60;
        }
        if (newTime.hours >= 24) {
            newTime.hours %= 24;
        }
        return newTime;
    }

    public void printTime() {
        System.out.println("Time: " + hours + ":" + minutes);
    }
}