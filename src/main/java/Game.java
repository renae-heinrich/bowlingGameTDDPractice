public class Game {

    // score starts at 0
    private int score = 0;

    // roll calculates score, but name does not imply that
    public void roll(int pins){
        score += pins;

    }

    // score does not calculate score, but name implies that it does
    public int score(){
        return score;
    }
}
