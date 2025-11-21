package com.example.oscarpavlov30day.data

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.example.oscarpavlov30day.R

data class Tips(
    @DrawableRes val imageResourceId: Int,
    @StringRes val titles: Int,
    @StringRes val description: Int,
    @StringRes val days: Int,
)

val tips = listOf(
    Tips(R.drawable.day1, R.string.name1, R.string.desc1, R.string.day1),
    Tips(R.drawable.day2, R.string.name2, R.string.desc2, R.string.day2),
    Tips(R.drawable.day3, R.string.name3, R.string.desc3, R.string.day3),
    Tips(R.drawable.day4, R.string.name4, R.string.desc4, R.string.day4),
    Tips(R.drawable.day5, R.string.name5, R.string.desc5, R.string.day5),
    Tips(R.drawable.day6, R.string.name6, R.string.desc6, R.string.day6),
    Tips(R.drawable.day7, R.string.name7, R.string.desc7, R.string.day7),
    Tips(R.drawable.day8, R.string.name8, R.string.desc8, R.string.day8),
    Tips(R.drawable.day9, R.string.name9, R.string.desc9, R.string.day9),
    Tips(R.drawable.day10, R.string.name10, R.string.desc10, R.string.day10)
)