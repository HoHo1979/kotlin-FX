import javafx.beans.property.SimpleStringProperty
import javafx.collections.FXCollections
import javafx.geometry.Orientation
import javafx.stage.Popup
import tornadofx.*

class MainView() :View(){

    val model=ViewModel()
    val username = model.bind{SimpleStringProperty()}
    val password = model.bind{SimpleStringProperty()}
    val longinController:LoginController by inject()

    private val students = FXCollections.observableArrayList<Student>(

            Student("John",100,77),
            Student("Jessica",50,100),
            Student("James",49,88)


    )

//    override val root = tableview(students){
//        column("Name", Student::name)
//        column("English", Student::english)
//        column("Math", Student::math)
//        columnResizePolicy = SmartResize.POLICY
//    }

    override val root= form(){

        fieldset {

            labelPosition = Orientation.VERTICAL

            fieldset("UserName") {
                textfield(username).required()
            }

            fieldset("password") {
                passwordfield(password).required()
            }

            fieldset {

                button("Login") {

                    isDefaultButton = true
                    useMaxHeight = true

                    action {
                        runAsyncWithProgress {

                            longinController.login(username.value,password.value)

                        }
                    }
                }

            }


        }


    }


}


