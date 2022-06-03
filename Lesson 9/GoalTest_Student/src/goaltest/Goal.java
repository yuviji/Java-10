
package goaltest;

import javafx.scene.image.*;
import javafx.scene.input.MouseEvent;
import javafx.scene.media.AudioClip;

public class Goal {

    private Image dukeImage, gloveImage;
    private ImageView dukeImageView, gloveImageView;
    private AudioClip tone;
    
    public Goal(int x, int y){
        dukeImage = new Image(getClass().getResource("Images/Duke.png").toString());
        dukeImageView = new ImageView(dukeImage);
        gloveImage = new Image(getClass().getResource("Images/Glove.png").toString());
        gloveImageView = new ImageView(gloveImage);
        tone = new AudioClip(getClass().getResource("Audio/Note5.wav").toString());
        dukeImageView.setX(x);
        dukeImageView.setY(y);
        gloveImageView.setX(x + 10);
        gloveImageView.setY(y - 20);
        GoalTest.root.getChildren().addAll(dukeImageView, gloveImageView);
        interactions();
    }
    
    private void interactions(){
        dukeImageView.setOnMousePressed((MouseEvent me) -> tone.play());
        dukeImageView.setOnMouseDragged((MouseEvent me) -> System.out.println(me.getSceneX() + ", " + me.getSceneY()));
    }
}
