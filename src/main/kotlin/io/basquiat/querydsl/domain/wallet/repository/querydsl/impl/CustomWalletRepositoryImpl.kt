package io.basquiat.querydsl.domain.wallet.repository.querydsl.impl

import com.querydsl.jpa.impl.JPAQueryFactory
import io.basquiat.querydsl.api.wallet.request.QueryWallet
import io.basquiat.querydsl.domain.wallet.model.entity.QWallet.wallet
import io.basquiat.querydsl.domain.wallet.model.entity.Wallet
import io.basquiat.querydsl.domain.wallet.repository.querydsl.CustomWalletRepository

/**
 * CustomWalletRepository 구현체
 * created by basquiat
 */
class CustomWalletRepositoryImpl(
    private val query: JPAQueryFactory,
): CustomWalletRepository {

    /**
     * @param conditions
     * return List<Wallet>
     */
    override fun findByConditions(conditions: QueryWallet): List<Wallet> {
        return query.selectFrom(wallet)
            .where(
//                wallet.eqOwner(conditions.owner),
//                wallet.eqWalletAddress(conditions.walletAddress),
//                wallet.eqChainName(conditions.chainName),
//
                wallet.searchByConditions(conditions)
            ).fetch()
    }
}