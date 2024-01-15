package com.shegz.flexibletextsize.compose

import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.sp

/**
 * Irrespective of the User's device font setting,
 * the text size will fall between [min] and [max]
 * The [min] is the minimum text size
 * The [max] is the maximum text size
 * Example usage is @see [com.shegz.flexibletextsize.MainActivity]
 *
 */
@Composable
fun TextUnit.flexibleFontSize(min: Float, max: Float): TextUnit {
    val currentDensity = LocalDensity.current.fontScale
    val scaledFontSize = currentDensity * this.value
    val updatedSize = if (scaledFontSize >= max) {
        (max / currentDensity).sp
    } else if (scaledFontSize <= min) {
        (min / currentDensity).sp
    } else {
        this.value.sp
    }
    return updatedSize
}