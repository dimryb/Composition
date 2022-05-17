package space.rybakov.composition.domain.usecases

import space.rybakov.composition.domain.entity.GameSettings
import space.rybakov.composition.domain.entity.Level
import space.rybakov.composition.domain.repository.GameRepository

class GetGameSettingsUseCase(
    private val gameRepository: GameRepository
) {
    operator fun invoke(level: Level): GameSettings {
        return gameRepository.getGameSettings(level)
    }
}