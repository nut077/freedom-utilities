package com.nutfreedom.utilities;

import java.util.Map;

public class MapFreedom {

    private ParseNumberFreedom parse = new ParseNumberFreedom();
    private Map map;
    public MapFreedom() {

    }

    public MapFreedom(Map map) {
        this.map = map;
    }

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    public String getString(String key) {
        if (containsKey(key)) {
            return String.valueOf(map.get(key));
        }
        return "";
    }

    public String getString(int key) {
        if (containsKey(key)) {
            return String.valueOf(map.get(key));
        }
        return "";
    }

    public int getInt(String key) {
        if (containsKey(key)) {
            return parse.parseInt(String.valueOf(map.get(key)));
        }
        return 0;
    }

    public int getInt(int key) {
        if (containsKey(key)) {
            return parse.parseInt(String.valueOf(map.get(key)));
        }
        return 0;
    }

    public double getDouble(String key) {
        if (containsKey(key)) {
            return parse.parseDouble(String.valueOf(map.get(key)));
        }
        return 0;
    }

    public double getDouble(int key) {
        if (containsKey(key)) {
            return parse.parseDouble(String.valueOf(map.get(key)));
        }
        return 0;
    }

    public boolean isTrue(String key) {
        if (containsKey(key)) {
            return (Boolean) map.get(key);
        }
        return false;
    }

    public boolean isTrue(int key) {
        if (containsKey(key)) {
            return (Boolean) map.get(key);
        }
        return false;
    }

    public int getSize() {
        return map.size();
    }

    private boolean containsKey(String key) {
        if (map.containsKey(key)) {
            return true;
        }
        printError(key);
        return false;
    }

    private boolean containsKey(int key) {
        if (map.containsKey(key)) {
            return true;
        }
        printError(String.valueOf(key));
        return false;
    }

    private void printError(String msg) {
        System.out.println("MapFreedom error cannot found key => " + msg + " in this map >= " + this.getMap());
    }
}