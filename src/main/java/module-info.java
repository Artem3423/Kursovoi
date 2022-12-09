module priziv.kursovoi {
    requires javafx.controls;
    requires javafx.fxml;


    opens priziv.kursovoi to javafx.fxml;
    exports priziv.kursovoi;
}