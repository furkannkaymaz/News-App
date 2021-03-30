package com.example.rocketapp.managers



import com.ddtech.ddverifier.managers.Globals
import com.example.haber24.model.NewsModel
import com.example.haber24.model.NewsModelDetail
import com.google.gson.Gson
import java.util.*
import kotlin.collections.ArrayList

@Suppress("NULLABILITY_MISMATCH_BASED_ON_JAVA_ANNOTATIONS", "NAME_SHADOWING")
class ServiceManager {

    fun getNews(callbackSuccess: (response: NewsModel) -> Unit, callbackFailure: (response: ArrayList<String>) -> Unit)
    {



        val call = ServiceConnector().Run().news()
        call.enqueue(callback({ response ->

            response?.body()?.let {

                val plainBody: String = it
                val responseConvert: NewsModel = Gson().fromJson(plainBody, NewsModel::class.java)

                callbackSuccess(responseConvert)
                return@callback
            }
        },
                { throwable ->
                    throwable?.let {
                        var errors = ArrayList<String>()
                        errors.add(it.localizedMessage)
                        callbackFailure(errors)
                        return@callback
                    }
                }
        ))
    }

    fun getNewsDetail(callbackSuccess: (response: NewsModelDetail) -> Unit, callbackFailure: (response: ArrayList<String>) -> Unit)
    {



        val call = ServiceConnector().Run().newsDetail()
        call.enqueue(callback({ response ->

            response?.body()?.let {

                val plainBody: String = it
                val responseConvert: NewsModelDetail = Gson().fromJson(plainBody, NewsModelDetail::class.java)
                Globals.shared.selectedNews = responseConvert
                callbackSuccess(responseConvert)
                return@callback
            }
        },
            { throwable ->
                throwable?.let {
                    var errors = ArrayList<String>()
                    errors.add(it.localizedMessage)
                    callbackFailure(errors)
                    return@callback
                }
            }
        ))
    }



}
