package scenario.examproctor;
import java.util.*;

public class ExamProctor {

    private Stack<Integer> navigationStack = new Stack<>();
    private HashMap<Integer, String> answerMap = new HashMap<>();
    private HashMap<Integer, String> correctAnswers = new HashMap<>();

    public ExamProctor() {
        correctAnswers.put(1, "A");
        correctAnswers.put(2, "B");
        correctAnswers.put(3, "C");
        correctAnswers.put(4, "D");
    }

    public void visitQuestion(int questionId) {	// Track navigation
        navigationStack.push(questionId);
        System.out.println("Visited Question: " + questionId);
    }

    public void submitAnswer(int questionId, String answer) {	//Storing Answres
        answerMap.put(questionId, answer);
        System.out.println("Answer saved for Question " + questionId);
    }

    public void showLastVisitedQuestion() {
        if (navigationStack.isEmpty()) {
            System.out.println("No questions visited.");
        } else {
            System.out.println("Last Visited Question: " + navigationStack.peek());
        }
    }

    public int calculateScore() {
        int score = 0;

        for (Map.Entry<Integer, String> entry : answerMap.entrySet()) {
            int qId = entry.getKey();
            String studentAnswer = entry.getValue();

            if (correctAnswers.containsKey(qId) &&
                correctAnswers.get(qId).equalsIgnoreCase(studentAnswer)) {
                score++;
            }
        }
        return score;
    }
}
