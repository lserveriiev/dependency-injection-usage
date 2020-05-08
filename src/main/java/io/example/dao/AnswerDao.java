package io.example.dao;

import io.example.model.Answer;

import java.util.ArrayList;
import java.util.List;

public class AnswerDao implements Dao<Answer> {
    private final List<Answer> answers = new ArrayList<>();

    @Override
    public List<Answer> getAll() {
        return answers;
    }

    @Override
    public boolean add(Answer answer) {
        return answers.add(answer);
    }
}
