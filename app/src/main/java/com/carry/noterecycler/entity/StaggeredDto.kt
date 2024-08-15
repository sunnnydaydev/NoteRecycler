package com.carry.noterecycler.entity

/**
 * Create by SunnyDay /08/15 20:58:04
 */
data class StaggeredDto(
    val text: String,
    val bgColor: Int
)

fun mockStaggeredList() = colorList().mapIndexed { index, bgColor ->
    StaggeredDto(
        text = index.toString(),
        bgColor = bgColor
    )
}

