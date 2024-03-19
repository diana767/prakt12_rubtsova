import  kotlinx.coroutines.delay
class Repository (var login:String, var parol:String, var num:Int, var isOpen:Boolean)
{
    suspend fun sort(repositories:List<Repository>):List<Repository>{
        delay(2000L)
        return repositories.filter { it.isOpen }.sortedWith(compareBy({it.num}))
    }
    suspend fun GetInfo():String{
        delay((1000L))
        return "логин:$login, пароль:$parol, кол-во репрозиториев: $num"
    }
}