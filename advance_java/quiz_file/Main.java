/*
 * to do later
 * What if multiple trainers want to access the switch case
 */
package advance_java.quiz_file;

import java.util.Scanner;

import advance_java.quiz_file.Candidates.CandidatesService;
import advance_java.quiz_file.Trainer.QuestionService;

@SuppressWarnings("unused")
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of Questions you want to store: ");
        int numberOfQuestions = sc.nextInt();
        QuestionService trainer1 = new QuestionService(numberOfQuestions, sc);
        // System.out.println(
        //         "Press 1 for displaying questions\nPress 2 for displaying answers\nPress 3 to close the service");
        // int choice = sc.nextInt();
        // switch (choice) {
        //     case 1:
        //         System.out.print("Enter the question number: ");
        //         int questionNo = sc.nextInt();
        //         trainer1.displayQuestion(questionNo);
        //         break;
        //     case 2:
        //         System.out.print("Enter the question number: ");
        //         int ansNo = sc.nextInt();
        //         trainer1.displayAnswer(ansNo);
        //         break;
        //     case 3:
        //         System.out.println("Thank you");
        //         break;
        //     default:
        //         System.out.println("Enter a proper question number !!!");
        //         break;
        // }
        CandidatesService obj=new CandidatesService(trainer1);
        obj.playTest(trainer1, sc);
    }
}
