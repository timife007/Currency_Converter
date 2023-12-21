package com.timife.currencyconverter.data.remote

import com.timife.currencyconverter.BuildConfig
import com.timife.currencyconverter.data.remote.dtos.CurrencyDto
import retrofit2.http.GET
import retrofit2.http.Query

interface CurrencyApi {

    @GET("latest.json")
    fun getCurrencies(
        @Query("app_id") appId: String = BuildConfig.APP_ID,
    ): CurrencyDto
}