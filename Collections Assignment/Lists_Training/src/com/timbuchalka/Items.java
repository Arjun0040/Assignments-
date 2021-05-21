package com.timbuchalka;

import java.util.Collections;
import java.util.Comparator;

public class Items implements Comparable {
    private String name;
    private int qty;

    public Items(String name, int qty) {
        this.name = name;
        this.qty = qty;
    }

    public String getName() {
        return name;
    }

    public int getQty() {
        return qty;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
