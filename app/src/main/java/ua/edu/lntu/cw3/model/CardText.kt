package ua.edu.lntu.cw3.model
import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class CardText (
    @StringRes val stringResourceIdName: Int,
    @StringRes val stringResourceIdDescription: Int
)

