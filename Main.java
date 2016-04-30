public class Main {

    public static void main(String[] args) {
        HangmanLogic logic = new HangmanLogic("kissa");
        HangmanUserInterface game = new HangmanUserInterface(logic);
        game.start();
    }
}
