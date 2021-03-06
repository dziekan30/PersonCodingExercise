package com.dziekan30;

public class Person {

    private String firstName;
    private String lastName;

    private int age;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        if(age < 0 || age > 100)
            this.age = 0;
        else this.age = age; // added this
    }

    // public boolean isTeen(int age) {
    public boolean isTeen() { // no parameter!
        // if(age > 12 || age < 20) return true;
        if(age > 12 && age < 20) return true; // use &&
        else return false;
    }

    public String getFullName() {
        if(firstName.isEmpty() && lastName.isEmpty())
            // return " ";
            return ""; // no space ""
        else if(lastName.isEmpty())
            return firstName;
            // if(firstName.isEmpty())
        else if(firstName.isEmpty())
            return lastName;
        else // add this, why you were missing a return statement
            return firstName + " " + lastName; // add this
    }
}
