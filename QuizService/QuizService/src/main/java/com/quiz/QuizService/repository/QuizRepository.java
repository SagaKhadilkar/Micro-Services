package com.quiz.QuizService.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.quiz.QuizService.entity.Quiz;

public interface QuizRepository extends JpaRepository<Quiz, Long>{

}
