package com.bhanu.pieces;

import com.bhanu.board.Slot;
import com.bhanu.utils.Color;
import com.bhanu.utils.PieceName;

/**
 * Created by bhanu.prakash on 7/17/2017.
 */
public class Pawn extends Piece {

    public Pawn(Color color, PieceName name) {
        super.color = color;
        super.name = name;
    }

    public boolean validate(Slot to, Slot from) {
        return true;
    }

    public void move(Slot to) {
        Slot from = this.getCurrentLocation();
        if(validate(to,from)){
            to.setPiece(this);
            setCurrentLocation(to);
            from.removePiece();
        }
    }

    public Slot basicMove() {
        Slot currentLocation = getCurrentLocation();

        return null;
    }
}
