module com.example.week7task {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.week7task to javafx.fxml;
    exports com.example.week7task;
}