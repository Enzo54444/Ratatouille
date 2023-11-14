package com.example.ratatouille;

import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import modele.GestionVue;

public class AccueilController {
    public void switchToTableauDeBord(ActionEvent event) {
        Scene tableauDeBord = GestionVue.getTableauBord();
        //primaryStage.setScene(tableauDeBord);
    }


}
