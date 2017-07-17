package com.bhanu.moves;

import com.bhanu.board.Slot;
import com.bhanu.pieces.Piece;
import com.bhanu.utils.SlotUtils;

/**
 * Created by bhanu.prakash on 7/17/2017.
 */
public class BasicMove implements MovesStrategy {
    SlotUtils slotUtils;
    public Slot findNextMove(Piece piece) {
        Slot currentLocation = piece.getCurrentLocation();
        piece.basicMove();
        Slot nextSlot = SlotUtils.getSlot(currentLocation.getX()+1 , currentLocation.getY()+1);
        return nextSlot;
    }
}
