package io.example;

import io.example.controller.AnswerController;
import io.example.controller.QuestionController;
import io.example.model.Answer;
import io.example.model.Question;
import io.lenur.di.Dependency;
import io.lenur.di.PackageContext;

public class Main {
    public static void main(String[] args) {
        PackageContext context = Dependency.init("io.example");
        AnswerController answerController = (AnswerController) context.getInstance(AnswerController.class);
        QuestionController questionController = (QuestionController) context.getInstance(QuestionController.class);

        Answer answer1 = new Answer("answer 1");
        Answer answer2 = new Answer("answer 2");

        answerController.add(answer1);
        answerController.add(answer2);

        //[Answer{text='answer 1'}, Answer{text='answer 2'}]
        System.out.println(answerController.getAll());

        Question question1 = new Question("question 1", answer1);
        Question question2 = new Question("question 2", answer2);

        questionController.add(question1);
        questionController.add(question2);

        //[
        // Question{text='question 1', answer=Answer{text='answer 1'}},
        // Question{text='question 2', answer=Answer{text='answer 2'}}
        // ]
        System.out.println(questionController.getAll());
    }
}
