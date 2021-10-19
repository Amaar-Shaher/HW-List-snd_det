fun main() {
    val num = listOf(10,20,30,40,50).toMutableList()
    num[2]=12
    num.remove(12)

    println(num)
}