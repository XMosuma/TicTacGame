import java.util.HashSet;
import java.util.Scanner;

public class TicTac {


    static HashSet<Integer> humanSet = new HashSet<>();
    static HashSet<Integer>  computerSet = new HashSet<>();

    public static void main(String[] args){
        CheckWinner checkWinner = new CheckWinner();
        char [][] gameBoard={
            {' ','|',' ','|',' '},
            {'=','|','=','|','='},
            {' ','|',' ','|',' '},
            {'=','|','=','|','='},
            {' ','|',' ','|',' '}};

        new GameBoard(gameBoard);
        while(true){

            new Human(gameBoard, "human");
            String result = checkWinner.checkWinner();
            if(result.length() > 0){
                System.out.println(result);
                break;
            }
            System.out.println("Computers turns");
            new Computer(gameBoard,"computer");
            result = checkWinner.checkWinner();
            if(result.length() > 0){
                System.out.println(result);
                break;
            }
            System.out.println("Your turns");

        }
        
    }
}
