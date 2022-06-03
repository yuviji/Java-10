
package com.example.problemset09;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class ProblemSet09 extends Application {
    public static Group root = new Group();

    @Override
    public void start(Stage primaryStage) {

        Scene scene = new Scene(root, 800, 650, Color.WHITE);

        primaryStage.setTitle("Campus");
        primaryStage.setScene(scene);
        primaryStage.show();

        Image background = new Image("file:Campus.jpg");
        ImageView backgroundView = new ImageView(background);
        backgroundView.setPreserveRatio(true);
        backgroundView.setFitWidth(800);
        root.getChildren().add(backgroundView);
        backgroundView.toBack();
    }

    public static void main(String[] args) {
        Dorm a = new Dorm(50, 50, Dorm.MIN_POP + (int) (Math.random() * (Dorm.MAX_POP - Dorm.MIN_POP)), "Dorm A", Color.rgb(190, 193, 104, .5));
        Dorm b = new Dorm(100, 50, Dorm.MIN_POP + (int) (Math.random() * (Dorm.MAX_POP - Dorm.MIN_POP)), "Dorm B", Color.rgb(15, 10, 38, .5));
        Dorm c = new Dorm(150, 50, Dorm.MIN_POP + (int) (Math.random() * (Dorm.MAX_POP - Dorm.MIN_POP)), "Dorm C", Color.rgb(214, 194, 160, .5));
        Dorm d = new Dorm(200, 50, Dorm.MIN_POP + (int) (Math.random() * (Dorm.MAX_POP - Dorm.MIN_POP)), "Dorm D", Color.rgb(145, 5, 38, .5));
        Dorm e = new Dorm(250, 50, Dorm.MIN_POP + (int) (Math.random() * (Dorm.MAX_POP - Dorm.MIN_POP)), "Dorm E", Color.rgb(22, 62, 86, .5));
        Dorm f = new Dorm(300, 50, Dorm.MIN_POP + (int) (Math.random() * (Dorm.MAX_POP - Dorm.MIN_POP)), "Dorm F", Color.rgb(22, 62, 86, .5));

        Center dorms = new Center("All Dorms", true, a, b, c, d, e, f);
        Center study = new Center("Study Group", false, a, b, d);

        launch(args);
    }
}
