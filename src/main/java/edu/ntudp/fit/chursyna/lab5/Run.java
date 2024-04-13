package edu.ntudp.fit.chursyna.lab5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        // Створюємо об'єкт для роботи з базою даних
        WorkWithDataBase workWithDataBase = new WorkWithDataBase();

        // Отримуємо всіх студентів з бази даних
        List<Students> students = workWithDataBase.getAllStudents();

        // Створюємо об'єкт для зчитування введених даних з клавіатури
        Scanner scanner = new Scanner(System.in);

        // Запитуємо користувача про місяць народження студентів
        System.out.print("Введіть номер місяця народження, за яким вивести список студентів (від 1 до 12): ");
        int monthOfBirth = scanner.nextInt();

        // Фільтруємо студентів за місяцем народження
        List<Students> filteredStudents = filterStudentsByMonthOfBirth(students, monthOfBirth);

        // Виводимо студентів на екран
        if (filteredStudents.isEmpty()) {
            System.out.println("Студентів з таким місяцем народження немає.");
        } else {
            System.out.println("Список студентів за вказаним місяцем народження:");
            for (Students student : filteredStudents) {
                System.out.println(student);
            }
        }
    }

    // Метод для фільтрації студентів за місяцем народження
    private static List<Students> filterStudentsByMonthOfBirth(List<Students> students, int monthOfBirth) {
        List<Students> filteredStudents = new ArrayList<>();
        for (Students student : students) {
            int studentMonth = student.getDataBirth().getMonth() + 1; // Враховуємо, що метод getMonth() повертає місяць, починаючи з 0
            if (studentMonth == monthOfBirth) {
                filteredStudents.add(student);
            }
        }
        return filteredStudents;
    }
}
