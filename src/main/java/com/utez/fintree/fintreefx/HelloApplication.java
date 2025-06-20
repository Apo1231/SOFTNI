package com.utez.fintree.fintreefx; // ¡Paquete corregido a minúscula!

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        // --- Cargar la pantalla de Registro de Ahorros para la prueba ---
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/com/utez/fintree/fintreefx/pantallaRegistroAhorros.fxml"));

        // Dimensiones de tu diseño de Figma (ej. 900x600)
        Scene scene = new Scene(fxmlLoader.load(), 900, 600);

        // Título de la ventana
        stage.setTitle("Fintree - Registro de Ahorros");

        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}