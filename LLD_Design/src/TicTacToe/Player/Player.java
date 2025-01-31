package TicTacToe.Player;

import TicTacToe.Symbols;

public class Player {
    String name;
    private Symbols symbol;

    public Symbols getSymbol() {
        return symbol;
    }

    public void setSymbol(Symbols symbol) {
        this.symbol = symbol;
    }

    public Player(String name, Symbols symbol){
        this.name = name;
        this.symbol = symbol;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
