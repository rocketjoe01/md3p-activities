fun main() {
    val student1 = "Vic Recopuerto Amable"
    val student2 = "John Chris Bolanio"
    val student3 = "Andrew Bustos"
    val student4 = "Rizwan Caser"
    val student5 = "Condino Mark Andrei"
    val student6 = "Laurence De Dios"
    val student7 = "Jerome Elenzano"
    val student8 = "ZR Lopez"
    val student9 = "Ryan Malacao"
    val student0 = "Gretchen Roque"

    val students = mutableListOf(student1, student2, student3, student4, student5, student6, student7, student8, student9, student0)

    println("Enter student number to update result:")
    println("")
    println("")
    println("CLASS OF MD3P")
    println("")
    for (i in 0 until students.size) {
        println("$i - ${students[i]}")
    }
    println("-1 - Exit")
    println("")
    println("[Enter number to select a Student] 'Numbers Only!'")

    while (true) {
        val studentNumber = readln().toInt()
        if (studentNumber == -1) {
            break
        } else if (studentNumber >= 0 && studentNumber < students.size) {
            val student = students[studentNumber]
            print("Type 'pass' or 'fail' to update $student progress:")
            when (readln().uppercase()) {
                "PASS" -> {
                    println("$student PASSED. Note: Congratulations for passing the Activity!")
                    students[studentNumber] = "$student (PASSED)"
                }
                "FAIL" -> {
                    println("$student FAILED. Note: Try harder for the next Activity!")
                    students[studentNumber] = "$student (FAILED)"
                }
                else -> {
                    println("Invalid input.")
                }
            }
            println("")
            println("Updated Student list:")
            println("Note: Enter another number again!")
            println("")
            for (i in 0 until students.size) {
                println("$i - ${students[i]}")
            }
        } else {
            println("Invalid student number.")
        }
    }
}