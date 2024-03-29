package fr.android.taillebourg.interfaces

import fr.android.taillebourg.Book
import retrofit2.Call
import retrofit2.http.GET


interface HenriPotierService {
    @GET("books")
    fun listBooks(): Call<List<Book>>

}
