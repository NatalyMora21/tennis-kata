
public class TennisGame1 implements TennisGame {
    
    private int socorePlayer1 = 0;
    private int socorePlayer2 = 0;
    private String player1Name;
    private String player2Name;

    public TennisGame1(String player1Name, String player2Name) {
        this.player1Name = player1Name;
        this.player2Name = player2Name;
    }

    public void wonPoint(String playerName) {


        if (playerName == "player1")
            socorePlayer1 += 1;

        if (playerName == "player2")
            socorePlayer2 += 1;
    }

    public String getScore() {
        //String score = "";
        StringBuilder score= new StringBuilder();
        int tempScore=0;
        if (socorePlayer1==socorePlayer2)
        {
            switch (socorePlayer1)
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
        else if (socorePlayer1>=4 || socorePlayer2>=4)
        {
            int minusResult = socorePlayer1-socorePlayer2;
            if (minusResult==1) score.append("Advantage player1");
            else if (minusResult ==-1) score.append("Advantage player2");
            else if (minusResult>=2) score.append("Win for player1");
            else score.append("Win for player2");
        }
        else
        {
            for (int i=1; i<3; i++)
            {
                if (i==1) tempScore = socorePlayer1;
                else {
                    score.append("-"); tempScore = socorePlayer2;
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
                }
            }
        }
        return score.toString();
    }
}
