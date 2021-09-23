
public class TennisGame1 implements TennisGame {
    
    private int scorePlayer1 = 0;
    private int scorePlayer2 = 0;
    final String player1Name;
    final String player2Name;

    public TennisGame1(String player1Name, String player2Name) {
        this.player1Name = player1Name;
        this.player2Name = player2Name;
    }

    public void wonPoint(String playerName) {
        if (playerName == "player1")
            scorePlayer1 += 1;
        if (playerName == "player2")
            scorePlayer2 += 1;
    }

    public String getScore() {
        StringBuilder score= new StringBuilder();
        int tempScore=0;
        if (scorePlayer1==scorePlayer2)
        {
            resultEqualScore(score);
        }
        else if (scorePlayer1>=4 || scorePlayer2>=4)
        {
            resultGreaterEqualScore(score);
        }
        else
        {
            resultDifferentScore(score);
        }
        return score.toString();
    }

    private void resultDifferentScore(StringBuilder score) {
        int tempScore;
        for (int i = 1; i<3; i++)
        {
            if (i==1) tempScore = scorePlayer1;
            else {
                score.append("-"); tempScore = scorePlayer2;
            }

            switch(tempScore)
            {
                case 0:
                    score.append("Love");
                    break;
                case 1:
                    score.append("Fifteen");
                    break;
                case 2:
                    score.append("Thirty");
                    break;
                case 3:
                    score.append("Forty");
                    break;
                default:
                    score.append("");
            }
        }
    }

    private void resultGreaterEqualScore(StringBuilder score) {
        int minusResult = scorePlayer1-scorePlayer2;
        if (minusResult==1) score.append("Advantage player1");
        else if (minusResult ==-1) score.append("Advantage player2");
        else if (minusResult>=2) score.append("Win for player1");
        else score.append("Win for player2");
    }

    private void resultEqualScore(StringBuilder score) {
        switch (scorePlayer1)
        {
            case 0:
                    score.append("Love-All");
                break;
            case 1:
                    score.append("Fifteen-All");
                break;
            case 2:
                    score.append("Thirty-All");
                break;
            default:
                    score.append("Deuce");
                break;

        }
    }
}
