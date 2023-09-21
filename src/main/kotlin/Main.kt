import kotlin.random.Random

fun main(args: Array<String>) {
    val numbers: Array<Int> = Array<Int>(100) { Random.nextInt(0, 100) }
    println("№1")
    for (i in numbers) {
        if (i%10==4) {
            print(" ${i/2}")
        }

    }
    println()
    println("№2")
    for (i in numbers){
        if (i%2==0){
            print(" ${i*i}")
        }
        else{
            print(" ${i*2}")
        }
    }
    println()
    println("№2")
    println("Type a: ")
    val a = readln().toInt()
    println("Type b: ")
    val b = readln().toInt()
    for (i in numbers){
        if (i%2==0){
            print(" ${i*a}")
        }
        else{
            print(" ${i-b}")
        }
    }
}