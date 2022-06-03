/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package colorsshapes;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.shape.Rectangle;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.stage.Stage;

/**
 *
 * @author Yuvi
 */
public class ColorsShapes extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        Group root = new Group();
        Rectangle rect = new Rectangle(20, 20, 100, 200);
        rect.setX(20);
        rect.setY(20);
        rect.setWidth(100);
        rect.setHeight(200);
        rect.setFill(Color.AQUAMARINE);
        rect.setStroke(Color.BROWN);
        rect.setStrokeWidth(5);
        root.getChildren().add(rect);
        Scene scene = new Scene(root, 200, 350, Color.BLUEVIOLET);
        
        primaryStage.setTitle("Colors & Shapes");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
