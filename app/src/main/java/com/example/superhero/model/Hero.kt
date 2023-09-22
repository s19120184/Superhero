package com.example.superhero.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Hero(
    @StringRes val nombreRes: Int,
    @StringRes val descripcionRes: Int,
    @DrawableRes val imageRes: Int )
