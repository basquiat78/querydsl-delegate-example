package io.basquiat.querydsl.domain.wallet.repository

import io.basquiat.querydsl.domain.wallet.model.entity.Wallet
import io.basquiat.querydsl.domain.wallet.repository.querydsl.CustomWalletRepository
import io.basquiat.querydsl.global.repository.BaseRepository

interface WalletRepository : BaseRepository<Wallet, Long>, CustomWalletRepository