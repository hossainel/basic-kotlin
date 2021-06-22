fun main(args: Array<String>) {

    var hours = readLine()!!.toInt()

    var total: Double = 0.0

    var y = hours%24

    val y1 = (hours-y) / 24

    val y2 = if (y1>0) y else if (y>5) y-5 else 0

    val y3 = if (y1>0) 0 else if (y>5) 5 else y

    total = y1*15.0+y2*0.5+y3*1.0

    println(total)

    

}
