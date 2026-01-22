
//  Positive/Neg/zero     ANSWER 001
/*
fun  main(){
    println("Enter A Number:")
    val a = readLine()!!.trim().toInt()
    if(a>0){
        println("$a IS POSITIVE")
    }else if (a<0){
        println("$a IS NEGATIVE")
    }else{
        println("$a IS Zero")
    }
//////////////////////////////  ODD & EVEN   002
    if(a%2==0){
        println("$a IS EVEN")
    }else{
        println("$a IS Odd")
    }
    /////////////////////////   VOTE ELIGIBLE  003
     if(a>=18){
         println("$a IS Eligible For Vote")
     }else{println("$a Not Eligible For Vote")}

    // //////////////////MAX OF TWO   004
    println("Enter First Number:")
        val  max = readLine()!!.trim().toInt()

    println("Enter Second Number:")
    val min = readLine()!!.trim().toInt()
    if (max>min){
        println("$max Is Max")
    }else{
        println("$min Is Max")
    }
////////////////////////   SCORE PASS OR FAIL      006
    println("Enter Score:")
    val score = readLine()!!.toInt()
    if(score >=50){
        println("Score Is $score Pass")
    }else{
        println("Score Is $score  Fail")
    }

}

 */


///////////////////////////////////////////////   SCHOOL GRADING   007
fun main(args: Array<String>) {
//    println("Enter Score")
//    val score2 = readLine()!!.toInt()
//    if(score2 >=90) {
//        println("$score2 A")
//    }else if(score2>=80 && score2 <=89){
//        println("$score2 B")
//    }else if(score2>=60 && score2 <=69){
//        println("$score2 D")
//    }else if(score2<=60){
//        println("$score2 F")
//    }
    /////////////////////////////    AGE   007
//    println("Enter Age")
//    val Age = readLine()!!.toInt()
//    if(Age >=0 && Age<=12) {
//        println("$Age Is Child")
//    }else if(Age>=13 && Age <=19){
//        println("$Age  Teenegar")
//    }else if(Age>=20 && Age <=59){
//        println("$Age Adult")
//    }else if(Age>=60){
//        println("$Age Senior")
//    }

///////////////////////////   BMI CALCULATOR  008

//    println("Enter Weight In Double Value:")
//    val  ojon = readLine()!!.toDouble()
//    if(ojon>0.0 && ojon<18.5) {
//        println("$ojon Is Underweight")
//    }else if(ojon>=18.5 && ojon<=24.9){
//        println("$ojon Is Normal")
//    }else if(ojon>=25.0 && ojon<=29.9){
//        println("$ojon Is Overweight")
//    }else if(ojon>=30){
//        println("$ojon Is Obese")
//    }
///////////////////////////   TEMPARATURE  009


//    println("Enter Temparature  Value:")
//    val  tem = readLine()!!.toDouble()
//    if(tem<0) {
//        println("$tem Is Freezing")
//    }else if(tem>=0 && tem<= 15){
//        println("$tem Is Cold")
//    }else if(tem>=16 && tem<= 30){
//        println("$tem Is Warm")
//    }else if(tem>31){
//        println("$tem Is Hot")
//    }
//////////////////////////////////////////   LEAP YEAR 11

//    println("Enter Year:")
//    val  yr = readLine()!!.toInt()
//    if(yr%4==0 && yr%100==0 && yr%400==0){
//        println("Your year is $yr")
//    }else{
//        println(" $yr Is Not A Leap Year")
//    }
//

//////////////////////////////////////////  LARGEST NUMBER FROM 3 NUMBER    14
//
//
//
//
//    println("Enter First Number:")
//    val  max = readLine()!!.trim().toInt()
//
//    println("Enter Second Number:")
//    val min = readLine()!!.trim().toInt()
//
//    println("Enter Third Number:")
//    val m = readLine()!!.trim().toInt()
//    if (max>min && max>m){
//        println("$max Is Largest Number")
//    }else if (min>max && min > m){
//        println("$min Is Largest Number")
//    }
//
//    else{
//        println("$m Is Largest Number")
//    }
//
//////////////////////////////////////////////  15 divisible by  5/11 or BOTH

//
//    println("Enter A Number:")
//    val  num = readLine()!!.trim().toInt()
//    if(num%5==0  && num%11==0){
//        println("$num Is Divisible By 5 & 11 Both")
//
//    }else if(num%11==0){
//        println("$num Is Divisible By 11")
//    }else if(num%11 ==0){
//        println("$num Is Divisible By  11 Both")
//    }
// ///////////////////////////////////////////   19  LOGIN

    println("Enter UserName")
    val uName = readLine()!!.trim().toString()


    println("Enter Password")
    val uPass = readLine()!!.trim().toInt()
    if(uName=="Admin" && uPass==1234){
       println("Access Granted")

    }else {

        println("Wrong Password")
    }

// ///////////////////////////////////////////   20   DISCOUNT
//    println("Enter Purchase Amount")
//    val input = readLine()!!.trim().toInt()
//    if(input<100){
//       println("$input Purchase Amount No Discount")
//    }else if(input>=100 && input<=500){
//        val dis= input*10/100
//        println("$input Purchase Amount 10% Off Discount Amount $dis% ")
//
//    }else if(input>=500){
//        val dis= input*20/100
//        println("$input Purchase Amount 20% Off Discount Amount $dis%")
//    }
}