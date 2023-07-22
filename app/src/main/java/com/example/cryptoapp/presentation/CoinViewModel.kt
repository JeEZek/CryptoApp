package com.example.cryptoapp.presentation

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import com.example.cryptoapp.data.repository.CoinRepositoryImpl
import com.example.cryptoapp.domain.usecases.GetCoinInfoUseCase
import com.example.cryptoapp.domain.usecases.GetCoinPriceListInfoUseCase
import com.example.cryptoapp.domain.usecases.LoadDataUseCase

class CoinViewModel(application: Application) : AndroidViewModel(application) {

    private val repository = CoinRepositoryImpl(application)

    private val getCoinInfoUseCase = GetCoinInfoUseCase(repository)
    private val getCoinPrListInfoUseCase = GetCoinPriceListInfoUseCase(repository)
    private val loadDataUseCase = LoadDataUseCase(repository)

    val coinInfoList = getCoinPrListInfoUseCase()

    fun getDetailInfo(fSym: String) = getCoinInfoUseCase(fSym)

    init {
        loadDataUseCase()
    }
}