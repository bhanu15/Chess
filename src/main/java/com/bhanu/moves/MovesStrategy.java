package com.bhanu.moves;

import com.bhanu.board.Slot;
import com.bhanu.pieces.Piece;

/**
 * Created by bhanu.prakash on 7/17/2017.
 */
public interface MovesStrategy {
    Slot findNextMove(Piece piece);

}
