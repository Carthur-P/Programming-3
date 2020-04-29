package bit.pongp1.mathquiz;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by pongp1 on 7/06/2018.
 */

public class Question {
    Random rand;
    String[] questions = new String[5];
    int[] answer = new int[5];

    public Question()
    {
        rand = new Random();

    }

    public void createQuestion()
    {

        for(int i = 0; i < questions.length; i++)
        {
            int num1 = rand.nextInt(11);
            int num2 = rand.nextInt(11);
            questions[i] = Integer.toString(num1) + " + " + Integer.toString(num2);
            answer[i] = num1 + num2;
        }
    }

    public String[] getQuestions() {
        return questions;
    }

    public int[] getAnswer() {
        return answer;
    }

    public void setQuestions(String[] questions) {
        this.questions = questions;
    }

    public void setAnswer(int[] answer) {
        this.answer = answer;
    }

    @Override
    public String toString() {
        return "Question{" +
                "questions=" + Arrays.toString(questions) +
                ", answer=" + Arrays.toString(answer) +
                '}';
    }
}
