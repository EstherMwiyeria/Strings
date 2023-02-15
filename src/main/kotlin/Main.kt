fun main() {
    school()

    var equals= five("Liz", 26)
    println(equals)

    var t = sentence("door", 2)
    println(t)
    information("Eunice")


}
fun school() {
    var school= "akirachix"
     println(school[0])
     println(school[2])
     println(school[3])
}

fun five(name: String, age: Int):String{
    var sentence = "hi my name is $name and I am $age years old"
    return sentence


    println(sentence)
}

fun sentence(name: String, length: Int): String{
    var total = "The length of the $name is $length metres"
    return total
}
fun information(name: String){
    var myName = "Esther"
    if(name==myName)
    {println("That's me")} else{
        println("I don't know who that is")}



}

