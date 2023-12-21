package com.timife.currencyconverter.data.remote.dtos


import com.squareup.moshi.Json

data class CurrencyDto(
    val base: String,
    val disclaimer: String,
    val license: String,
    val rates: Rates,
    val timestamp: Int
)