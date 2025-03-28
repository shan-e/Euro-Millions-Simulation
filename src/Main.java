import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int ticketSize = 5;
        int[][] tickets = new int[ticketSize][7];
        Main main = new Main();
        main.generateTickets(tickets, ticketSize);
        int[][] winningTicket = new int[1][7];
        main.generateTickets(winningTicket, 1);
        for (int[] x : tickets) System.out.println(Arrays.toString(x));
        System.out.println();
        System.out.println(Arrays.deepToString(winningTicket));
    }

    private void generateTickets(int[][] tickets, int ticketSize) {
        Random random = new Random();
        for (int i = 0; i < ticketSize; i++) for (int j = 0; j < 5; j++) tickets[i][j] = random.nextInt(1, 50);
        for (int i = 0; i < ticketSize; i++) for (int j = 5; j < 7; j++) tickets[i][j] = random.nextInt(1, 12);
    }
}