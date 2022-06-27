fun main(){
    var value = 0
    while(value <= 10)
    {println("Enter number:")
        var number: Int = readln()!!.toInt()
        if(number<0){
            println("negative") }
        else if(number>0){
            println("positive")
        }else println("neutral")
    value++
}}