package Main;

import Controller.ControllerClass;
import View.Game;

public class App {
    public static void main(String[] args) {
        Game game = new Game();
        ControllerClass controller = new ControllerClass(game);
        controller.begin();
    }
}
