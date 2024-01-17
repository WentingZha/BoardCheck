package com.zwt.boardcheck.network

import com.zwt.boardcheck.data.BookResponse
import com.zwt.boardcheck.util.Const.Companion.PATH
import retrofit2.Call
import retrofit2.http.GET

interface BookNetworkService {

    @GET(PATH)
    fun getBookResponse() : Call<BookResponse>
}