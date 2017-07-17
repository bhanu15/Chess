package com.bhanu.utils;

import com.bhanu.board.Slot;

/**
 * Created by bhanu.prakash on 7/17/2017.
 */
public class SlotUtils {
    private static Slot[][] chessBoard = null;
    private static int size=0;

    private static Slot[][] getChessBoard() {
        return chessBoard;
    }

    public static void setChessBoard(Slot[][] chessBoard) {
        SlotUtils.chessBoard = chessBoard;
        size = chessBoard.length;
    }

    public static Slot getSlot(int x , int y){
        if(x>=size|| y>=size || x<0 || y<0){
            return null;
        }
        for(int i=0 ; i <size ;i++){
            for(int j=0;j<size ;j++){
                if(i ==x && j==y){
                    return chessBoard[i][j];
                }
            }
        }
        return null;
    }
}
