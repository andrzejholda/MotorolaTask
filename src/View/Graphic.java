package View;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Graphic {
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

}
