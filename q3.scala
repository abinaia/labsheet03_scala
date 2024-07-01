import scala.io.StdIn
object demo extends App{
    println("Enter num1:")
    val num1=StdIn.readLine().toInt
    println("Enter num2:")
    val num2=StdIn.readLine().toInt

    def func(num1:Int,num2:Int):Float={
    var mean=((num1+num2)/2).toFloat
    math.round(mean*100)/100.0f
    }
    println("The mean is " +func(num1,num2))
}