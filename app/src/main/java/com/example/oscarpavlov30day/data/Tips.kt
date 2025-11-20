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
    Tips(R.drawable.ic_launcher_background, R.string.name1, R.string.desc1, R.string.day1)
)