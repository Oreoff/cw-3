package ua.edu.lntu.cw3.data
import ua.edu.lntu.cw3.model.CardText
class Datasource {
    fun loadCards(): List<CardText> {
        return listOf<CardText>(
            CardText("Lorem ipsum","Lorem Ipsum is simply dummy text of the printing and typesetting industry."),
            CardText("Never gonna give you up","Never gonna let you down" ),
            CardText("Ipsum","Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua." )
        )
    }

}