import View.Graphic;
import Controller.GameEngine;
import View.Graphic;

import java.io.FileNotFoundException;

public class MemoryGame {
    public static void main(String[] args) throws FileNotFoundException {

        Graphic graphic = new Graphic();
        graphic.printBoardEasyMode();
        GameEngine gameEngine=new GameEngine();
        gameEngine.printBoardEasyMode();
        gameEngine.generatorWords();
        gameEngine.randomWords();
        gameEngine.;

    }
}
