import kotlin.math.ceil
import kotlinx.coroutines.*
class CTrain(
    override val trainNumber: String,
    override val destination: String,
    override val daysOfWeek: List<String>,
    override val arrivalTime: String,
    override val parkingTime: String,
    override val stops: List<String>,
    override var remainingStops: Int = stops.size
) : ATrain() {
    override suspend fun Passing(n: Int, stops: List<String>) {
        var remainingStations = stops.size
        if (n <= stops.size){
            repeat(n) { task ->
                println("Поезд $trainNumber проходит через станцию: ${stops[task]}, осталось  $remainingStops станций")
                delay(1000)
                remainingStops--
            }
        }else{
            repeat(stops.size) { task ->
                println("Поезд $trainNumber проходит через станцию: ${stops[task]}, осталось  $remainingStops станций")
                delay(1000)
                remainingStops--
            }
        }
        if (remainingStops <= 0) {
            println("Поезд $trainNumber прибыл в пункт назначения.")
        }else{
            println("Поезд проехал заданное кол-во станций.")
        }
    }
}