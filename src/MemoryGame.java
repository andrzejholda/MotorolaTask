import Controller.GameController;
import View.Graphic;
import View.GameView;

import java.io.FileNotFoundException;
import java.util.Map;

public class MemoryGame {
    public static void main(String[] args) throws FileNotFoundException {


       GameController gameController=new GameController();
        gameController.initialBoard();
        int move=2;
        for(int i=0;i<move;i++) {
            gameController.firstMove(gameController.getLevel());
        }



    }
}
