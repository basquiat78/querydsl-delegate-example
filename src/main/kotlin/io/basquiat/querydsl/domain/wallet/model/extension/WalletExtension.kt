package io.basquiat.querydsl.domain.wallet.model.extension

import com.querydsl.core.BooleanBuilder
import com.querydsl.core.annotations.QueryDelegate
import com.querydsl.core.annotations.QueryEntity
import com.querydsl.core.types.Predicate
import io.basquiat.querydsl.api.wallet.request.QueryWallet
import io.basquiat.querydsl.domain.wallet.model.entity.QWallet
import io.basquiat.querydsl.domain.wallet.model.entity.Wallet

/**
 * QWallet 위임 객체
 * created by basquiat
 */
@QueryEntity
class WalletExtension {
    companion object {
        @JvmStatic
        @QueryDelegate(Wallet::class)
        fun eqOwner(wallet: QWallet, owner: String?): Predicate? = if(!owner.isNullOrBlank()) {
            wallet.owner.eq(owner)
        } else {
            null
        }

        @JvmStatic
        @QueryDelegate(Wallet::class)
        fun eqWalletAddress(wallet: QWallet, walletAddress: String?): Predicate? = if(!walletAddress.isNullOrBlank()) {
            wallet.walletAddress.eq(walletAddress)
        } else {
            null
        }

        @JvmStatic
        @QueryDelegate(Wallet::class)
        fun eqChainName(wallet: QWallet, chainName: String?): Predicate? = if(!chainName.isNullOrBlank()) {
            wallet.chainName.eq(chainName)
        } else {
            null
        }

        @JvmStatic
        @QueryDelegate(Wallet::class)
        fun searchByConditions(wallet: QWallet, queryWallet: QueryWallet): BooleanBuilder {
            val builder = BooleanBuilder()
            if(!queryWallet.owner.isNullOrBlank()) {
                builder.and(wallet.owner.eq(queryWallet.owner))
            }

            if(!queryWallet.walletAddress.isNullOrBlank()) {
                builder.and(wallet.walletAddress.eq(queryWallet.walletAddress))
            }

            if(!queryWallet.chainName.isNullOrBlank()) {
                builder.and(wallet.chainName.eq(queryWallet.chainName))
            }
            return builder
        }

    }
}
