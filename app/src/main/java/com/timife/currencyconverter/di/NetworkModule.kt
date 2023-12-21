//package com.timife.currencyconverter.di
//
//import android.app.Application
//import com.timife.currencyconverter.data.remote.CurrencyApi
//import dagger.Module
//import dagger.Provides
//import dagger.hilt.InstallIn
//import dagger.hilt.components.SingletonComponent
//import okhttp3.Interceptor
//import okhttp3.OkHttpClient
//import retrofit2.Retrofit
//import javax.inject.Singleton
//
//@Module
//@InstallIn(SingletonComponent::class)
//object NetworkModule {
//    @Provides
//    @Singleton
//    fun provideApiService(app: Application): CurrencyApi {
//        val interceptor = Interceptor { chain ->
//            val request = chain.request().newBuilder()
//                .addHeader("X-Auth-Token", BuildConfig.API_KEY)
//                .build()
//            chain.proceed(request)
//        }
//        val chuckerInterceptor = ChuckerInterceptor.Builder(app)
//            .collector(
//                ChuckerCollector(
//                    app,
//                    showNotification = true,
//                    retentionPeriod = RetentionManager.Period.ONE_WEEK
//                )
//            )
//            .maxContentLength(250000L)
//            .redactHeaders(emptySet())
//            .alwaysReadResponseBody(false)
//            .build()
//
//        val client = OkHttpClient.Builder()
//            .addInterceptor(interceptor)
//            .addInterceptor(chuckerInterceptor)
//            .build()
//
//        return Retrofit.Builder()
//            .baseUrl(BuildConfig.BASE_URL)
//            .client(client)
//            .addConverterFactory(MoshiConverterFactory.create())
//            .build()
//            .create(CurrencyApi::class.java)
//    }
//}