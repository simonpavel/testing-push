package libs;


import org.apache.log4j.Logger;

public class Calc {

    static Logger logger = Logger.getLogger("Cacl");

    public static int sum(int temp_var1, int temp_var2) {
        logger.info("Result = " + (temp_var1 + temp_var2));
        return temp_var1 + temp_var2;

    }

    public static String sum(String temp_string1, String temp_string2) {
        logger.info("My name is:" + " " + temp_string1 + " " + temp_string2);
        return temp_string1 + temp_string2;
    }

    public static String sum(String varString, int varint) {
        logger.info(varString + " " + varint);
        return varString + varint;
    }

    public static int sum(int varInt, String varString) {
        try {
            int tempResult = varInt + Integer.parseInt(varString);
            logger.info("Result" + " " + tempResult);
            return tempResult;
        } catch (NumberFormatException e) {
            logger.error("Error" + e);
            return 88888;

        } catch (Exception e) {
            logger.error("Error" + e);
            return 99999;
        }
    }


    public static int Multiplication(int multiplication_var1, int multiplication_var2) {
        int multiplicationResult = multiplication_var1 * multiplication_var2;
        logger.info("Multiplication result is:" + " " + multiplicationResult);
        return multiplicationResult;
    }

    public static int Division(int division_var1, int division_var2) {
        try {
            int divisionResult = division_var1 / division_var2;
            logger.info("Division result is:" + " " + divisionResult);
            return divisionResult;
        } catch (Exception divisionExeption) {
            logger.error("Oops, something went wrong:" + " " + divisionExeption);
            return 10011001;
        }
    }

    public static double Division(double division_var1, double division_var2) {
        double divisionResult = division_var1 / division_var2;
        logger.info("Division result is:" + " " + divisionResult);
        return divisionResult;
    }


}





