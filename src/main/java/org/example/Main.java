package org.example;

public class Main {
    public void main(){
        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Иванов Иван Иванович", "Менеджер", "ivanov@mail.ru", "8-916-123-45-67", 50000, 30);
        employees[1] = new Employee("Петров Петр Петрович", "Программист", "petrov@mail.ru", "8-925-234-56-78", 70000, 35);
        employees[2] = new Employee("Сидорова Елена Владимировна", "Дизайнер", "sidorova@mail.ru", "8-903-345-67-89", 45000, 48);
        employees[3] = new Employee("Кузнецова Анастасия Александровна", "Бухгалтер", "kuznetsova@mail.ru", "8-977-456-78-90", 60000, 32);
        employees[4] = new Employee("Николаев Николай Николаевич", "HR-менеджер", "nikolaev@mail.ru", "8-916-567-89-01", 55000, 41);
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getAge() > 40) {
                employees[i].printEmployeeInfo();
            }
        }

    }
}