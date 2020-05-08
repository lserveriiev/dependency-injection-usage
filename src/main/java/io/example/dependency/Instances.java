package io.example.dependency;

import io.example.dao.AnswerDao;
import io.example.dao.QuestionDao;
import io.lenur.di.annotation.Dependencies;
import io.lenur.di.annotation.Instance;

@Dependencies
public class Instances {
    @Instance
    public AnswerDao getAnswerDai() {
        return new AnswerDao();
    }

    @Instance
    public QuestionDao getQuestionDao() {
        return new QuestionDao();
    }
}
