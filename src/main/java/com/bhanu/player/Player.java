package com.bhanu.player;

import com.bhanu.board.Slot;
import com.bhanu.pieces.Piece;
import com.bhanu.utils.Color;
import com.bhanu.utils.SlotUtils;

/**
 * Created by bhanu.prakash on 7/17/2017.
 */
public abstract class Player {
    Color color;

    public void move(Piece piece , Slot to){
        piece.move(to);
    }

    public void move(Slot from , Slot to){
        from.getPiece().move(to ,from);
    }
    @Override
    public String toString() {
        return "Player{" +
                "color=" + color +
                '}';
    }
}
