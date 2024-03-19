import kotlinx.coroutines.*
import kotlin.Exception
import kotlin.system.exitProcess
fun main()= runBlocking{
    var rep= mutableListOf<Repository>()
    while (true){
        try{
            println("\nЗагрузка нового участника")
            println("Логин (exit для выхода)")
            val login= readLine().toString()
            if(login=="exit") break
            println("Пароль")
            val parol= readLine().toString()
            println("Kол-во репозиториев")
            val num= readLine()!!.toInt()
            if(num>0) {
            println("репозитории открыты?(1 - да, 2 - нет)")
            val open= readLine()?.toInt()
            if (open!=1&&open!=2) throw Exception()
            val isOpen: Boolean=open==1
            rep.add(Repository(login, parol, num, isOpen))
            }
            else
            println("неверный ввод");

        }
        catch (e:Exception){ println("неверный ввод")}
    }
    val sort=rep.first().sort(rep)
    sort.forEach({ println(it.GetInfo())})
}