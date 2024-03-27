import java.util.Arrays;

public class TreasureChest {
    //properties
   private String description;
   private boolean isLocked;
   private Treasure[] contents;
   private final int MAX_SIZE = 10;
   private int numItems;

   //getters and setters

    public String getDescription() {
        return description;
    }
    public boolean isLocked() {
        return isLocked;
    }
    public Treasure[] getContents() {
      if (isLocked) {
            return null;
        } else {
            return contents;
        }
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    public void setLocked(boolean isLocked) {
        this.isLocked = isLocked;
    }
    public void setContents(Treasure[] contents) {
        this.contents = contents;
    }

    //methods
    @Override
    public String toString() {
        if (isLocked())
            return "The treasure chest is locked. ";
        return "TreasureChest [description=" + description + ", isLocked=" + isLocked + ", contents="
                + Arrays.toString(contents) + ", MAX_SIZE=" + MAX_SIZE + ", numItems=" + numItems + "]";
    }

    //constructor
    public TreasureChest(String description, boolean isLocked){
        this.description = description;
        this.isLocked = isLocked;
    }
  
    
}



