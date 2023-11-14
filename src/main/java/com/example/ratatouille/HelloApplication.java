package com.example.ratatouille;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import modele.GestionVue;

import java.io.IOException;

public class HelloApplication extends Application {

    private GestionVue gVue;

    public HelloApplication() throws IOException {
        gVue = new GestionVue();
    }

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("page-accueil.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 920, 640);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
