package SampleCode;


public class Sampletest
{
    public static void main(String[] args) {

        QuestionService questionService = new QuestionService();
        questionService.playQuiz();
        questionService.checkAnswers();

    }
}
