 // ///////////////////////////////////     SET A
  fun main() {
    prinT()
      println("Enter First Number:")
      val x= readLine()!!.toInt()
      println("Enter Second Number:")
      val y= readLine()!!.toInt()
      bigNumber(a=x, b=y)
      println(lam(10, 9))
      println("QUESITON TWO PART START ")////////////////////////
      NumberPrint()
      println("Enter A Number To Check Even Or Odd ")
      val q = readLine()!!.toInt()
      oddEven(p = q)
      println("Enter A Number To Check Positive Or Negative  ")
      val l = readLine()!!.toInt()
      println(dlam(l))
      var m =gun(5) {x->x*x}
      println("Square $m")
      println("QUESITON THREE PART START ") ////////////////////
      smallNumber(5, 6, 8)
      println("Lamda Function Smaller Number ")
      smalllamda(40, 80, 100)
      println("Higher Function Multiply Number ")
      val result = high(a=5, b =10){ x:Int, y:Int->x*y}
      println(result)
      println("QUESITON FOUR  PART START ") ////////////////////
      largeOne(500, 1000)
      val lamadd= lamadd(50, 60){ x:Int, y:Int->x+y}
      println("Lamda Add $lamadd")
      val div = lamadd(100, 5){ x:Int, y:Int->x/y}
      println("Div $div")
 }
 ///////////////////////////////////////   SQUARE  HIGHER ORDER FUNCTION
 fun  gun(a:Int, operation: (Int) -> Int):Int{
     return operation(a)
 }

 fun prinT(){
    println("Welcome Kotlin")
      val sum = add(10, 15){x, y -> x + y}
     println("Sum Is: $sum")
     val sub = add(100, 15){x, y -> x - y}
     println("Substraction Is: $sub")

 }//////////////////////     MAIN METHOD
  val lam ={a:Int, b:Int->a+b}  // LAMDA FUNCTION
 fun  bigNumber(a: Int, b: Int): Int {
     if(a > b){
       println("$a is Bigger Number")
     }else{
        println("$b is Bigger Number")
    }
     return  1
 }
////////////////        Higher Order Function
fun add(a: Int, b: Int, operation: (Int, Int)-> Int): Int {
    return  operation(a, b)
}
 /////////////////////////////////////////////////          SET B

 fun NumberPrint(){
     for (i in 1..5){
         println("$i")
     }
 }
 //////////////////////////////////////////////////
 fun oddEven(p:Int):Boolean{


      if (p % 2==0){
          println("$p is even True")
      }else {
          println("$p is Odd False")
      }
     return true
 }
////////////////////////////////////////////////////////
val dlam = { x: Int -> if(x>0){
    println("$x is Positive")


}else if(x<0){
    println("$x is Negative")
}

}
 /////////////////////////////////////////////////          SET C
 fun  smallNumber(a: Int, b: Int, c:Int): Int {
     if(a<b && a<c){
         println("$a is Smaller Number")
     }else if(b<a && b<c){
         println("$b is Smaller Number")
     }else {
         println("$c is Smaller Number")
     }
     return 1
 }
 val smalllamda = {a:Int, b:Int, c:Int ->  if(a<b && a<c){
     println("$a is Smaller Number")
 }else if(b<a && b<c){
     println("$b is Smaller Number")
 }else {
     println("$c is Smaller Number")
 }

 }
 ///////   HIGHER ORDER FUNCTION

 fun high (a:Int, b:Int, operation: (Int, Int) -> Int):Int{
     return  operation(a,b)
 }
 /////////////////////////////////////////////////          SET D

 fun largeOne(a:Int , b:Int){
     if(a > b){
         println("$a is Larger Number")
     }else {
            println("$b is Larger Number")
     }
 }
 fun lamadd(a:Int, b:Int, operation: (Int, Int) -> Int):Int{  //// HIGER ORDER FUNCTION
     return operation(a, b)
 }
