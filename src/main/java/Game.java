public class Game {

    private int rolls[] = new int[21];
    private int currentRoll = 0;


    public void roll(int pins){
        rolls[currentRoll++] = pins;

    }

    public int score() {
        int score = 0;
        int frameIndex = 0;
        for (int frame = 0; frame < 10; frame++ ) {
            if(rolls[frameIndex] + rolls[frameIndex + 1] == 10)//if in one frame, player throws a spare
                //add 10 to players turn and the value of the third index, the value of the first index of the new frame
                 {score += 10 + rolls[frameIndex + 2];
                 frameIndex += 2;
                 } else {
                score += rolls[frameIndex] + rolls[frameIndex + 1];
                frameIndex += 2;
            }
        }
        return score;


        }

}
