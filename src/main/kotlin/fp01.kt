

fun main(){
    println("welcome to functional fp")
    val x: Int = 10
    val y: Int = 20


  println(higerOderfn(2,3,{x,y -> x+y}))
    println(higerOderfn(5,6){ x,y -> x+y})

   // val numbers = 1..100
   // numbers.filter { it % 5==0 }.map { it *20 }.forEach{println(it)}

    "kotling functional programming".toCamalCase()

    "Me" isSameAsMe "Me"

    higerOderfn(4,5,fun(x, y) :Int{
        return x+y
    })
}

infix fun String.isSameAsMe (value: String) = this == value

fun higerOderfn(a:Int, b:Int, λ : (Int, Int) -> Int){
    println(λ(a,b))
}

fun String.toCamalCase() {

}

fun sum (x: Int, y: Int) = x+y

fun countPairs(elements: List<String>) : List<Pair<String, Int>> {
    return elements.groupBy {
        it
    }.map {  Pair(it.key, it.value.count()) }
}