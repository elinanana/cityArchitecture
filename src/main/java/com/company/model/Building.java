package com.company.model;

import java.util.List;

// Comment2
public abstract class Building extends AbstractLocation {
    public Building(String name, String address, int size, List<Person> persons) {
        super(name, address, size, persons);
    }

    @Override
    public int getMaxPersons() {
        return getSize() / 2;
    }
}
