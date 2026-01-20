package scenario.examproctor;
public class Main {
    public static void main(String[] args) {

        ExamProctor exam = new ExamProctor();

        exam.visitQuestion(1);
        exam.visitQuestion(2);
        exam.visitQuestion(3);
        
        exam.submitAnswer(1, "A");
        exam.submitAnswer(2, "C");
        exam.submitAnswer(3, "C");

        exam.showLastVisitedQuestion();
        
        int score = exam.calculateScore();
        System.out.println("Final Score: " + score);
    }
}
