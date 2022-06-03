package com.example.problemset09;

import java.util.ArrayList;

import javafx.scene.effect.DropShadow;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;

public class Center {
    private final static ArrayList<Center> points = new ArrayList<Center>();
    private boolean dormPeople = true;
    Dorm[] dorms;

    public int x, y;
    public String text;
    private int distance;
    public Circle point = new Circle();
    public Color fill = Color.PINK, outline = Color.GREEN;
    public Text display = new Text();

    public Center(String s, boolean isBuildings, Dorm... dorms) {
        text = s + "\nDistance: ";
        this.dormPeople = isBuildings;
        this.dorms = dorms;

        display.setFill(Color.WHITE);
        DropShadow dropShadow = new DropShadow();
        dropShadow.setRadius(3.6);
        dropShadow.setSpread(1);
        dropShadow.setColor(Color.BLUE);
        display.setEffect(dropShadow);
        display.setFont(Font.font("Default", FontWeight.BOLD, 16));

        ProblemSet09.root.getChildren().addAll(point, display);
        points.add(this);

        calculateCenter();
        updateDrawing();
    }

    public void updateDrawing() {
        point.setCenterX(x);
        point.setCenterY(y);
        point.setRadius(10);
        point.setFill(fill);
        point.setStroke(outline);

        display.setText(text + distance);
        display.setX(x - 20);
        display.setY(y + point.getRadius() + 15);
    }

    public void calculateCenter() {
        if (dormPeople) {
            calculateDormCenter();
        } else {
            calculatePeopleCenter();
        }
        distance = calculateDistance(dorms[0]);
    }

    private void calculateDormCenter() {
        int pop = 0;
        int xW = 0;
        int yW = 0;

        for (Dorm dorm : dorms) {
            xW += dorm.x * dorm.pop;
            yW += dorm.y * dorm.pop;
            pop += dorm.pop;
        }

        x = xW / pop;
        y = yW / pop;
    }

    private void calculatePeopleCenter() {
        int xW = 0;
        int yW = 0;

        for (Dorm dorm : dorms) {
            xW += dorm.x;
            yW += dorm.y;
        }

        x = xW / dorms.length;
        y = yW / dorms.length;
    }

    private int calculateDistance(Dorm dorm) {
        return (int) Math.sqrt(Math.pow(dorm.x - x, 2) + Math.pow(dorm.y - y, 2));
    }

    public static void updateAllPoint() {
        for (Center point : points) {
            point.calculateCenter();
            point.updateDrawing();
            point.point.toFront();
            point.display.toFront();
        }
    }
}
