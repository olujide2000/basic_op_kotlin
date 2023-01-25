
fun main(){
    var numbers = listOf(88,22,44,48,55)
    var cities: MutableList<String> = mutableListOf("Toronto","Vancouver", "Charlton", "Abuja", "Oslo")
    println(numbers)
    println(numbers.size)
    println("the last item on the list is:  ${numbers[numbers.size-1]}  ")
    println(numbers.first())
    println(numbers.last())
    println("Is number 5 on the list? ${numbers.contains(5)}")
    println(numbers.sorted())
    println(numbers.reversed())

    //list operation
    println(cities)
    cities.add("London")
    println(cities)

    // loop
    var i = 0
    while (i< cities.size){        
        println(cities[i])
        i++
    }
    println()
    println()

    for (city in cities){
        println(city)
    }


}