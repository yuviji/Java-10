
package com.example.problemset09;

import javafx.scene.control.ScrollBar;

public class Population {
    private final ScrollBar xscrollBar;
    private final int xBarWidth = 100;
    private final int xBarHeight = 15;
    
    public Population(int value){
        xscrollBar = new ScrollBar();
        xscrollBar.setMin(Dorm.MIN_POP);
        xscrollBar.setMax(Dorm.MAX_POP);
        setValue(value);
        
        xscrollBar.setMinSize(xBarWidth, xBarHeight);
        xscrollBar.setPrefSize(xBarWidth, xBarHeight);
        xscrollBar.setMaxSize(xBarWidth, xBarHeight);
    }
    
    public ScrollBar getScrollBar(){
        return xscrollBar;
    }
    public void setValue(int value){
        xscrollBar.setValue(value);
    }
}
