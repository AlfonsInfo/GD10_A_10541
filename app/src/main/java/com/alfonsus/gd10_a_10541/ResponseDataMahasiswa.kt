package com.alfonsus.gd10_a_10541

import com.google.gson.annotations.SerializedName


data class ResponseDataMahasiswa(
    @SerializedName("status") val stt:String,
    val totaldata: Int,
    val data:List<MahasiswaData>)

