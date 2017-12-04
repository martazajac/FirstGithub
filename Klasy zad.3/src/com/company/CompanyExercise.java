package com.company;


import java.util.Scanner;

public class CompanyExercise {
    private Scanner scanner;
    private Company myCompany;

    public CompanyExercise() {
        scanner = new Scanner(System.in);
        myCompany = new Company();
    }

    public void start() {
        boolean exit = false;
        while (exit == false) {
            System.out.println("Wybierz opcje");
            System.out.println("1.Dodaj nowego pracownika");
            System.out.println("2.Usun pracownika");
            System.out.println("3.Wyswietl pracownikow");
            System.out.println("4.Wyswietl srednia pensje");
            System.out.println("5.Wyswietl sredni wiek");
            System.out.println("6.Wyswietl najlepszego pracownika");
            System.out.println("7.Wyjdz z programu");
            int option = scanner.nextInt();
            {
                switch (option) {
                    case 1: {
                        addEmployeeToCompany();
                        break;
                    }
                    case 2: {
                        deleteEmployee();
                        break;

                    }
                    case 3: {
                        printEmployees();
                        break;
                    }
                    case 4: {
                    countAverageSalary();
                    }
                    case 5: {
                    countAverageAge();
                    }
                    case 6: {
                    getEmployeeWithHighestSalary();
                    }


                    default: {
                        System.out.println("Nie ma takiej opcji");
                    }
                }
            }
        }
    }


    public void addEmployeeToCompany() {
        Employee nextEmp = new Employee();
        System.out.println("Podaj imie");
        nextEmp.setName(scanner.next());

        System.out.println("Podaj nazwisko");
        nextEmp.setSurname(scanner.next());

        System.out.println("Podaj wiek");
        nextEmp.setAge(scanner.nextInt());

        System.out.println("Podaj pensje");
        nextEmp.setSalary(scanner.nextInt());

//        metoda wywolanba na obiekcie myCompany
        myCompany.addEmployee(nextEmp);
    }

    public void deleteEmployee() {
//        logika usuwania pracownika



    }

    public void printEmployees() {
        myCompany.printEmployee();

    }

    public void printEmployeesBad() {
        myCompany.printEmployeeBad();

    }
    public void countAverageSalary(){
        myCompany.countAverageSalary();
    }
    public void countAverageAge(){
        myCompany.countAverageAge();
    }
    public void getEmployeeWithHighestSalary(){
        myCompany.getEmployeeWithHighestSalary();
    }
}
