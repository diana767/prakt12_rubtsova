import java.lang.Math.pow
import kotlin.math.*

open class Treugul {
    fun Input():Int
    {
        println("введите, сколько раз будет выполняться функция")
        var s= readLine()!!.toInt()
        if(s>0) return s
        else println("число должно быть больше нуля! автоматически установленно число 1")
        return 1
    }
    fun Treug(){
        println("введите высоту равнобедренного треугольника") ;
        var weight = readLine()!!.toDouble()
        if (weight<0){ println("введено неверное значение")}
        else {
        println("введите основание равнобедренного треугольника");
        var height = readLine()!!.toDouble()
            if (height<0){ println("введено неверное значение")}
            else {
        println("Выберете  действие : 1-найти площадь равнобедренного треугольника , 2-найти периметр равнобедренного треугольника")
        var a= readLine()!!.toInt()
                if (a<0){ println("введено неверное значение")}
        var c=0.0
        if(a==1)
            println("S=${0.5*weight*height}")
        else if (a==2){
           c=sqrt(pow((height/2),2.0)+pow(weight, 2.0))
            println("P=${c+c+height}")}
            }
        }
    }
}