package io.basquiat.querydsl.domain.wallet.model.entity

import jakarta.persistence.*
import org.hibernate.annotations.DynamicUpdate

/**
 * wallet entity
 * created by basquiat
 */
@Entity
@DynamicUpdate
@Table(name = "wallet")
class Wallet(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,

    @Column
    val owner: String,

    @Column
    val chainName: String,

    @Column
    val walletAddress: String,

    amount: String? = "0",

) {

    @Column(name = "amount", nullable = true)
    var amount: String? = amount
        private set

    fun modifyAmount(amount: String) {
        this.amount = amount
    }

}