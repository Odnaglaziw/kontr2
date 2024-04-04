import kotlinx.coroutines.*
fun main(){
    val stops = listOf("Station A", "Station B", "Station C", "Station D", "Station E")
    val trip = CTrain("123", "New York", listOf("Monday", "Wednesday"), "10:00", "2 hours", stops)
    println(trip.info())

   val numberOfStops = 2
   runBlocking {
       trip.Passing(numberOfStops, stops)
   }
}
