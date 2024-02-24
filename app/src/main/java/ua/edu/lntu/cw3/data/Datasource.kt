package ua.edu.lntu.cw3.data
import ua.edu.lntu.cw3.model.CardText
import ua.edu.lntu.cw3.R
class Datasource {
    fun loadCards(): List<CardText> {
        return listOf<CardText>(
CardText(R.string.name1, R.string.desc1),
        CardText(R.string.name2, R.string.desc2),
        CardText(R.string.name3, R.string.desc3)
        )
    }

}