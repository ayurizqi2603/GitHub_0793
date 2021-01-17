package com.example.github_uas.api


import com.example.github_uas.data.model.DetailUserResponse
import com.example.github_uas.data.model.User
import com.example.github_uas.data.model.UserResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Path
import retrofit2.http.Query

interface Api {
    @GET("search/users")
    @Headers("Authorization: token d99e01dacea75b11eb0b0d8c75218e48fb662f69")
    fun getSearchUsers(
        @Query("q") query: String
    ): Call<UserResponse>

    @GET("users/{username}")
    @Headers("Authorization: token d99e01dacea75b11eb0b0d8c75218e48fb662f69")
    fun getUserDetail(
        @Path("username") username : String
    ): Call<DetailUserResponse>

    @GET("users/{username}/followers")
    @Headers("Authorization: token d99e01dacea75b11eb0b0d8c75218e48fb662f69")
    fun getFollowers(
        @Path("username") username: String
    ): Call<ArrayList<User>>

    @GET("users/{username}/following")
    @Headers("Authorization: token d99e01dacea75b11eb0b0d8c75218e48fb662f69")
    fun getFollowing(
        @Path("username") username: String
    ): Call<ArrayList<User>>
}