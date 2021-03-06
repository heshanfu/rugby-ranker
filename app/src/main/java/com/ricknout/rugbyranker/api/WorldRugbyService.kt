package com.ricknout.rugbyranker.api

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface WorldRugbyService {

    @GET("rugby/rankings/{json}")
    fun getRankings(@Path("json") json: String, @Query("date") date: String): Call<WorldRugbyRankingsResponse>

    companion object {
        const val JSON_MENS = "mru.json"
        const val JSON_WOMENS = "wru.json"
        const val BASE_URL = "https://cmsapi.pulselive.com/"
    }
}
