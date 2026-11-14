
public class Game {

    static String sportName = "Basketball";

    public void addPoints(Team team, int points) {
        team.totalScore = team.totalScore + points;
    }

    public static void displaySport() {
        System.out.println("Sport: " + sportName);
    }

    public void determineWinner(Team team1, Team team2) {

        if (team1.totalScore > team2.totalScore) {
            System.out.println("Winner: " + team1.teamName);
        } else if (team2.totalScore > team1.totalScore) {
            System.out.println("Winner: " + team2.teamName);
        } else {
            System.out.println("The game is a tie!");
        }
    }

}