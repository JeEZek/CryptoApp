package com.example.cryptoapp.domain.repository

import androidx.lifecycle.LiveData
import com.example.cryptoapp.data.network.model.CoinNameDto
import com.example.cryptoapp.domain.entity.CoinInfo

interface CoinRepository {

    fun getCoinPriceListInfo(): LiveData<List<CoinInfo>>

    fun getCoinInfo(fromSymbol: String): LiveData<CoinInfo>

    fun loadData()
}