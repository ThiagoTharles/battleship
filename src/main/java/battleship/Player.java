package battleship;

public class Player {
    private char[][] board;
    
    public char[][] getBoard() {
        return board;
    }

    public void setBoard(char[][] board) {
        this.board = board;
    }

    private Rival rival;
    
    public Rival getRival() {
        return rival;
    }

    public void setRival(Rival rival) {
        this.rival = rival;
    }

    public Player() {
        board = new char[10][10];
        rival = new Rival();
        clearBoard();
    }

    public void clearBoard() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                    board[i][j] = '-';
            }
        }
    }

    public void printBoard() {
        System.out.println("-0123456789");
        for (int i = 0; i < 10; i++) {
            System.out.print(i);
            for (int j = 0; j < 10; j++) {
                    System.out.print(board[i][j]);
            }
            System.out.println();
        }
    }

    public void predict(int x, int y) {
        if ((x<10)||(y<10)) {
            if (board[x][y] != '-') {
                System.out.println("You already shot there!");
            } else if (rival.getGrid()[x][y] == 1) {
                board[x][y] = 'X';
                System.out.println("You hit a ship!");
            }else{
                board[x][y] = '~';
                System.out.println("You missed!");
            }
            printBoard();
        }else{
            System.out.println("Invalid coordinates");}
        
    }


}
