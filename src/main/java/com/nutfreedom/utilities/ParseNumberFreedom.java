package com.nutfreedom.utilities;

public class ParseNumberFreedom {
    public ParseNumberFreedom() {

    }

    public int parseInt(String num) {
        if (num != null && !num.equals("")) {
            try {
                return Integer.parseInt(num.replaceAll(",", ""));
            } catch (NumberFormatException e) {
                printError("parseInt => value => " + num);
            }
        }
        return 0;
    }

    public double parseDouble(String num) {
        if (num != null && !num.equals("")) {
            try {
                return Double.parseDouble(num.replaceAll(",", ""));
            } catch (NumberFormatException e) {
                printError("parseDouble => value => " + num);
            }
        }
        return 0;
    }

    private void printError(String msg) {
        System.out.println("ParseNumberFreedom error cannot " + msg);
    }
}
