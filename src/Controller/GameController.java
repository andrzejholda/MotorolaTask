package Controller;

import Model.Card;
import Model.Cards;
import View.GameView;


import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.KeyStore;
import java.util.ArrayList;
import java.util.Map.Entry;
import java.util.Random;
import java.util.Scanner;

public class GameController  {

    private GameView gameView=new GameView();

    private Cards cards=new Cards();

    public GameController(){}
    Scanner scanner=new Scanner(System.in);
    Scanner scanner1=new Scanner(System.in);
    Scanner scanner2=new Scanner(System.in);
    Random random=new Random();
    private int level;
    private int column;
    private String row;
   public int getLevel(){
       return this.level;
   }
    public void initialBoard(){

        System.out.println("Wybierz poziom gry: 1 = łatwy, 2 = trudny");
        level=scanner2.nextInt();
        if(level==1){
//            System.out.println(" Level : Easy");
//            System.out.println();
            level=4;
        }else {
//            System.out.println("Level : Hard");
//            System.out.println();
            level=8;
        }
        try {
            cards.doubleWords(level);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        gameView.printBoard(level,this.cards);
    }


    public void firstMove(int boardsize) {



        System.out.println("Podaj kolumnę:");
        column = Integer.parseInt(scanner.nextLine());
        System.out.println("Podaj wiersz");
        row = scanner1.nextLine();
        //       String word= cards.getCards().stream()
//        for (Entry<String, Card> entry : cards.getCards().entrySet()) {
//
//            if (entry.getKey().equals( String.valueOf(row + column))) {
//                entry.getValue().setHiden(false);
//            }
//        }
        cards.getCards().get( String.valueOf(row + column)).setHiden(false);
        gameView.printBoard(boardsize, this.cards);

    }

}
