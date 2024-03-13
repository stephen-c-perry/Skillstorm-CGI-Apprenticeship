import java.util.Scanner;

public class studentGrades {

    /*
    Instructions
    In your group, write a program for calculating a students grade based on the grade breakdown:

    Assignments: 25%
    Quizzes: 25%
    Projects: 50%
    
    Output the result, for example:

    Enter in your overall assignment grade as a number between 0-100: 90 
    Enter in your overall quiz grade as a number between 0-100: 80
    Enter in your overall project grade as a number between 0-100: 70

    Your overall grade is: 80% */

    public static void main(String[] args) {

        double assignments, quizzes, projects;

        Scanner scanner = new Scanner(System.in);
        
        //prompts
        System.out.println("Enter in your overall assignment grade as a number between 0-100: ");
        assignments = scanner.nextDouble();

        System.out.println("Enter in your overall quiz grade as a number between 0-100: ");
        quizzes = scanner.nextDouble();

        System.out.println("Enter in your overall project grade as a number between 0-100: ");
        projects = scanner.nextDouble();

        // calculation
        double weightedAssignments = assignments * .25;
        double weightedQuizzes = quizzes * .25;
        double weightedProjects = projects * .50;

        System.out.println("Your overall grade is: " + (weightedAssignments + weightedQuizzes + weightedProjects) + "%");

        scanner.close();
        
    }

}