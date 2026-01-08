public class FootballPlayer extends Player{
    private int playerNumber;
    private String position;
    
    public void setPlayerNumber(int n) {
        this.playerNumber = n;
    }
    public void setPosition(String p) {
        this.position = p;
    }
    public int getPlayerNumber() {
        return this.playerNumber;
    }
    public String getPosition() {
        return this.position;
    }
    
    public boolean isSamePosition(FootballPlayer p) {
        boolean sameTeam = this.getTeam().equals(p.getTeam());
        boolean samePosition = this.position.equals(p.getPosition());
        return sameTeam && samePosition;
    }
}
