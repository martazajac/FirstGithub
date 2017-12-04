package com.company;

import com.company.Employee;

public class Company {

    private String name;
    private Employee[] employees;
    private int numberOfEmployees;

    public Company() {
        employees = new Employee[10];
        numberOfEmployees = 0;
    }

    public void printEmployee() {
        if (numberOfEmployees == 0) {
            System.out.println("Brak pracownikow");
        } else {
            for (int i = 0; i < numberOfEmployees; i++) {
                Employee emp = employees[i];
                emp.describeEmployee();

            }
        }
    }

    public double countAverageSalary() {
        double sumoOfSalaries = 0;
        for (int i = 0; i < numberOfEmployees; i++) {
            Employee nextemp = employees[i];
            sumoOfSalaries += nextemp.getSalary();


        }

        double averageSalary = sumoOfSalaries / numberOfEmployees;
        return averageSalary;
    }

    public double countAverageAge() {
        double sumOfAge = 0;
        for (int i = 0; i < numberOfEmployees; i++) {
            Employee nextemp = employees[i];
            sumOfAge += nextemp.getAge();
        }
        double averageAge = sumOfAge;
        return averageAge;

    }

    public void getEmployeeWithHighestSalary() {
        double bestEmployee = 0;
        Employee emp = null;

        for (int i = 0; i < numberOfEmployees; i++) {
            Employee nextemp = employees[i];
            if (nextemp.getSalary() > bestEmployee) {
                bestEmployee = employees[i].getSalary();
                emp =  employees[i];
            }
        }
        System.out.println("Najwyzsza wyplate ma: ");
        emp.describeEmployee();
    }

    public void printEmployeeBad() {
        for (Employee emp : employees) {
            emp.describeEmployee();
        }
    }

    public void addEmployee(Employee nextEmployee) {

        employees[numberOfEmployees] = nextEmployee;
        numberOfEmployees++;

    }
}

