package io.basquiat.querydsl.domain.wallet.service

import io.basquiat.querydsl.api.wallet.request.QueryWallet
import io.basquiat.querydsl.domain.wallet.model.entity.Wallet
import io.basquiat.querydsl.domain.wallet.repository.WalletRepository
import io.basquiat.querydsl.global.utils.logger
import org.springframework.stereotype.Service

/**
 * query wallet service
 * created by basquiat
 */
@Service
class WalletQueryService(
    private val walletRepository: WalletRepository
) {

    private val log = logger<WalletQueryService>()

    /**
     * @param conditions
     * @return List<Wallet>
     */
    fun findByConditions(conditions: QueryWallet): List<Wallet> {
        log.info("conditions info : $conditions")
        return walletRepository.findByConditions(conditions)
    }
}