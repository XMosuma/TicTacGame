public class GameHolder {
    public GameHolder(char[][] gameBoard,int position,String user){
        char symbol = ' ';
        if(user.equals("human")){
            symbol = 'X';
            TicTac.humanSet.add(position);
        }
        else if(user.equals("computer")){
            symbol = 'O';
            TicTac.computerSet.add(position);
        }
        switch(position){
            case 1:
                gameBoard[0][0]=symbol;
                new GameBoard(gameBoard);
                break;
            case 2:
                gameBoard[0][2]=symbol;
                new GameBoard(gameBoard);
                break;
            case 3:
                gameBoard[0][4]=symbol;
                new GameBoard(gameBoard);
                break;
            case 4:
                gameBoard[2][0]=symbol;
                new GameBoard(gameBoard);
                break;
            case 5:
                gameBoard[2][2]=symbol;
                new GameBoard(gameBoard);
                break;
            case 6:
                gameBoard[2][4]=symbol;
                new GameBoard(gameBoard);
                break;
            case 7:
                gameBoard[4][0]=symbol;
                new GameBoard(gameBoard);
                break;
            case 8:
                gameBoard[4][2]=symbol;
                new GameBoard(gameBoard);
                break;
            case 9:
                gameBoard[4][4]=symbol;
                new GameBoard(gameBoard);
                break;
            default:
                System.out.println("Invalid input please enter (1-9)");
                new Human(gameBoard, "human");


        }

    }

}
