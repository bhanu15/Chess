package com.bhanu.board;

import com.bhanu.pieces.*;
import com.bhanu.utils.Color;
import com.bhanu.utils.PieceName;
import com.bhanu.utils.SlotUtils;

/**
 * Created by bhanu.prakash on 7/17/2017.
 */
public class ChessBoard {

    private Slot [][] chessBoard;
    private int size ;

    public ChessBoard(int size) {
        this.size = size;
        chessBoard = new Slot[size][size];
        init();
    }

    public void init(){
        initBoard();
        initilizeBlack();
        initilizeWhite();
        SlotUtils.setChessBoard(getChessBoard());
    }

    public Slot[][] getChessBoard() {
        return chessBoard;
    }

    public void setChessBoard(Slot[][] chessBoard) {
        this.chessBoard = chessBoard;
    }

    private void initilizeBlack(){

        for(int i=0;i<size;i++){
            chessBoard[1][i].setPiece(new Pawn(Color.BLACK, PieceName.PAWN));
        }

        chessBoard[0][0].setPiece(new Rook(Color.BLACK, PieceName.ROOK));
        chessBoard[0][1].setPiece(new Bishop(Color.BLACK, PieceName.BISHOP));
        chessBoard[0][2].setPiece(new Knight(Color.BLACK, PieceName.KNIGHT));
        chessBoard[0][3].setPiece(new King(Color.BLACK, PieceName.KING));
        chessBoard[0][4].setPiece(new Queen(Color.BLACK, PieceName.QUEEN));
        chessBoard[0][5].setPiece(new Knight(Color.BLACK, PieceName.KNIGHT));
        chessBoard[0][6].setPiece(new Bishop(Color.BLACK, PieceName.BISHOP));
        chessBoard[0][7].setPiece(new Rook(Color.BLACK, PieceName.ROOK));
    }

    private void initilizeWhite(){

        for(int i=0;i<size;i++){
            chessBoard[6][i].setPiece(new Pawn(Color.WHITE , PieceName.PAWN));
        }

        chessBoard[7][0].setPiece(new Rook(Color.WHITE,PieceName.ROOK));
        chessBoard[7][1].setPiece(new Bishop(Color.WHITE , PieceName.BISHOP));
        chessBoard[7][2].setPiece(new Knight(Color.WHITE,PieceName.KNIGHT));
        chessBoard[7][3].setPiece(new Queen(Color.WHITE,PieceName.QUEEN));
        chessBoard[7][4].setPiece(new King(Color.WHITE,PieceName.KING));
        chessBoard[7][5].setPiece(new Knight(Color.WHITE, PieceName.KNIGHT));
        chessBoard[7][6].setPiece(new Bishop(Color.WHITE,PieceName.BISHOP));
        chessBoard[7][7].setPiece(new Rook(Color.WHITE,PieceName.ROOK));
    }

    private void initBoard(){
        for(int i=0; i<size;i++){
            for(int j=0;j<size ;j++){
                chessBoard[i][j] = new Slot(i,j);
            }
        }
    }

    public static void main(String[] args) {
        ChessBoard chessBoard = new ChessBoard(8);
        for(Slot[] rows:chessBoard.getChessBoard()){
            for(Slot slot : rows){
                System.out.print(slot+" , ");
            }
            System.out.println();
        }
    }
}
