package space.rybakov.composition.domain.repository

import space.rybakov.composition.domain.entity.GameSettings
import space.rybakov.composition.domain.entity.Level
import space.rybakov.composition.domain.entity.Question

interface GameRepository {

    fun generateQuestion(
        maxSumValue: Int,
        countOfOptions: Int
    ): Question

    fun getGameSettings(level: Level): GameSettings
}