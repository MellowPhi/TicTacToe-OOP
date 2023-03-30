package tictactoe;

public enum BoardValue {
    CROSS('X'), NOUGHT('O'), EMPTY('_');
    private final char value;
    BoardValue(char value) {
        this.value = value;
    }

    public char getValue(){
        return this.value;
    }
}
