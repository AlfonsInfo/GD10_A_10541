package com.alfonsus.gd10_a_10541

data class MahasiswaData(
    @SerializedName("mhsnobp") val nim: String,
    @SerializedName("mhsnama") val nama : String,
    @SerializedName("mhsalamat") val alamat:String,
    @SerializedName("prodinama") val prodi:String,
    @SerializedName("mhstgllhr") val tgllhr:String,

    )
