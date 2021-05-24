package com.company.model;

import java.util.Objects;

public class Person {
    private String name;
    private String personalCode;
    private String address;
    private int age;
    private boolean isSelfIsolation;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && isSelfIsolation == person.isSelfIsolation && name.equals(person.name) && personalCode.equals(person.personalCode) && address.equals(person.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, personalCode, address, age, isSelfIsolation);
    }

    public Person(String name, String personalCode, String address, int age) {
        this.name = name;
        this.personalCode = personalCode;
        this.address = address;
        this.age = age;
        this.isSelfIsolation = false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPersonalCode() {
        return personalCode;
    }

    public void setPersonalCode(String personalCode) {
        this.personalCode = personalCode;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isSelfIsolation() {
        return isSelfIsolation;
    }

    public void setSelfIsolation(boolean selfIsolation) {
        isSelfIsolation = selfIsolation;
    }
}
