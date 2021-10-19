fun main(args: Array<String>) {
 // part I -------------------------
 val myCity = listOf("ummloj","jjed","ryad").toMutableList()
 myCity.add(3,"med")
 myCity.add(4,"tabuk")
 //myCity[myCity.size]
 var index = (myCity.size -1)
 myCity[index]= "ummloj"
 println(myCity.size)
 println("--------------------")
 for (index in 0 until  myCity.size) {
  myCity[index]
  println("$index- ${myCity[index]} ")


 }

}