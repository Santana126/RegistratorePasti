package com.example.registratorepasti.dao;

import com.example.registratorepasti.model.Meal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MealDao {


    // La stringa di connessione al database SQLite
    private static final String JDBC_URL = "jdbc:sqlite:src/main/resources/com/example/registratorepasti/database/DataBaseProvaPasti";

    // Metodo per salvare un'istanza di Risultato nel database
    public boolean saveMeal(Meal meal) {

        try (Connection connection = DriverManager.getConnection(JDBC_URL)) {
            String insertSQL = "INSERT INTO Pasti (Data, Tipo, Calorie, Carbs, Fat, Protein) VALUES (?, ?, ?, ?, ?, ?)";
            try (PreparedStatement preparedStatement = connection.prepareStatement(insertSQL)) {
                preparedStatement.setString(1, meal.getDate());
                preparedStatement.setString(2, meal.getType());
                preparedStatement.setInt(3, meal.getCalories());
                preparedStatement.setFloat(4, meal.getCarbs());
                preparedStatement.setFloat(5, meal.getFat());
                preparedStatement.setFloat(6, meal.getProtein());
                int rowsAffected = preparedStatement.executeUpdate();
                return rowsAffected > 0;
            }
        } catch (SQLException ignored) {
            //Ignore the Exception at this moment.
            // ToDo
        }
        return false;
    }
}
