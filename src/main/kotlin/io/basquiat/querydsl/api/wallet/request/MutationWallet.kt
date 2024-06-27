package io.basquiat.querydsl.api.wallet.request

/**
 * wallet 생성, update 요청 객체
 * created by basquiat
 */
data class MutationWallet(
    val owner: String,
    val chainName: String,
    val walletAddress: String,
)
