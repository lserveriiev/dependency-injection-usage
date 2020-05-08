package io.example.controller;

import io.example.dao.QuestionDao;
import io.example.model.Question;
import io.lenur.di.annotation.Inject;

import java.util.List;

public class QuestionController {
    @Inject
    private QuestionDao questionDao;

    public boolean add(Question question) {
        return questionDao.add(question);
    }

    public List<Question> getAll() {
        return questionDao.getAll();
    }
}
