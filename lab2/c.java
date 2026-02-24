class Time {
    private int hour;
    private int minute;
    private int second;

    public Time(int hour, int minute, int second) {
        if (hour >= 0 && hour <= 23) this.hour = hour;
        if (minute >= 0 && minute <= 59) this.minute = minute;
        if (second >= 0 && second <= 59) this.second = second;
    }


    public String toUniversal() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }

    public String toStandard() {
        String period = hour < 12 ? "AM" : "PM";
        int h = hour % 12;
        if (h == 0) h = 12;
        return String.format("%02d:%02d:%02d %s", h, minute, second, period);
    }

    public void add(Time time) {
        int total = (this.hour + time.hour) * 3600 + (this.minute + time.minute) * 60 + (this.second + time.second);
    
        this.hour = (total / 3600) % 24;
        this.minute = (total % 3600) / 60;
        this.second = total % 60;
    }
}



class Main {
    public static void main(String[] args) {
        Time t = new Time(21, 5, 6);
        System.out.println(t.toUniversal());
        System.out.println(t.toStandard());

        Time t2 = new Time(4, 24, 33);
        System.out.println(t2.toStandard());  
        t2.add(t);

        System.out.println(t2.toStandard());

    }
}