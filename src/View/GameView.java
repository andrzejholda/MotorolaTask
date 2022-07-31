package View;

import Model.Card;
import Model.Cards;
import com.sun.jdi.IntegerValue;

import java.util.Map.Entry;
import java.util.Random;
import java.util.Scanner;
import java.util.SortedMap;

public class GameView {

    Random random = new Random();

    Scanner scanner = new Scanner(System.in);
    Scanner scanner1 = new Scanner(System.in);
    public static String[][] board = new String[3][8];


    public void printInitialBoard(int boardsize) {
        //tworzę tablice w konsoli łatwą lub trudna

        for (int i = 0; i < 3; i++) {
            if(i==0){
                System.out.print("  ");
            }
            if(i!=0){
                System.out.print(Character.toString((char) i+64)+" ");
            }

            for (int j = 0; j < boardsize; j++) {

                if(i==0){
                    System.out.print(j + 1 + " ");
                }else {
                    System.out.print(board[i][j] = "X"+" ");

                }
            }

            System.out.println();
        }
    }
    public void printBoard(int boardsize, Cards cards) {

        System.out.print(" ");
        for (int i = 0; i < boardsize; i++) {
            System.out.print(" " + (i + 1));
        }
        System.out.println();
        for (Entry<String, Card> card : cards.getCards().entrySet()) {
            if (Character.getNumericValue(card.getKey().toString().charAt(1))<= boardsize) {
             //   int n = Character.getNumericValue(card.getKey().toString().charAt(1));
                if (card.getKey().equals("A1") || card.getKey().equals("B1")) {
                    System.out.print(card.getKey().toString().charAt(0) + " ");
                }
                if (card.getValue().isHiden()) {
                    System.out.print("X ");
                } else {
                    System.out.print(card.getValue().getWord() + " ");
                }
            }
            if (Character.getNumericValue(card.getKey().toString().charAt(1))==boardsize) {
                System.out.println();
            }
        }
    }
//    public void cheeckCorrectly(String column,String row){
//        for (Entry<String,Card>cardEntry:cards.getLocalization().charAt(Integer.parseInt(column+row))){
//
//
//        }
//    }
}




