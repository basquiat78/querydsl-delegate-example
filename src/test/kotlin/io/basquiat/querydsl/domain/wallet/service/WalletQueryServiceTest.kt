package io.basquiat.querydsl.domain.wallet.service

import io.basquiat.querydsl.api.wallet.request.QueryWallet
import io.basquiat.querydsl.global.utils.logger
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class WalletQueryServiceTest @Autowired constructor(
    private val walletQuery: WalletQueryService,
) {

    private val log = logger<WalletQueryServiceTest>()

    @Test
    @DisplayName("wallet query by conditions")
    fun findByConditionsTEST() {
        // given
        val query = QueryWallet(
            //owner = "    ",
            //owner = "",
            //owner = null,
            owner = "basquiat",
            walletAddress = null,
            chainName = null,
        )

        // when
        val result = walletQuery.findByConditions(query)
        log.info("test result: $result")
    }

}
