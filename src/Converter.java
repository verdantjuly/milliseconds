package src;

public class Converter implements Unit {

    public static int UnitConverter(String unit) {
        if (unit.equals("day")) {
            return day;
        } else if (unit.equals("hour")) {
            return hour;
        } else if (unit.equals("minute")) {
            return minute;
        } else if (unit.equals("second")) {
            return second;
        } else
            return 0;

    }
}
