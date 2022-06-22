package com.hafidz.moviecataloguehaf

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Movie(
    @SerializedName("id")
    val id : String ?,

    @SerializedName("title")
    val title : String?,

    @SerializedName("release_date")
    val release : String?,

    @SerializedName("original_language")
    val original_language : String?,

    @SerializedName("popularity")
    val popularity : String?,

    @SerializedName("poster_path")
    val poster_path : String?

) : Parcelable {


    constructor() : this("", "", "", "","","",)

}