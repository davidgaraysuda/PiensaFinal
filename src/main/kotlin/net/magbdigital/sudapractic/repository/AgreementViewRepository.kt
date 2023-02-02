package net.magbdigital.sudapractic.repository

import net.magbdigital.sudapractic.model.Agreement
import net.magbdigital.sudapractic.model.AgreementView
import org.springframework.data.jpa.repository.JpaRepository

interface AgreementViewRepository: JpaRepository<Agreement, Long?> {
    fun findById(id: Long?): AgreementView?
}