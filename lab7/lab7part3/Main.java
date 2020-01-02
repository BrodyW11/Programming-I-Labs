public class Main {

    public static void main(String[] args) {
        System.out.println("Lab 9 - Part 3.");
        Calculator Cal = new Calculator();
        TestCalculator TCal = new TestCalculator();

        boolean testParserGood = false;
        boolean testAddGood = false;
        boolean testMultiplicationGood = false;

        testParserGood = TCal.testParser(Cal);
        testAddGood = TCal.testAdd(Cal);
        testMultiplicationGood = TCal.testMultiplication(Cal);

        if (testParserGood == true && testAddGood == true && testMultiplicationGood == true) {
            System.out.println("Congratulations, your Calculator appears to be working.");
        }
    }

}