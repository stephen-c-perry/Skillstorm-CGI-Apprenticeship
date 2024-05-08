public class TestClass {
    public static void main(String[] args){
       int i = 0;
       switch(args[0]) { 
 
           default : i = i + 3;
           case "2" : i = i + 2;
           case "0" : break;
           case "1" : i = i + 1;
 
 
        }
        
        System.out.println("i is "+i);
    }
 }
 
 //Deshmukh, Hanumant; Java Certification, Enthuware. OCFA Java Foundations Exam Fundamentals 1Z0-811: Study guide for Oracle Certified Foundations Associate, Java Certification (pp. 145-146). Enthuware. Kindle Edition. 