package src;
import java.util.ArrayList;

public class Programmer {
    private String name;
    private String language;
    private String company;
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getLanguage() {
        return language;
    }
    public void setLanguage(String language) {
        this.language = language;
    }
    public String getCompany() {
        return company;
    }
    public void setCompany(String company) {
        this.company = company;
    }
    public Programmer(String name, String language, String company) {
        this.name = name;
        this.language = language;
        this.company = company;
    }

    //next step: method for forgetting language.
    
}
