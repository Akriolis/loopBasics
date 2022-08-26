fun main(){
    var x = 1
    println ("Before the loop. x = $x.")
    while (x < 4){
        println("In the loop. x = $x.")
        x = x + 1
    }
    println("After the loop. x = $x.")

    val f = 5
    val y = 1
    if (f > y){
        println("f is greater than y")
    }else{
        println("This line runs no matter what")
    }
}