package TicTacToe;

public class Board {
    Symbols board[][];

    public Symbols[][] getBoard() {
        return board;
    }

    public int getBoardSize() {
        return boardSize;
    }

    public void setBoardSize(int boardSize) {
        this.boardSize = boardSize;
    }

    public void setBoard(Symbols[][] board) {
        this.board = board;
    }

    int boardSize;

    public Board(int boardSize){
        this.boardSize = boardSize;
        board = new Symbols[boardSize][boardSize];
    }

    public void setBoardIndex(int row, int col, Symbols symbol){
        if(row < boardSize && col < boardSize){
            this.board[row][col] = symbol;
        }
    }
    public boolean isPresent(int row, int col){
        if(this.board[row][col] == null){
            return false;
        }
        return true;
    }
    public boolean isBoardEmpty(){
        for(Symbols[] row: board){
            for(Symbols symbols: row){
                if(symbols == null){
                    return true;
                }
            }
        }
        return false;
    }
    public boolean isWon(int row, int col, Symbols symbol){
        boolean rowSame = true;
        boolean colSame = true;
        boolean leftDiagonal = true;
        boolean rightDiagonal = true;
        for(int i = 0; i< board[row].length;i ++){
            if(board[row][i] == null | board[row][i] != symbol){
                rowSame = false;
            }
        }
        for(int i = 0; i< board.length;i ++){
            if(board[i][col] == null | board[i][col] != symbol){
                colSame = false;
            }
        }
        for(int i = 0; i < boardSize; i++){
            if(board[i][i] == null | board[i][i] != symbol){
                leftDiagonal = false;
            }
        }
        for(int i = 0; i < boardSize; i++){
            if(board[i][boardSize - 1 - i] == null | board[i][boardSize - 1 - i]  != symbol){
                rightDiagonal = false;
            }
        }
        return rowSame | colSame | leftDiagonal | rightDiagonal;
    }
    public boolean isValidInput(int row, int col){
        return (row >= 0 && row < boardSize) && (col >= 0 && col < boardSize);
    }

    public void displayBoard(){
        for(Symbols[] row:board){
            for(Symbols symbols:row){
                if(symbols == null){
                    System.out.print("|_|");
                }
                else {
                    System.out.print("|" + symbols.name()+ "|") ;
                }
            }
            System.out.println();
        }
    }
}

//(0,0) (0,1) (0,2)
//(1,0) (1,1) (1,3)
//(2,0) (2,1) (2,2)
