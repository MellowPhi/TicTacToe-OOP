package tictactoe;

public enum Game {
    DRAW, X_WINS, O_WINS, PLAYING, IMPOSSIBLE;
    private Game state;
    Game(Game state) {
        this.state = state;
    }

    public void checkGameStatus(Board gameBoard) {

    }

}
