package com.kotlingdgocucb.elimuApp.domain.usecase

import com.kotlingdgocucb.elimuApp.data.repository.ElimuRepository
import com.kotlingdgocucb.elimuApp.domain.model.User
import com.kotlingdgocucb.elimuApp.domain.utils.Result

class GetCurrentUserUseCase(
    private val repository: ElimuRepository
) {

    suspend operator  fun invoke(): Result<User?>{
        return repository.getCurrentUser()
    }
}