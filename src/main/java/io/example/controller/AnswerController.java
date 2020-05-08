package io.example.controller;

import io.example.dao.AnswerDao;
import io.example.model.Answer;
import io.example.model.Question;
import io.lenur.di.annotation.Inject;

import java.util.List;

public class AnswerController {
    @Inject
    private AnswerDao answerDao;

    public boolean add(Answer answer) {
        return answerDao.add(answer);
    }

    public List<Answer> getAll() {
        return answerDao.getAll();
    }
}
