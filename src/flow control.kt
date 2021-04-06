fun main(){
roman()
    name("andrea","johanna","james","augustine")
    robot(5)
    robot(12)
    robot(18)
    prime()
}
fun roman(){
    for (x in 1..100){
       if (x%2!=0){ println(x)
    }
}}
fun name(name1:String,name2:String,name3:String,name4:String):Array<String>{
    var b= arrayOf(name1,name2,name3,name4)
    for (r in b)
        if (r.length>5){
            println(r)
        }
    return b
}
fun robot (age:Int){
    if (age<6){
        println("milk")
    }

else if (age<15 && age>6){
    println("fanta")
}
    else{
        println("cocacola")
    }
}
fun prime(){
    for (h in 1..100){
        println(h)
    }
    for (h in 1..100){
        if(h%3==0){
            println("fizz")
        }
    }
    for (h in 1..100){
        if (h%5 ==0){
            println("buzz")
            if (h%3==0  && h%5==0 ){
                println("fizzbuzz")

            }
        }
    }
}
