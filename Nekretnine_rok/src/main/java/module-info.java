module com.example.nekretnine_rok {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.nekretnine_rok to javafx.fxml;
    exports com.example.nekretnine_rok;
}