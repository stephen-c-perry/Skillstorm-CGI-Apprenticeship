public class Athlete implements Comparable<Athlete>{

    private String name;
    private int winsTitles;
    private int eventsStarts;

    // Constructor
    public Athlete(String name, int winsTitles, int eventsStarts) {
        this.name = name;
        this.winsTitles = winsTitles;
        this.eventsStarts = eventsStarts;
    }

    @Override
    public String toString() {
        return "Athlete [name=" + name + ", winsTitles=" + winsTitles + ", eventsStarts=" + eventsStarts + "]";
    }

    //Getters and Setters
    public int getWinsTitles() {
        return winsTitles;
    }
    public void setWinsTitles(int winsTitles) {
        this.winsTitles = winsTitles;
    }
    public int getEventsStarts() {
        return eventsStarts;
    }
    public void setEventsStarts(int eventsStarts) {
        this.eventsStarts = eventsStarts;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Athlete o) {
        return Double.valueOf((double) this.getWinsTitles() / this.getEventsStarts())
        .compareTo((double) o.getWinsTitles() / o.getEventsStarts());
        
    }



    }

