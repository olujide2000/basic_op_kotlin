fun main(){
    // variable assignment
    var a: Double = 10.0
    var b: Double = 8.0
    var c: String = "Kotlin basic operation"
    // Remains boolean assignment

    val s: Double
    
    s= a / b
    
// calling of functions
    greetinggs()
    logical()
// if-else statement -- conditional statement
    if (a>b){
        println("A is larger")
    }else{
        println("B is larger")
    }
  // when statement  
    when (a){
        10.0 -> println("When statement is Great")
    }
   
    

    println(a)
    println(b)
    println(c)
    
    println(a+b)
    println(a-b)
    println(a*b)
    println(a/b)
    println(s)


}

// Functions declaration
fun greetinggs(){
    println("Hi there!!!")
}

fun logical(){
    var a: Double = 10.0
    var b: Double = 8.0
    if ((a > b) && (b < a)){
        println("True")
    }else{
        println("False")
    }
    if ((a > b) || (b < a)){
        println("True")
    }else{
        println("False")
    }
}




