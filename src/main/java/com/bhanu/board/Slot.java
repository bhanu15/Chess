package com.bhanu.board;

import com.bhanu.pieces.Piece;
import com.bhanu.utils.Color;

/**
 * Created by bhanu.prakash on 7/17/2017.
 */
public class Slot {

    Piece piece;
    Color color;
    int x ;
    int y;

    public Slot() {
    }

    public Slot(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Piece getPiece() {
        return piece;
    }

    public void setPiece(Piece piece) {
        this.piece = piece;
    }
    public void removePiece(){
        this.setPiece(null);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Slot{" +
                "piece=" + piece +
                ", x=" + x +
                ", y=" + y +
                '}';
    }
}
