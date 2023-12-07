module com.example.registratorepasti {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.registratorepasti to javafx.fxml;
    exports com.example.registratorepasti;
}