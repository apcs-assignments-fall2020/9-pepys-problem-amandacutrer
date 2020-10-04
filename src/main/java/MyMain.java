public class MyMain {

    // Calculate the probability of rolling at least one 6 when rolling 
    // six dice. Uses 10000 trials.
    // Returns in the answer as a double corresponding to the percentage
    // For example, 75.5% would be 75.5
    public static double probabilityOneSix() {
        int trial = 0;
        for (int i = 0; i < 10000; i++){
            for(int j = 0; j < 6; j++){
                if ((int)((Math.random() * 6)+1) == 6){
                    trial++;
                    break;
                }
            }
        }
        return (double)trial / (double)(10000) * 100;
    }

    // Calculate the probability of rolling at least two 6's when rolling 
    // twelve dice. Uses 10000 trials.
    public static double probabilityTwoSixes() {
        int trial = 0;
        for (int i = 0; i < 10000; i++){
            int sixes = 0;
            for(int j = 0; j < 12; j++){
                if ((int)((Math.random() * 6)+1) == 6){
                    sixes += sixes;
                }
                    if (sixes >= 2){
                    trial++;
                    break;
                    }
                
            }
    }

    System.out.println(trial);
        return (double)trial / (double)(10000) * 100;
    }

    // Calculate the probability of rolling at least three 6's when rolling 
    // eighteen dice. Uses 10000 trials.
    public static double probabilityThreeSixes() {
        // REPLACE WITH YOUR CODE HERE
        return -1.0;
    }


    public static void main(String[] args) {
        System.out.println(probabilityOneSix());
        System.out.println(probabilityTwoSixes());
    }
}
