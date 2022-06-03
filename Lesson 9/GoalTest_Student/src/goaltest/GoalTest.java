
package goaltest;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class GoalTest extends Application {
    public static Group root = new Group();
    
    @Override
    public void start(Stage primaryStage) {
        //Instantiate a few Goal objects
        
        Scene scene = new Scene(root, 600, 500, Color.rgb(50,50,50));
        Goal g1 = new Goal(100, 20), g2 = new Goal(200, 50), g3 = new Goal(400, 100);
        primaryStage.setTitle("GoalTest");
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
    
}
