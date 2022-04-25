import java.util.HashSet;

public class CheckWinner {

    public String checkWinner(){
        // Row 1
        HashSet<Integer> row1 = new HashSet<>();
        row1.add(1); row1.add(2); row1.add(3);

        // Row 2
        HashSet<Integer> row2 = new HashSet<>();
        row2.add(4);row2.add(5);row2.add(6);

        // Row 3
        HashSet<Integer> row3 = new HashSet<>();
        row3.add(7);row3.add(8);row3.add(9);


        // col 1
        HashSet<Integer> col1 = new HashSet<>();
        col1.add(1);col1.add(4);col1.add(7);

        // col 2
        HashSet<Integer> col2 = new HashSet<>();
        col2.add(2);col2.add(5);col2.add(8);

        HashSet<Integer> col3 = new HashSet<>();
        col3.add(3);col3.add(6);col3.add(9);

        // d 1
        HashSet<Integer> d1 = new HashSet<>();
        d1.add(1);d1.add(5);d1.add(9);

        // d 2
        HashSet<Integer> d2 = new HashSet<>();
        d2.add(3);d2.add(5);d2.add(7);

        HashSet<HashSet> sets = new HashSet<>();
        sets.add(row1);
        sets.add(row2);
        sets.add(row3);
        sets.add(col1);
        sets.add(col2);
        sets.add(col3);
        sets.add(d1);
        sets.add(d2);
        for(HashSet x:sets){
            if(TicTac.humanSet.containsAll(x)){
                return "Congratulation You Won!!";
            }
            else if(TicTac.computerSet.containsAll(x)){
                return "You lost!!,Computer Won this time!!";
            }
        }
        if(TicTac.humanSet.size() + TicTac.computerSet.size() == 9){
            return "It's a Draw";
        }
        return "";

    }

}
