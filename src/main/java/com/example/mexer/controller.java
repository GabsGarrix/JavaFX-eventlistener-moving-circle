package com.example.mexer;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.shape.Circle;

public class controller {

    @FXML
    private Circle myCircle;
    private double x;
    private double y;

    public void arriba(ActionEvent e){
        myCircle.setCenterY(y-=15);
        //System.out.println("arriba");
    }
    public void abarro(ActionEvent e){
        myCircle.setCenterY(y+=15);
        //System.out.println("abarro");
    }
    public void parloacinha(ActionEvent e){
        myCircle.setCenterX(x-=15);
        //System.out.println("parloacinha");
    }
    public void parloa(ActionEvent e){
        myCircle.setCenterX(x+=15);
        //System.out.println("parloa");
    }
}
