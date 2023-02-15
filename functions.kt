fun main() {

    println("Hi")
    student_details()
    output_details()
    expooo()

}

fun student_details(args: Array<String>){
    println("Enter student name: ")
    val stu_name = readLine()!!
    
}

fun output_details(args: Array<String>){
    val stu_name
    println("You entered: $stu_name")
}
fun expooo(args: Array<String>) {
    println("Enter your name:")
    var name = readLine()
    print("Length is ${name?.length}")
}