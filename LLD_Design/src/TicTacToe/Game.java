package TicTacToe;

import TicTacToe.Player.Player;
import TicTacToe.Player.PlayerX;
import TicTacToe.Player.PlayerY;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Game {
    Board board;
    List<Player> playerList;
    Scanner scanner = new Scanner(System.in);

    public Game(int boardSize){
        initializeVariable(boardSize);
    }

    public void initializeVariable(int boardSize){
        board = new Board(boardSize);
        Player player1 = new PlayerX("Ram", Symbols.X);
        Player player2 = new PlayerY("Sham", Symbols.O);
        playerList = new ArrayList<>();
        playerList.add(player1);
        playerList.add(player2);
    }
    public Player play(){
        while(true){
            Player player = playerList.removeFirst();
            System.out.println("Please enter row and col of the player");
            System.out.println("Enter the row");
            int row = scanner.nextInt();
            System.out.println("Enter the column");
            int col = scanner.nextInt();
            if(!board.isBoardEmpty()){
                return null;
            }
            boolean wrongInput = board.isValidInput(row, col);
            if((!wrongInput) || board.isPresent(row, col)){
                playerList.addFirst(player);
                System.out.println("Wrong input! Please give correct input");
                continue;
            }
            board.setBoardIndex(row, col, player.getSymbol());
            if(board.isWon(row, col, player.getSymbol())){
                return player;
            }
            playerList.addLast(player);
            board.displayBoard();
        }
    }
}
