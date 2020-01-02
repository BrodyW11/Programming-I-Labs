public class TestCalculator {

    public boolean testParser(Calculator calculator) {
        boolean allTestsGood = true;

        if (calculator.x("12 + 5") != 17) {
            allTestsGood = false;
            System.out.println("[FAIL] Basic parsing fails to add.");
        } else {
            System.out.println("[ OK ] Parser adds correctly.");
        }

        if (calculator.x("12 x 5") != 60) {
            allTestsGood = false;
            System.out.println("[FAIL] Basic parsing fails to multiple.");
        } else {
            System.out.println("[ OK ] Parser multiplies correctly.");
        }
        if (calculator.x("12 [ 5") != null) {
            allTestsGood = false;
            System.out.println("[FAIL] Paser does not return null for operators which are not supported.");
        } else {
            System.out.println("[ OK ] Parser returns null fo operators which are not supported.");
        }
        return allTestsGood;
    }

    public boolean testAdd(Calculator calculator) {
        boolean allTestsGood = true;

        Double num = 5.0;
        calculator.x = 2.0;

        if (calculator.x(num) != 7.0) {
            allTestsGood = false;
            System.out.println("[FAIL] Calculator adds incorrectly.");
        } else {
            System.out.println("[ OK ] Calculator adds correctly.");
        }

        Double num2 = -5.0;
        calculator.x = -2.0;

        if (calculator.x(num2) != -7.0) {
            allTestsGood = false;
            System.out.println("[FAIL] Calculator adds with negative numbers incorrectly.");
        } else {
            System.out.println("[ OK ] Calculator adds with negative numbers correctly.");
        }

        return allTestsGood;

    }

    public boolean testMultiplication(Calculator calculator) {
        boolean allTestsGood = true;
        double num = 5.0;
        calculator.x = 2.0;
        
        if (calculator.x(num) != 10.0) {
            allTestsGood = false;
            System.out.println("[FAIL] Calculator multiplies incorrectly.");
        } else {
            System.out.println("[ OK ] Calculator multiplies correctly.");
        }

        double num2 = -5.0;
        calculator.x = -2.0;
        if (calculator.x(num2) != 10.0) {
            allTestsGood = false;
            System.out.println("[FAIL] Calculator multiplies by negative numbers incorrectly.");
        } else {
            System.out.println("[ OK ] Calculator multiplies by negative numbers correctly.");
        }
        return allTestsGood;
    }
}
