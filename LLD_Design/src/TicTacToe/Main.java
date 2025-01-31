package TicTacToe;

import TicTacToe.Player.Player;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the board size:");
        Game game = new Game(sc.nextInt());
        Player winner = game.play();
        if(isNonNull(winner)){
            System.out.println(winner.getName() + " is winner");
        }
        else {
            System.out.println("Match drawn");
        }
    }

    static boolean isNonNull(Object object){
        if(object == null){
            return false;
        }
        return true;
    }
}
