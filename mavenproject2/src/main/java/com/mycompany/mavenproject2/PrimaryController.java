package com.mycompany.mavenproject2;

import java.io.IOException;
import javafx.fxml.FXML;

public class PrimaryController {

    @FXML
    private void switchToSecondary() throws IOException {
        int a = 10;
        if(a < 10 && a %2 == 0)
            App.setRoot("secondary");
    }
}
