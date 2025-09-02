import java.util.Scanner;

public class q9 {
    public static String getComputerChoice() {
        int random = (int) (Math.random() * 3);
        if (random == 0) return "rock";
        else if (random == 1) return "paper";
        else return "scissors";
    }

    public static String getResult(String user, String computer) {
        if (user.equals(computer)) return "Draw";
        if ((user.equals("rock") && computer.equals("scissors")) ||
            (user.equals("paper") && computer.equals("rock")) ||
            (user.equals("scissors") && computer.equals("paper"))) {
            return "User Wins";
        }
        return "Computer Wins";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of games: ");
        int rounds = sc.nextInt();
        sc.nextLine(); // clear buffer

        int userWins = 0, compWins = 0, draws = 0;

        System.out.println("Game\tUser\tComputer\tResult");
        for (int i = 1; i <= rounds; i++) {
            System.out.print("Enter your choice (rock/paper/scissors): ");
            String user = sc.nextLine().toLowerCase();
            String computer = getComputerChoice();
            String result = getResult(user, computer);

            if (result.equals("User Wins")) userWins++;
            else if (result.equals("Computer Wins")) compWins++;
            else draws++;

            System.out.println(i + "\t" + user + "\t" + computer + "\t\t" + result);
        }

        System.out.println("\nFinal Stats:");
        System.out.println("User Wins: " + userWins);
        System.out.println("Computer Wins: " + compWins);
        System.out.println("Draws: " + draws);
        System.out.printf("User Win %%: %.2f%%\n", (userWins * 100.0 / rounds));
        System.out.printf("Computer Win %%: %.2f%%\n", (compWins * 100.0 / rounds));
    }
}
