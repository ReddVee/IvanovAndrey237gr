module ru.ivanov.ivanov_task5 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.ivanov.ivanov_task5 to javafx.fxml;
    exports ru.ivanov.ivanov_task5;
}