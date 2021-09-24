
public class TennisGame2 implements TennisGame
{
    public int pointPlayer1 = 0;
    public int pointPlayer2 = 0;
    
    public String Person1Result = "";
    public String P2res = "";
    private String player1Name;
    private String player2Name;

    final String resultThirty = "Thirty";
    final String resultFourty = "Forty";
    final String resultFifteen = "Fifteen";

    
    public TennisGame2(String player1Name, String player2Name) {
        this.player1Name = player1Name;
        this.player2Name = player2Name;
    }

    public String getScore(){
        String score = "";

        score = resultEqual(score);

        score = resultDifferent(score);

        score = resultHigher(score);

        score = resultHighertoOne(score);

        score = resultHighertoFour(score);
        return score;
    }

    private String resultHighertoFour(String score) {
        if (pointPlayer1>=4 && pointPlayer2>=0 && (pointPlayer1-pointPlayer2)>=2)
        {
            score = "Win for player1";
        }
        if (pointPlayer2>=4 && pointPlayer1>=0 && (pointPlayer2-pointPlayer1)>=2)
        {
            score = "Win for player2";
        }
        return score;
    }

    private String resultHighertoOne(String score) {
        if (pointPlayer1 > pointPlayer2 && pointPlayer2 >= 3)
        {
            score = "Advantage player1";
        }

        if (pointPlayer2 > pointPlayer1 && pointPlayer1 >= 3)
        {
            score = "Advantage player2";
        }
        return score;
    }

    private String resultHigher(String score) {
        if (pointPlayer1>pointPlayer2 && pointPlayer1 < 4)
        {
            score = resultHigher1Score();
        }
        if (pointPlayer2>pointPlayer1 && pointPlayer2 < 4)
        {
            score = resultHigher2Score();
        }
        return score;
    }

    private String resultDifferent(String score) {
        if (pointPlayer1 > 0 && pointPlayer2==0)
        {
            score = resultDifferent1Score();
        }
        if (pointPlayer2 > 0 && pointPlayer1==0)
        {
            score = resultDifferent2Score();
        }
        return score;
    }

    private String resultEqual(String score) {
        if (pointPlayer1 == pointPlayer2 && pointPlayer1 < 4)
        {
            score = resultEqualScore(score);
        }
        if (pointPlayer1==pointPlayer2 && pointPlayer1>=3)
            score = "Deuce";
        return score;
    }

    private String resultHigher2Score() {
        String score;

        if (pointPlayer2==2)
            P2res=resultThirty;
        if (pointPlayer2==3)
            P2res=resultFourty;
        if (pointPlayer1==1)
            Person1Result=resultFifteen;
        if (pointPlayer1==2)
            Person1Result=resultThirty;
        score = Person1Result + "-" + P2res;
        return score;
    }

    private String resultHigher1Score() {
        String score;
        if (pointPlayer1==2)
            Person1Result=resultThirty;
        if (pointPlayer1==3)
            Person1Result=resultFourty;
        if (pointPlayer2==1)
            P2res=resultFifteen;
        if (pointPlayer2==2)
            P2res=resultThirty;
        score = Person1Result + "-" + P2res;
        return score;
    }

    private String resultDifferent2Score() {
        String score;
        if (pointPlayer2==1)
            P2res = resultFifteen;
        if (pointPlayer2==2)
            P2res = resultThirty;
        if (pointPlayer2==3)
            P2res = resultFourty;

        Person1Result = "Love";
        score = Person1Result + "-" + P2res;
        return score;
    }

    private String resultDifferent1Score() {
        String score;
        if (pointPlayer1==1)
            Person1Result = resultFifteen;
        if (pointPlayer1==2)
            Person1Result = resultThirty;
        if (pointPlayer1==3)
            Person1Result = resultFourty;

        P2res = "Love";
        score = Person1Result + "-" + P2res;
        return score;
    }

    private String resultEqualScore(String score) {
        if (pointPlayer1==0)
            score = "Love";
        if (pointPlayer1==1)
            score = resultFifteen;
        if (pointPlayer1==2)
            score = "Thirty";
        score += "-All";
        return score;
    }

    public void SetPerson1Score(int number){
        
        for (int i = 0; i < number; i++)
        {
            Person1Score();
        }
            
    }
    
    public void SetPerson2Score(int number){
        
        for (int i = 0; i < number; i++)
        {
            Person2Score();
        }
            
    }
    
    public void Person1Score(){
        pointPlayer1++;
    }
    
    public void Person2Score(){
        pointPlayer2++;
    }

    public void wonPoint(String player) {
        if (player.equals("player1"))
            Person1Score();
        else
            Person2Score();
    }
}