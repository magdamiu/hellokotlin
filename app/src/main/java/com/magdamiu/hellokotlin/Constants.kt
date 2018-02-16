package com.magdamiu.hellokotlin

/**
 * Created by magda on 16/02/2018.
 */
private const val thumbBase = "http://lorempixel.com/400/400/cats/"

fun getMedia() = listOf(
        MediaItem("Title 1", "${thumbBase}1"),
        MediaItem("Title 2", "${thumbBase}2"),
        MediaItem("Title 3", "${thumbBase}3"),
        MediaItem("Title 4", "${thumbBase}4"),
        MediaItem("Title 5", "${thumbBase}5"),
        MediaItem("Title 6", "${thumbBase}6"),
        MediaItem("Title 7", "${thumbBase}7"),
        MediaItem("Title 8", "${thumbBase}8"),
        MediaItem("Title 9", "${thumbBase}9"),
        MediaItem("Title 10", "${thumbBase}10")
)

fun getMediaFromCode(): List<MediaItem> = (1..10).map { MediaItem("Title $it", thumbBase + it) }