package com.example.haber24.model

import com.google.gson.annotations.SerializedName



    data class NewsModelDetail (
        @SerializedName("errorCode")
        val errorCode: Long,
        @SerializedName("errorMessage")
        val errorMessage: Any?,
      @SerializedName("data")
      val data: Data
    )

    data class Data (
//   @SerializedName("headerAd")
//   val headerAd: ErAd,
   @SerializedName("newsDetail")
   val newsDetail: NewsDetail,
//   @SerializedName("footerAd")
//   val footerAd: ErAd,
//   @SerializedName("multimedia")
//   val multimedia: Multimedia,
//   @SerializedName("itemList")
//   val itemList: List<Video>,
//   @SerializedName("relatedNews")
//   val relatedNews: RelatedNews,
//   @SerializedName("video")
//   val video: Video,
//   @SerializedName("photoGallery")
//   val photoGallery: PhotoGallery
    )

// data class ErAd (
//     @SerializedName("itemType")
//     val itemType: String,
//     @SerializedName("adUnit")
//     val adUnit: String,
//     @SerializedName("itemWidth")
//     val itemWidth: Long,
//     @SerializedName("itemHeight")
//     val itemHeight: Long
// )

// data class Video (
//     @SerializedName("itemList")
//     val itemList: Any? = null,
//     @SerializedName("itemID")
//     val itemID: String,
//     @SerializedName("title")
//     val title: String,
//     @SerializedName("imageURL")
//     val imageURL: String,
//     @SerializedName("itemType")
//     val itemType: String,
//     @SerializedName("titleVisible")
//     val titleVisible: Boolean,
//     @SerializedName("shortText")
//     val shortText: String? = null,
//     @SerializedName("bodyText")
//     val bodyText: String? = null,
//     @SerializedName("videoURL")
//     val videoURL: String? = null
// )

// data class Multimedia (
//     val sectionType: String,
//     @SerializedName("repeatType")
//     val repeatType: String,
//     @SerializedName("itemCountInRow")
//     val itemCountInRow: Long,
//     @SerializedName("lazyLoadingEnabled")
//     val lazyLoadingEnabled: Boolean,
//     @SerializedName("titleVisible")
//     val titleVisible: Boolean,
//     @SerializedName("title")
//     val title: Any? = null,
//     @SerializedName("titleColor")
//     val titleColor: Any? = null,
//     @SerializedName("titleBgColor")
//     val titleBgColor: Any? = null,
//     @SerializedName("sectionBgColor")
//     val sectionBgColor: Any? = null

// )

  data class NewsDetail (
//  @SerializedName("resource")
//  val resource: String,
  @SerializedName("bodyText")
  val bodyText: String,
//  @SerializedName("hasPhotoGallery")
//  val hasPhotoGallery: Boolean,
//  @SerializedName("hasVideo")
//  val hasVideo: Boolean,
//  @SerializedName("publishDate")
//  val publishDate: String,
//  @SerializedName("fullPath")
//  val fullPath: String,
//  @SerializedName("shortText")
//  val shortText: String,
//  @SerializedName("category")
//  val category: Category,
//  @SerializedName("itemID")
//  val itemID: String,
//  @SerializedName("title")
//  val title: String,
//  @SerializedName("video")
//  val video: String,
  @SerializedName("imageUrl")
  val imageURL: String,
//  @SerializedName("itemType")
//  val itemType: String

    )

// data class Category (
//     @SerializedName("categoryID")
//     val categoryID: String,
//     @SerializedName("title")
//     val title: String,
//     @SerializedName("slug")
//     val slug: String,
//     @SerializedName("color")
//     val color: String? = null
// )

// data class PhotoGallery (
//     @SerializedName("itemList")
//     val itemList: Any? = null,
//     @SerializedName("itemID")
//     val itemID: String,
//     @SerializedName("title")
//     val title: String,
//     @SerializedName("imageURL")
//     val imageURL: String,
//     @SerializedName("itemType")
//     val itemType: String,
//     @SerializedName("titleVisible")
//     val titleVisible: Boolean
// )

// data class RelatedNews (
//     val hasPhotoGallery: Boolean,
//     @SerializedName("hasVideo")
//     val hasVideo: Boolean,
//     @SerializedName("publishDate")
//     val publishDate: String,
//     @SerializedName("shortText")
//     val shortText: String,
//     @SerializedName("category")
//     val category: Category,
//     @SerializedName("itemID")
//     val itemID: String,
//     @SerializedName("title")
//     val title: String,
//     @SerializedName("imageURL")
//     val imageURL: String,
//     @SerializedName("itemType")
//     val itemType: String,
//     @SerializedName("titleVisible")
//     val titleVisible: Boolean
// )

