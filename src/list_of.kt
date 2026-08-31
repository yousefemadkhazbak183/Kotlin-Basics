fun main() {

    var students1 = arrayOf("Youssef", "Emad")
    var students2 = mutableListOf("Youssef", "Emad")
    var students3 = listOf("Youssef", "Emad")

    students1.plus("e")
    println(students1)

    students2.add("Omar")
    println(students2)
}