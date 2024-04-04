package SampleCode;

import java.util.Scanner;

public class QuestionService {

    Question[] questions = new Question[5];
    String selection[] = new String[5];
    int score = 0;


    public QuestionService() {
        questions[0] = new Question(1, "What is the capital of India?", "Mumbai", "Delhi", "Kolkata", "Chennai", "Delhi");
        questions[1] = new Question(2, "What is the capital of Australia?", "Sydney", "Melbourne", "Canberra", "Perth", "Canberra");
        questions[2] = new Question(3, "What is the capital of USA?", "New York", "Washington DC", "Los Angeles", "Chicago", "Washington DC");
        questions[3] = new Question(4, "What is the capital of UK?", "Manchester", "Birmingham", "London", "Liverpool", "London");
        questions[4] = new Question(5, "What is the capital of France?", "Paris", "Lyon", "Marseille", "Toulouse", "Paris");


    }

    public void playQuiz() {

        int i = 0;

        for (Question q : questions) {
            System.out.println("question = " + q.getId());
            System.out.println("question = " + q.getQuestion());
            System.out.println("option 1 = " + q.getOpt1());
            System.out.println("option 2 = " + q.getOpt2());
            System.out.println("option 3 = " + q.getOpt3());
            System.out.println("option 4 = " + q.getOpt4());
            Scanner sc = new Scanner(System.in);
            selection[i] = sc.nextLine();

            i++;
        }
        //System.out.println("question[0] = " + questions[0].getQuestion());

        for (String s : selection) {
            System.out.println("selection = " + s);
        }
    }
        public  void checkAnswers () {

            int score = 0;
            for (int i = 0; i < questions.length; i++) {
                if (questions[i].getAnswer().equals(selection[i])) {
                    score++;
                }



            }
            System.out.println("Your score is " + score);
        }
}



