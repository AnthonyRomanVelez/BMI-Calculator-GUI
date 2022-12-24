module com.mycompany.bmicalculatorgui {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens com.mycompany.bmicalculatorgui to javafx.fxml;
    exports com.mycompany.bmicalculatorgui;
}
