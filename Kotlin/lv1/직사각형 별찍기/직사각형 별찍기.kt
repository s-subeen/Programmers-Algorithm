fun main(args: Array<String>) {
    val (a, b) = readLine()!!.split(' ').map(String::toInt)
    (0 until b).forEach {
        (0 until a).forEach {
            print("*")
        }
        println()
    }
}