public class Computer {

    public  Computer(char[][] gameBoard, String cpu) {
        TicTac ticTac = new TicTac();

        int computerPosition =generateRandom();
        while(TicTac.humanSet.contains(computerPosition) || TicTac.computerSet.contains(computerPosition)){
            computerPosition = generateRandom();
        }
       new GameHolder(gameBoard, computerPosition, cpu);


    }
    public int generateRandom(){
        int maximum = 9;
        int minimum = 1;
        int range = maximum - minimum + 1;
        return (int) (Math.random()*range)+ minimum;

    }

}
