

fun main(){
    print("welcome to functional fp")
    higerOderfn(::sum(1,2))
    higerOderfn({x,y -> x+y})
    higerOderfn{x,y -> x+y}
}


fun higerOderfn(λ : (Int, Int) -> Int){

}

fun sum (x: Int, y: Int) = x+y

fun countPairs(elements: List<String>) : List<Pair<String, Int>> {
    return elements.groupBy {
        it
    }.map {  Pair(it.key, it.value.count()) }
}