package com.codelab.basiclayouts.data

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.codelab.basiclayouts.R

 data class DrawableStringPair(
    @DrawableRes val drawable: Int,
    @StringRes val text: Int
)

