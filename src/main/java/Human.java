import java.util.Scanner;

public class Human {
    public Human(char[][] gameBoard, String user){
        TicTac ticTac = new TicTac();

        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter values from (1-9): ");
        int userPosition = userInput.nextInt();
        while(TicTac.humanSet.contains(userPosition) || TicTac.computerSet.contains(userPosition) || !(String.valueOf(userPosition).matches("[1-9]+"))){
            System.out.println("Invalid input/Enter a value which is not being entered from (1-9)");
            userPosition = userInput.nextInt();
        }
        new GameHolder(gameBoard, userPosition,user);

    }
}
