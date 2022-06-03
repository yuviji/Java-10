package com.example.problemset09;

import java.awt.geom.Point2D;

import javafx.scene.effect.DropShadow;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;

public class Dorm {
    public static final int MIN_POP = 50;
    public static final int MAX_POP = 400;

    public int x, y, pop;
    public String text;

    private Point2D.Double iconGrab = new Point2D.Double(0, 0);
    private Point2D.Double mouseGrab = new Point2D.Double(0, 0);
    private Point2D.Double mouseLeave = new Point2D.Double(0, 0);
    Population popMod;

    public Rectangle rect = new Rectangle();
    public Color fill;
    public Color outline = Color.GREEN;
    public Text display = new Text();

    public Dorm(int x, int y, int pop, String s, Color c) {
        this.x = x;
        this.y = y;
        this.pop = pop;
        text = s;
        fill = c;

        display.setFill(Color.WHITE);
        DropShadow dropShadow = new DropShadow();
        dropShadow.setRadius(3.6);
        dropShadow.setSpread(1);
        dropShadow.setColor(Color.BLUE);
        display.setEffect(dropShadow);
        display.setFont(Font.font("Default", FontWeight.BOLD, 16));

        ProblemSet09.root.getChildren().addAll(rect, display);
        interactions();
        updateDrawing();
    }

    public void updateDrawing() {
        rect.setWidth(150 * (1.0 * pop / MAX_POP));
        rect.setHeight(150 * (1.0 * pop / MAX_POP));
        rect.setLayoutX(x - rect.getWidth() / 2);
        rect.setLayoutY(y - rect.getHeight() / 2);
        rect.setFill(fill);
        rect.setStroke(outline);

        display.setText(text + ":\n" + pop);
        display.setLayoutX(rect.getLayoutX() - 40);
        display.setLayoutY(rect.getLayoutY() + rect.getHeight() + 15);
        display.setTextAlignment(TextAlignment.CENTER);
        display.setWrappingWidth(rect.getWidth() + 80);
    }

    private void interactions() {
        rect.setOnMouseEntered((MouseEvent me) -> {
            highlight();
        });
        rect.setOnMouseExited((MouseEvent me) -> {
            unhighlight();
        });
        rect.setOnMousePressed((MouseEvent me) -> {
            mouseGrab.x = me.getSceneX();
            mouseGrab.y = me.getSceneY();
            iconGrab.x = x;
            iconGrab.y = y;
            rect.toFront();
        });
        rect.setOnMouseDragged((MouseEvent me) -> {
            mouseLeave.x = me.getSceneX();
            mouseLeave.y = me.getSceneY();
            x = (int) (me.getSceneX() - mouseGrab.x + iconGrab.x);
            y = (int) (me.getSceneY() - mouseGrab.y + iconGrab.y);
            updateDrawing();
            Center.updateAllPoint();
        });
        display.setOnMousePressed((MouseEvent me) -> {
            if (popMod == null) {
                mouseGrab.x = me.getSceneX();
                iconGrab.x = pop;
                popMod = new Population(pop);
                popMod.getScrollBar().setLayoutX(rect.getLayoutX());
                popMod.getScrollBar().setLayoutY(rect.getLayoutY() + rect.getHeight() + 40);
                ProblemSet09.root.getChildren().add(popMod.getScrollBar());
            }
        });
        display.setOnMouseDragged((MouseEvent me) -> {
            mouseLeave.x = me.getSceneX();
            int newValue = (int) (2 * me.getSceneX() - 2 * mouseGrab.x + iconGrab.x);
            if (newValue < MIN_POP) {
                newValue = MIN_POP;
            } else if (newValue > MAX_POP) {
                newValue = MAX_POP;
            }
            popMod.setValue(newValue);
            pop = newValue;
            updateDrawing();
            Center.updateAllPoint();
            popMod.getScrollBar().setLayoutY(rect.getLayoutY() + rect.getHeight() + 40);
        });
        display.setOnMouseReleased((MouseEvent me) -> {
            popMod.getScrollBar().toBack();
            if (popMod != null) {
                ProblemSet09.root.getChildren().remove(popMod.getScrollBar());
                popMod = null;
            }
        });
    }

    private void highlight() {
        DropShadow dropShadow = new DropShadow();
        dropShadow.setRadius(15);
        dropShadow.setColor(Color.rgb(255, 253, 153));
        rect.setEffect(dropShadow);
    }

    private void unhighlight() {
        rect.setEffect(null);
    }
}
