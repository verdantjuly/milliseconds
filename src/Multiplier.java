package src;

public class Multiplier extends InputScanner {

    Multiplier(int number, int multiplier) {
        super(number, multiplier);
    }

    public void Multiply() {
        super.Scanner();
        System.out.println("Milliceconds : " + number * multiplier);
    }

}