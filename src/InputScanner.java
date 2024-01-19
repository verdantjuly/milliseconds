package src;

import java.util.Arrays;
import java.util.Scanner;

public class InputScanner {

    public int number;
    public int multiplier;
    public String unit;
    public String[] unitArray = { "day", "hour", "minute", "second" };

    public InputScanner(int number, int multiplier) {
        this.number = number;
        this.multiplier = multiplier;
    }

    public void Scanner() {
        System.out.println("단위를 입력하세요. day / hour / minute / second");
        Scanner scanner = new Scanner(System.in);
        ;
        unit = scanner.nextLine();
        int isUnit = Arrays.binarySearch(unitArray, unit);
        if (isUnit < 0) {
            Scanner();
        } else {
            multiplier = Converter.UnitConverter(unit);
            System.out.println("얼마나 변환하고 싶은지 Milliseconds로 입력하세요!");
            number = scanner.nextInt();
        }

        scanner.close();
    }

}
