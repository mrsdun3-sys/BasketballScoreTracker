public class Team {

    String teamName;
    int totalScore;

    public Team(String name) {
        teamName = name;
        totalScore = 0;
    }

    public void displayInfo() {
        System.out.println(teamName + ": " + totalScore);
    }
}