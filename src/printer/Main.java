package printer;

public class Main {
    public static void main(String[] args) {

        String inputText = "printer";

        Printer printing = new Printer(); // дефолт
        printing.print(inputText);

        Printer printingBlack = new Black();
        printingBlack.print(inputText);
        Printer printingRed = new Red();
        printingRed.print(inputText);
        Printer printingGreen = new Green();
        printingGreen.print(inputText);
        Printer printingYellow = new Yellow();
        printingYellow.print(inputText);
        Printer printingBlue = new Blue();
        printingBlue.print(inputText);
        Printer printingPurple = new Purple();
        printingPurple.print(inputText);
        Printer printingCyan = new Cyan();
        printingCyan.print(inputText);
        Printer printingGrey = new Grey();
        printingGrey.print(inputText);
    }
}
