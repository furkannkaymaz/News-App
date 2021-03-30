package com.example.haber24.model

import com.google.gson.annotations.SerializedName

data class NewsModel (
    @SerializedName("errorCode")
    val errorCode: Long,
    @SerializedName("errorMessage")
    val errorMessage: Any? = null,
    @SerializedName("data")
    val data: ArrayList<Datum>
)

data class Datum (
    @SerializedName("sectionType")
    val sectionType: String,
    @SerializedName("repeatType")
    val repeatType: String,
    @SerializedName("itemCountInRow")
    val itemCountInRow: Long,
    @SerializedName("lazyLoadingEnabled")
    val lazyLoadingEnabled: Boolean,
    @SerializedName("titleVisible")
    val titleVisible: Boolean,
    @SerializedName("title")
    val title: String? = null,
    @SerializedName("titleColor")
    val titleColor: Any? = null,
    @SerializedName("titleBgColor")
    val titleBgColor: String,
    @SerializedName("sectionBgColor")
    val sectionBgColor: String,
    @SerializedName("itemList")
    val itemList: ArrayList<ItemList>,
    @SerializedName("totalRecords")
    val totalRecords: Long? = null
)

data class ItemList (
    @SerializedName("hasPhotoGallery")
    val hasPhotoGallery: Boolean,
    @SerializedName("hasVideo")
    val hasVideo: Boolean,
    @SerializedName("titleVisible")
    val titleVisible: Boolean,
    @SerializedName("fLike")
    val fLike: String,
    @SerializedName("publishDate")
    val publishDate: String,
    @SerializedName("shortText")
    val shortText: String,
    @SerializedName("fullPath")
    val fullPath: String? = null,
    @SerializedName("category")
    val category: Category2,
    @SerializedName("videoURL")
    val videoURL: String,
    @SerializedName("externalURL")
    val externalURL: String,
    @SerializedName("columnistName")
    val columnistName: String,
    @SerializedName("itemID")
    val itemID: String,
    @SerializedName("title")
    val title: String,
    @SerializedName("imageUrl")
    val imageUrl: String,
    @SerializedName("itemType")
    val itemType: String

)

data class Category2 (
    @SerializedName("categoryID")
    val categoryID: String,
    @SerializedName("title")
    val title: String,
    @SerializedName("slug")
    val slug: String
)

