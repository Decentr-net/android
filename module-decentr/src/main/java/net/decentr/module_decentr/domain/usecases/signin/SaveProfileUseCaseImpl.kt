package net.decentr.module_decentr.domain.usecases.signin

import net.decentr.module_decentr.domain.models.Profile
import net.decentr.module_decentr.domain.repository.SignInRepository
import javax.inject.Inject

class SaveProfileUseCaseImpl @Inject constructor(private val repository: SignInRepository): SaveProfileUseCase {
    override suspend fun invoke(profile: Profile) {
        repository.saveProfile(profile)
    }
}