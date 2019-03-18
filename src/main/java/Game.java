public class Game {

    // score starts at 0
    private int score = 0;

    // score based on pins knocked down but also if strike or spare happens in same turn
    public void roll(int pins){
        score += pins;

    }


    public int score(){
        return score;
    }
}
