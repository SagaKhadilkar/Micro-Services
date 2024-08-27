package com.quiz.QuizService.service;

import java.util.List;

import com.quiz.QuizService.entity.Quiz;

public interface QuizService {

    Quiz add(Quiz quiz);

    List<Quiz> get();

    Quiz get(Long id);

}