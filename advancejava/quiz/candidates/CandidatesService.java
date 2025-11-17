package advancejava.quiz.candidates;

import java.util.Scanner;

import advancejava.quiz.trainer.QuestionService;

public class CandidatesService {
    public int score;
    public int[] answers;

    public CandidatesService(QuestionService trainerNo) {
        answers = new int[trainerNo.questions.length];
    }

    public void playTest(QuestionService trainerNo, Scanner sc) {
        if (trainerNo.questions.length == 0 || trainerNo.questions[0] == null) {
            System.out.println("Questions are not available");
            return;
        }
        for (int i = 0; i < trainerNo.questions.length; i++) {
            trainerNo.displayQuestion(i);
            System.out.println("\n");
            trainerNo.displayOptions(i);
            System.out.print("Enter your option: ");
            answers[i] = sc.nextInt();
        }
        sc.close();
        displayScore(trainerNo);
    }

    private void displayScore(QuestionService trainerNo) {
        for (int i = 0; i < trainerNo.questions.length; i++) {
            if (trainerNo.questions[i].getAnswer() == answers[i]) {
                score++;
            }
        }
        System.out.println("Your Score is: " + score+" out of "+trainerNo.questions.length);
    }
}
