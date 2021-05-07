public class Team {
    
    private Integer teamID;
    
    private Player player;
    
    private Coach coach;
    
    public Integer getTeamID() {
        return this.teamID;
    }
    
    public Integer setTeamID(Integer teamID) {
        this.teamID = teamID;
    }
    
    public Coach getCoach() {
        return this.coach;
    }
    
    public Coach setCoach(Coach coach) {
        this.coach = coach;
    }
    
    public Player getPlayer() {
        return this.player;
    }
    
    public Player setPlayer(Player player) {
        this.player = player;
    }
    
}
