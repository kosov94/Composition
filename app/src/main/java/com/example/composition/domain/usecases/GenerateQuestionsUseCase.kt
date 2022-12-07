package com.example.composition.domain.usecases

import com.example.composition.domain.entity.Question
import com.example.composition.domain.repository.GameRepository

class GenerateQuestionsUseCase(
    private val repository: GameRepository
) {

    operator fun invoke(maxValue:Int): Question{
       return repository.generateQuestions(maxValue, COUNT_OF_OPTIONS)
    }

    private companion object{
        private const val COUNT_OF_OPTIONS = 6
    }
}