abstract class ATrain : ITrain {
    abstract val trainNumber: String
    abstract val destination: String
    abstract val daysOfWeek: List<String>
    abstract val arrivalTime: String
    abstract val parkingTime: String
    abstract val stops: List<String>
    abstract val remainingStops:Int
    override fun info(): String {
        return "Номер поезда: $trainNumber, Прибытие: $destination"
    }
}