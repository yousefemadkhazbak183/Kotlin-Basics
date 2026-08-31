
// MapOf store Key and Value

fun main() {
//    var teachers = mapOf("Youssef" to 15, "Omar" to  143)
//    println(teachers)
//    println(teachers["Omar"])

    var  studentsGrades = mapOf("Youssef" to 100 , "Omar" to 100, "Ahmed" to 40)
    var  studentsGrade = mutableMapOf("Youssef" to 100 , "Omar" to 100, "Ahmed" to 40)
    println(studentsGrade)
    studentsGrade.put(key = "Karim", value = 90)
    println(studentsGrade)
    println(studentsGrades)

}