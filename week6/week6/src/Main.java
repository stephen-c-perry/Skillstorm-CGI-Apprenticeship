import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Athlete> athletes = new ArrayList<>(8);
        athletes.add(new Athlete("Jack Nicklaus", 73, 595));
        athletes.add(new Athlete("Lindsey Vonn", 82, 395));
        athletes.add(new Athlete("Mikaela Shiffrin", 82, 232));
        athletes.add(new Athlete("Novak Djokovic", 92, 280));
        athletes.add(new Athlete("Rafael Nadal", 92, 304));
        athletes.add(new Athlete("Roger Federer", 103, 367));
        athletes.add(new Athlete("Serena Williams", 73, 240));
        athletes.add(new Athlete("Tiger Woods", 82, 371));

        //Collections.sort(athletes, winRateComparator.reversed());
        Collections.sort(athletes,Collections.reverseOrder());
        System.out.println(athletes);

    }

    public static Comparator<Athlete> winRateComparator = (athlete1, athlete2) -> {
        return Double.valueOf((double) athlete1.getWinsTitles() / athlete1.getEventsStarts())
                .compareTo((double) athlete2.getWinsTitles() / athlete2.getEventsStarts());
    };

}
