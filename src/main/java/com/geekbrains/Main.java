package com.geekbrains;

public class Main {
    public static void main(String[] args) {
        Employee[] emplArray = new Employee[5];
        emplArray[0] = new Employee("spider man", "superhero", "spiderman@yandex.ru", "911", 300000, 25);
        emplArray[1] = new Employee("batman", "superhero", "batman@yandex.ru", "911", 1000000, 40);
        emplArray[2] = new Employee("ant man", "superhero", "antman@yandex.ru", "911", 500000, 28);
        emplArray[3] = new Employee("superman", "superhero", "superman@yandex.ru", "911", 3000000, 2500);
        emplArray[4] = new Employee("deadpool", "superhero", "deadpool@yandex.ru", "911", 400000, 37);


        for(Employee employee: emplArray){
            if (employee.getAge() > 40) {
                employee.getInfo();
            }
        }

    }
}
