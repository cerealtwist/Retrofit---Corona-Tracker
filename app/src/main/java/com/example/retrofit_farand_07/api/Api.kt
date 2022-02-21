package com.example.retrofit_farand_07.api

import com.example.retrofit_farand_07.model.IndonesiaResponse
import com.example.retrofit_farand_07.model.ProvinceResponse
import retrofit2.Call
import retrofit2.http.GET

interface Api {
    @GET ("casenumber.json")
    fun getIndonesia(): Call<ArrayList<IndonesiaResponse>>
    @GET ("casenumberprovince.json")
    fun getProvince(): Call<ArrayList<ProvinceResponse>>
}