public class SpringSeason {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Usage: java SpringSeason <month> <day>");
            return;
        }
        int month = Integer.parseInt(args[0]);
        int day = Integer.parseInt(args[1]);
        boolean isSpring = checkSpringSeason(month, day);
        if (isSpring) System.out.println("Its a Spring Season");
        else System.out.println("Not a Spring Season");
    }

    public static boolean checkSpringSeason(int month, int day) {
        // Spring season: March 20 to June 20
        if (month < 3 || month > 6) return false;
        if (month == 3 && day < 20) return false;
        if (month == 6 && day > 20) return false;
        return true;
    }
}
