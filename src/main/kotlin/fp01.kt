

fun main(){
    print("welcome to functional fp")
}


fun sum (x: Int, y: Int) = x+y

fun countPairs(elements: List<String>) : List<Pair<String, Int>> {
    return elements.groupBy {
        it
    }.map {  Pair(it.key, it.value.count()) }
}