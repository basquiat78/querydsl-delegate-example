package io.basquiat.querydsl.api.wallet

import io.basquiat.querydsl.api.wallet.request.QueryWallet
import io.basquiat.querydsl.domain.wallet.service.WalletQueryService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

/**
 * wallet controller
 * created by basquiat
 */
@RestController
@RequestMapping("/wallets")
class WalletController(
    private val walletQueryService: WalletQueryService,
) {
    @GetMapping("")
    fun walletsByQuery(query: QueryWallet) = walletQueryService.findByConditions(query)
}