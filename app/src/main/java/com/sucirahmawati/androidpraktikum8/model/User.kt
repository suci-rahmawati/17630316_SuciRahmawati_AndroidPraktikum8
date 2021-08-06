package com.sucirahmawati.androidpraktikum8.model

import com.squareup.moshi.Json

class User {
    data class User(
        val page: Int,
        val per_page: Int,
        val total: Int,
        val total_pages: Int,
        val data : List<UserData>
    )

    data class UserData(
        @field:Json(name = "@id")
        val id: Int,
        @field:Json(name = "@email")
        val email: String,
        @field:Json(name = "@first_name")
        val first_name: String,
        @field:Json(name = "@last_name")
        val last_name: String,
        @field:Json(name = "@avatar")
        val avatar: String
    )
}