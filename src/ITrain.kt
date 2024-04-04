interface ITrain {
    fun info():String{
        return "";
    }
    suspend fun Passing(n: Int, stops: List<String>)
}