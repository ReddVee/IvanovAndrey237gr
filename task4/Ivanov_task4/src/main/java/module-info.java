module ru.ivanov.ivanov_task4 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.ivanov.ivanov_task4 to javafx.fxml;
    exports ru.ivanov.ivanov_task4;
}