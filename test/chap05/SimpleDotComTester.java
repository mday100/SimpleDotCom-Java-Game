package chap05;


public class SimpleDotComTester {
    public static void main(String[] args)
    {
        SimpleDotCom dot = new SimpleDotCom();
        int[] locations = {2, 3, 4};
        dot.setLocationCells(locations);
        String userGuess = "1";
        String result = dot.checkYourself(userGuess);
        userGuess = "2";
        result = dot.checkYourself(userGuess);
        userGuess = "3";
        result = dot.checkYourself(userGuess);
        userGuess = "4";
        result = dot.checkYourself(userGuess);        
    }
}
