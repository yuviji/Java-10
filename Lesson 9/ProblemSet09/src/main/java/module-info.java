module com.example.problemset09 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;

    opens com.example.problemset09 to javafx.fxml;
    exports com.example.problemset09;
}