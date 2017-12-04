package com.company;

public class Employee {
    private String name;
    private String surname;
    private int age;
    private double salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        if (age <= 0) {
            System.out.println("Error");

        } else {
            System.out.println(age);
        }
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    public void describeEmployee(){
        System.out.println("Name: " +this.name+ " Surname: " + this.surname+ " Age: " + this.age);
    }
}
