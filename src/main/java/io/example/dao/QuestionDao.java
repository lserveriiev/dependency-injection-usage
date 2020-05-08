package io.example.dao;

import io.example.model.Question;

import java.util.ArrayList;
import java.util.List;

public class QuestionDao implements Dao<Question> {
    private final List<Question> questions = new ArrayList<>();

    @Override
    public List<Question> getAll() {
        return questions;
    }

    @Override
    public boolean add(Question question) {
        return questions.add(question);
    }
}
