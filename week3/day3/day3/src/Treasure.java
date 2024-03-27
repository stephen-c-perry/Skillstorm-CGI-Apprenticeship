public class Treasure {
    private String name;
    private String description;
    private double value;
    public String getName() {
        return name;
    }
    public String getDescription() {
        return description;
    }
    public double getValue() {
        return value;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public void setValue(double value) {
        this.value = value;
    }
    @Override
    public String toString() {
        return "Treasure [name=" + name + ", description=" + description + ", value=" + value + "]";
    }

    //constructor
    public Treasure(String name, String description, double value) {
        this.name = name;
        this.description = description;
        this.value = value;

    }
    
    }