package edu.ntudp.fit.chursyna.lab5;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class WorkWithDataBase {
    private static final String URL = "jdbc:mysql://127.0.0.1:3306/databasestudents";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "12345";

    // Метод для отримання списку студентів з бази даних
    public List<Students> getAllStudents() {
        List<Students> studentsList = new ArrayList<>();
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        try {
            // Підключення до бази даних
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            statement = connection.createStatement();

            // Виконання SQL-запиту для отримання всіх студентів
            String query = "SELECT * FROM StudentsList";
            resultSet = statement.executeQuery(query);

            // Читання результатів запиту та створення об'єктів Student
            while (resultSet.next()) {
                int id = resultSet.getInt("ID");
                String surname = resultSet.getString("Прізвище");
                String name = resultSet.getString("Ім'я");
                String patronymic = resultSet.getString("По-батькові");
                Date birthDate = resultSet.getDate("День народження");
                String studentID = resultSet.getString("Номер залікової книжки");

                Students student = new Students(id, surname, name, patronymic, birthDate, studentID);
                studentsList.add(student);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // Закриття з'єднання, заявки та результату
            try {
                if (resultSet != null) resultSet.close();
                if (statement != null) statement.close();
                if (connection != null) connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return studentsList;}
}
