package com.bhanu.pieces;

import com.bhanu.board.Slot;
import com.bhanu.utils.Color;
import com.bhanu.utils.PieceName;

/**
 * Created by bhanu.prakash on 7/17/2017.
 */
public class PieceTest {
    public static void main(String[] args) {
        Pawn pawn = new Pawn(Color.BLACK, PieceName.PAWN);
        Slot to = new Slot();
        Slot from  = new Slot();
        to.setX(0);
        to.setY(0);

        from.setX(10);
        from.setY(10);
        pawn.move(to);
        System.out.println(pawn.getCurrentLocation());
        pawn.move( from);
        System.out.println(pawn.getCurrentLocation());

    }
}
