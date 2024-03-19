import kotlinx.coroutines.*
suspend fun  main(){
    var Class:Treugul=Treugul()
    var k=Class.Input()
    GlobalScope.launch{
        for(i in 1..k)
        {
            println("$i раз")
            Class.Treug()
        }
    }
    runBlocking {delay( 30000L)}
}