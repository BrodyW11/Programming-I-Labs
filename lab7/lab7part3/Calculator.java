public class Calculator {

    Double x;
     /*
	* Chops up input on ' ' then decides whether to add or multiply.
	* If the string does not contain a valid format returns null.
     */
    public Double x(String x) {
        Double returnValue = 0.0;
        String[] chopingResult = x.split(" ");
        if (chopingResult[1].equals("+")) {
            returnValue = Double.parseDouble(chopingResult[0]) + Double.parseDouble(chopingResult[2]);
        } else if (chopingResult[1].equals("x")) {
            returnValue = Double.parseDouble(chopingResult[0]) * Double.parseDouble(chopingResult[2]);
        } else {
            returnValue = null;
        }

        return returnValue;

    }
      /*
	* Adds the parameter x to the instance variable x and returns the answer as a Double.
     */
    public Double x(Double x) {
        System.out.println("== Adding ==");

        Double returnValue = this.x + x;
        return returnValue;

    }
    /*
	* Multiplies the parameter x by instance variable x and return the value as a Double.
     */
    public Double x(double x) {
        System.out.println("== Multiplying ==");

        Double returnValue = this.x * x;
        return returnValue;

    }
}