
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Game.displaySport();

        System.out.print("Enter the first team name: ");
        String name1 = input.nextLine();

        System.out.print("Enter the second team name: ");
        String name2 = input.nextLine();

        Team team1 = new Team(name1);
        Team team2 = new Team(name2);

        Game game = new Game();

        System.out.print("How many quarters? ");
        int quarters = input.nextInt();

        int quarter = 1;

        while (quarter <= quarters) {

            System.out.println("\nQuarter " + quarter);

            System.out.print("Enter points for " + team1.teamName + ": ");
            int score1 = input.nextInt();

            System.out.print("Enter points for " + team2.teamName + ": ");
            int score2 = input.nextInt();

            game.addPoints(team1, score1);
            game.addPoints(team2, score2);

            quarter++;
        }

        System.out.println("\nFINAL SCOREBOARD");

        team1.displayInfo();
        team2.displayInfo();

        game.determineWinner(team1, team2);

        input.close();
    }
}


