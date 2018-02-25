package com.company;

import java.util.ArrayList;

public class Bucket {
    private ArrayList<Pair> list = new ArrayList<>();

    public void put (String key, String value) {
        for (Pair pair : list) {
            if (pair.getKey().equals(key)) {
                pair.setValue(value);
                return;
            }
        }
        Pair pair = new Pair (key, value);
        this.list.add(pair);
    }

    public String get(String searchKey) {
        String result = null;

        for (Pair pair : list) {
            if (pair.getKey().equals(searchKey)) {
                result = pair.getValue();
                break;
            }
        }
        return result;
    }
}
