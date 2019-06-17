/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carro;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.*;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
/**
 *
 * @author Estudiante
 */
public class EjercicioAnimación extends Application{

    @Override
    public void start(Stage primaryStage) throws Exception {
        Pane panel = new Pane();
        Canvas tablero = new Canvas(1024,512);
        panel.getChildren().add(tablero);
        GraphicsContext lapiz = tablero.getGraphicsContext2D();
        Animación animacion = new Animación(lapiz);
        animacion.start();
        Scene escena = new Scene(panel, 1024,512,Color.WHITESMOKE);
        primaryStage.setScene(escena);
        primaryStage.setTitle("EjercicoCarro");
        primaryStage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}
