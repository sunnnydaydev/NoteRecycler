package com.carry.noterecycler.entity

import android.graphics.Color
import com.carry.noterecycler.R

/**
 * Create by SunnyDay /08/18 18:06:34
 */

fun colorList() = listOf(
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

fun mockStaggeredList() = colorList().mapIndexed { index, bgColor ->
    StaggeredDto(
        text = index.toString(),
        bgColor = bgColor
    )
}

fun mockCarouseList() = listOf(
    R.drawable.img_02,
    R.drawable.img_03,
    R.drawable.img_02,
    R.drawable.img_03, R.drawable.img_02,
    R.drawable.img_03, R.drawable.img_02,
    R.drawable.img_03, R.drawable.img_02,
    R.drawable.img_03,
)