

fun main(){
    print("welcome to functional fp")

    higerOderfn({x,y -> x+y})
    higerOderfn{x,y -> x+y}

    val numbers = 1..100
    numbers.filter { it % 5==0 }.map { it *20 }.forEach{println(it)}

}


fun higerOderfn(λ : (Int, Int) -> Int){

}

fun sum (x: Int, y: Int) = x+y

fun countPairs(elements: List<String>) : List<Pair<String, Int>> {
    return elements.groupBy {
        it
    }.map {  Pair(it.key, it.value.count()) }
}