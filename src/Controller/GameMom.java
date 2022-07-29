package Controller;

public class GameMom extends GameEngine {
    public void checkAnswer(String[][] cards) {
        int chanceEasy = 10;
        int chanceHard = 15;

        while (true)

            if(!gameOver()) {
                System.out.println("Wiersz: A");
                String row1 = scanner.nextLine();
                System.out.println("Kolumna 1-4");
                int column1 = scanner.nextInt();

                if (!board[Integer.parseInt(row1)][column1 - 1].equals("X")) {
                    System.out.println("Już podałeś !");
                    System.out.println();

                    printBoardEasyMode();
                    continue;
                } else {
                    board[Integer.parseInt(row1)][column1 - 1] = " " + cards[Integer.parseInt(row1)][column1 - 1] + "";
                    printBoardEasyMode();
                }

                System.out.println("Wiersz: B");
                String row2 = scanner.nextLine();
                System.out.println("Kolumna 1-4");
                int column2 = scanner.nextInt();

                if (!board[Integer.parseInt(row2)][column2].equals("X")) {
                    System.out.println("Już podałeś");
                    board[Integer.parseInt(row1)][column1 - 1] = "X";
                    System.out.println();
                    printBoardEasyMode();
                    continue;
                } else {
                    board[Integer.parseInt(row2)][column2 - 1] = " " + cards[Integer.parseInt(row2)][column2 - 1] + "";

                    if (board[Integer.parseInt(row1)][column1 - 1].equals(board[Integer.parseInt(row2)][column2 - 1])) {
                        printBoardEasyMode();
                        System.out.println("Dobrze!");
                    } else {
                        printBoardEasyMode();
                        System.out.println("Żle!!!");

                        board[Integer.parseInt(row1)][column1 - 1] = "X";
                        board[Integer.parseInt(row2)][column2 - 1] = "X";
                        printBoardEasyMode();
                    }
                }

            }else {
                System.out.println("Game over !");
                break;
            }
    }
    public static boolean gameOver(){
        for (int i=1;i<3;i++){
            for(int j=1;j<5;j++){
                if(board[i][j].equals("X")){
                    return false;
                }
            }
        }return true;
    }
}
