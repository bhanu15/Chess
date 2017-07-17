package com.bhanu.game;

import com.bhanu.board.ChessBoard;
import com.bhanu.board.Slot;
import com.bhanu.pieces.Piece;
import com.bhanu.player.Computer;
import com.bhanu.player.Human;
import com.bhanu.player.Player;
import com.bhanu.utils.Color;
import com.sun.javafx.scene.control.skin.SkinBase;

import java.util.Scanner;

/**
 * Created by bhanu.prakash on 7/17/2017.
 */
public class Game {

    ChessBoard chessBoard;
    Player firstPlayer;
    Player secondPlayer;

    public Game(ChessBoard chessBoard, Player firstPlayer, Player secondPlayer) {
        this.chessBoard = chessBoard;
        this.firstPlayer = firstPlayer;
        this.secondPlayer = secondPlayer;
    }

    public void move(Piece piece, Slot to) {
        piece.move(to);
    }

    public ChessBoard getChessBoard() {
        return chessBoard;
    }

    public void setChessBoard(ChessBoard chessBoard) {
        this.chessBoard = chessBoard;
    }

    public static void main(String[] args) {
        ChessBoard chessBoard = new ChessBoard(8);

        Player humanPlayer = new Human(Color.BLACK);
        Player computerPlayer = new Computer(Color.WHITE);

        Game game = new Game(chessBoard, computerPlayer, humanPlayer);

        game.firstPlayer.move(game.getSlot(1, 0), game.getSlot(2, 0));
        game.secondPlayer.move(game.getSlot(6, 0), game.getSlot(5, 0));

        System.out.println(game.getSlot(2, 0));
        System.out.println(game.getSlot(1, 0));

        System.out.println(game.getSlot(5, 0));
        System.out.println(game.getSlot(6, 0));

        Scanner input = new Scanner(System.in);

        while (input.hasNext()){
            System.out.println(game.getPosition(input.nextLine()));
        }

    }

    public Slot getSlot(int x, int y) {
        int size = chessBoard.getChessBoard().length;
        if (x >= size || y >= size || x < 0 || y < 0) {
            return null;
        }
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == x && j == y) {
                    return chessBoard.getChessBoard()[i][j];
                }
            }
        }
        return null;
    }

    Slot getPosition(String input){
        int args[] = new int[2];
        int index =0;

        for(String s : input.split(",").length>1?input.split(",") : input.split(" ")){
            args[index] = Integer.valueOf(s);
        }
        return getSlot(args[0] , args[1]);
    }
}
