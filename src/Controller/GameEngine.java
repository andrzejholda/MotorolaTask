package Controller;

import Model.ReadFile;
import View.Graphic;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class GameEngine  {

    Random random = new Random();
    ArrayList<String> list = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    public static String [][] board=new String[3][5];
    public static String [][] cards=new String[3][5];

    public  void printBoardEasyMode(){
        //tworzę tablice w konsoli łatwą
        for(int i=1;i<3;i++){
            System.out.print("|");
            for(int j=1;j<5;j++){
                System.out.print(board[i][j]);
                System.out.print("|");
            }
            board[0][0]=null;
            board[0][1]= String.valueOf(1);
            board[1][1]=String.valueOf(2);
            System.out.println();
        }
    }

    public  void printBoardHardMode(){
        //tworzę tablice w konsoli trudna
        for(int i=1;i<3;i++){
            System.out.print("|");
            for(int j=1;j<9;j++){
                System.out.print(board[i][j]);
                System.out.print("|");
            }
            System.out.println();
        }
    }

    public void generatorWords() throws FileNotFoundException {
        //Odczytuje linijka po linijce z pliku źródłowego
        Scanner s = new Scanner(new File("C:/Programowanie/Task1/Words.txt"));
        //dodaje do listy wyrazy z pliku
        while (s.hasNext()) {
            list.add(s.next());
        }
        s.close();
//        //sprawdzam czy działa i wyświetlam wszystko
//        for(int i=0;i< list.size();i++){
//            System.out.println(list.get(i));
//    }
    }

    public void randomWords() {
        //randomizuje wyrazy
        int place;
        for (int i = 1; i < 3; i++) {
            for (int j = 1; j < 5; j++) {
                place = random.nextInt(list.size());
                cards[i][j] = list.get(place);
                list.remove(place);
            }
        }
    }


//    public void checkAnswer(String[][] cards) {
//        int chanceEasy = 10;
//        int chanceHard = 15;
//
//        while (true)
//
//            if(!gameOver()) {
//                System.out.println("Wiersz: A");
//                String row1 = scanner.nextLine();
//                System.out.println("Kolumna 1-4");
//                int column1 = scanner.nextInt();
//
//                if (!board[Integer.parseInt(row1)][column1 - 1].equals("X")) {
//                    System.out.println("Już podałeś !");
//                    System.out.println();
//
//                    printBoardEasyMode();
//                                      continue;
//                } else {
//                    board[Integer.parseInt(row1)][column1 - 1] = " " + cards[Integer.parseInt(row1)][column1 - 1] + "";
//                    printBoardEasyMode();
//                }
//
//                System.out.println("Wiersz: B");
//                String row2 = scanner.nextLine();
//                System.out.println("Kolumna 1-4");
//                int column2 = scanner.nextInt();
//
//                if (!board[Integer.parseInt(row2)][column2].equals("X")) {
//                    System.out.println("Już podałeś");
//                    board[Integer.parseInt(row1)][column1 - 1] = "X";
//                    System.out.println();
//                    printBoardEasyMode();
//                                      continue;
//                } else {
//                    board[Integer.parseInt(row2)][column2 - 1] = " " + cards[Integer.parseInt(row2)][column2 - 1] + "";
//
//                    if (board[Integer.parseInt(row1)][column1 - 1].equals(board[Integer.parseInt(row2)][column2 - 1])) {
//                        printBoardEasyMode();
//                        System.out.println("Dobrze!");
//                    } else {
//                        printBoardEasyMode();
//                        System.out.println("Żle!!!");
//
//                        board[Integer.parseInt(row1)][column1 - 1] = "X";
//                        board[Integer.parseInt(row2)][column2 - 1] = "X";
//                        printBoardEasyMode();
//                    }
//                }
//
//            }else {
//            System.out.println("Game over !");
//                break;
//        }
//    }
//    public static boolean gameOver(){
//        for (int i=1;i<3;i++){
//            for(int j=1;j<5;j++){
//                if(board[i][j].equals("X")){
//                    return false;
//                }
//            }
//        }return true;
//    }
}




