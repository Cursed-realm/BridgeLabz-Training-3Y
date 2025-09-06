public class AthleteRounds {
    public static void main(String[] args) {
        int[] rounds = {1, 2, 3, 4, 5};
        String[] athletes = {"Alice", "Bob", "Charlie", "Diana", "Ethan"};

        System.out.printf("%-10s", "Athlete");
        for (int round : rounds) {
            System.out.printf("Round %d  ", round);
        }
        System.out.println();

        for (String athlete : athletes) {
            System.out.printf("%-10s", athlete);
            for (int round : rounds) {
                System.out.printf("%-9d", round);
            }
            System.out.println();
        }
    }
}