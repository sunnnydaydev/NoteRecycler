package com.carry.noterecycler.entity

import android.graphics.Color

/**
 * Create by SunnyDay /08/14 21:30:02
 */
data class GridDto(
     val text: String,
     val bgColor: Int
)

private fun colorList() = listOf(
    Color.RED,
    Color.BLUE,
    Color.CYAN,
    Color.GRAY,
    Color.DKGRAY,
    Color.BLACK,
    Color.GREEN,
    Color.LTGRAY,
    Color.MAGENTA,
    Color.YELLOW,
    Color.RED,
    Color.BLUE,
    Color.CYAN,
    Color.GRAY,
    Color.DKGRAY,
    Color.BLACK,
    Color.GREEN,
    Color.LTGRAY,
    Color.MAGENTA,
    Color.YELLOW,
    Color.RED,
    Color.BLUE,
    Color.CYAN,
    Color.GRAY,
    Color.DKGRAY,
    Color.BLACK,
    Color.GREEN,
    Color.LTGRAY,
    Color.MAGENTA,
    Color.YELLOW,
)

fun mockGridDtoList() = colorList().mapIndexed { index, bgColor ->
    GridDto(
        text = index.toString(),
        bgColor = bgColor
    )
}

