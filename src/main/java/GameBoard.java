public class GameBoard {
    public  GameBoard( char [][] gameBoard){

        for (char[] chars : gameBoard) {
            for (int col = 0; col < gameBoard[0].length; col++) {
                System.out.print(chars[col]);
            }
            System.out.println();
        }
    }
}
