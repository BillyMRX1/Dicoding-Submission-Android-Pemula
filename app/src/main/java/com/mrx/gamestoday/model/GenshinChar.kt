package com.mrx.gamestoday.model

data class GenshinChar(
        var name: String = "",
        var visions: String = "",
        var affiliation: String = "",
        var bio: String = "",
        var birth: String = "",
        var weapon: String = "",
        var pic: Int = 0,
        var background: Int = 0,
        var element: Int = 0,
        var charlink: String = ""
)
