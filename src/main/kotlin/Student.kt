class Student(var name:String, var english:Int, var math:Int){


    fun average():Int{
        return (english+math)/2
    }

    fun higest() = if (english>math) english else math



}

fun main(args: Array<String>) {

    var student:Student= Student("james",100,80)

    print(student.average())

}