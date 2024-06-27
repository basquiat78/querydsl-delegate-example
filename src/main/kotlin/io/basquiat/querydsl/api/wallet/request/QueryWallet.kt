package io.basquiat.querydsl.api.wallet.request

/**
 * wallet 검색 조건 요청 객체
 * created by basquiat
 */
data class QueryWallet(
    val owner: String?,
    val walletAddress: String?,
    val chainName: String?,
)
