package com.bhanu.pieces;

import com.bhanu.board.Slot;
import com.bhanu.utils.Color;
import com.bhanu.utils.PieceName;

/**
 * Created by bhanu.prakash on 7/17/2017.
 */
public class Bishop extends Piece {
    public Bishop(Color color , PieceName name) {
        super.color = color;
        super.name = name;
    }

    public boolean validate(Slot to, Slot from) {
        return false;
    }

    public void move(Slot to) {
        Slot from = this.getCurrentLocation();
        if(validate(to, from)){
            to.setPiece(this);
            from.removePiece();
        }
    }

    public Slot basicMove() {
        return null;
    }
}
