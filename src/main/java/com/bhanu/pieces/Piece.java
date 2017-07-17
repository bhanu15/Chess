package com.bhanu.pieces;

import com.bhanu.board.Slot;
import com.bhanu.utils.Color;
import com.bhanu.utils.PieceName;

import java.util.HashMap;

/**
 * Created by bhanu.prakash on 7/17/2017.
 */
public abstract class Piece {

    private static HashMap<Piece, Slot> pieceLocations = new HashMap<Piece, Slot>();

    public abstract boolean validate(Slot to, Slot from);

    public abstract void move(Slot to);

    public void move(Slot to, Slot from) {
        if (validate(to, from)) {
            to.setPiece(this);
            setCurrentLocation(to);
            from.removePiece();
        }
    }

    public abstract Slot basicMove();

    Color color;

    PieceName name;

    public void setCurrentLocation(Slot slot) {
        pieceLocations.put(this, slot);
    }

    public Slot getCurrentLocation() {
        return pieceLocations.get(this);
    }

    @Override
    public String toString() {
        return "Piece{" +
                "color=" + color +
                ", name=" + name +
                '}';
    }
}
