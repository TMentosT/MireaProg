

package com.company;

public class Dictionary {
    private Bucket[] buckets = new Bucket[26];

    public Dictionary() {
        for (int i=0; i< buckets.length; i++){
            buckets[i] = new Bucket();
        }
    }

    public void put(String key, String value) {
        int index = h(searchKey);
        return buckets[index].get(searchKey);
    }

    private int h(String word) {
        return word.charAt(0) - 'a';
    }
}
