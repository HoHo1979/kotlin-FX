import javafx.scene.text.FontWeight
import tornadofx.*

class KotlinApplication : App(MainView::class,Styles::class) {




}

class Styles : Stylesheet() {
    init {
        label {
            fontSize = 20.px
            fontWeight = FontWeight.BOLD
            backgroundColor += c("#cecece")
        }
    }
}

fun main(args: Array<String>) {


    launch<KotlinApplication>(args)

}