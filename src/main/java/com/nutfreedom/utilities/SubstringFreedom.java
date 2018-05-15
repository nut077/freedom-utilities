package com.nutfreedom.utilities;

public class SubstringFreedom {
    private CheckFreedom check = new CheckFreedom();

    public SubstringFreedom() {

    }

    public String substring(String str, int first) {
        String val = "";
        if (isTrueCondition(str, first)) {
            val = str.substring(first);
        }
        return val;
    }

    public String substring(String str, int first, int last) {
        String val = "";
        if (isTrueCondition(str, last) && first < last && first != -1) {
            val = str.substring(first, last);
        }
        return val;
    }

    private boolean isTrueCondition(String str, int length) {
        if (check.isNotBlank(str) && length != -1) {
            return str.length() >= length;
        }
        return false;
    }
}
