public class AthleteRounds {
    public int numberOfRounds(int[] dist, int speed, int minutes) {
        int totalDistance = 0;
        for (int d : dist) {
            totalDistance += d;
        }
        int totalTime = (totalDistance + speed - 1) / speed; 
        return minutes == 0 ? 0 : totalTime / minutes;
    }

    public static void main(String[] args) {
        AthleteRounds ar = new AthleteRounds();
        int[] dist = {100, 200, 150};
        int speed = 50;
        int minutes = 10;
        System.out.println(ar.numberOfRounds(dist, speed, minutes));
    }
}
