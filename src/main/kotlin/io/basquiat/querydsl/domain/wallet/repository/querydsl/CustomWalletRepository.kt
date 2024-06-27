package io.basquiat.querydsl.domain.wallet.repository.querydsl

import io.basquiat.querydsl.api.wallet.request.QueryWallet
import io.basquiat.querydsl.domain.wallet.model.entity.Wallet

/**
 * CustomWalletRepository interface
 * created by basquiat
 */
interface CustomWalletRepository {
    fun findByConditions(conditions: QueryWallet): List<Wallet>
}