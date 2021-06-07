5 Functions without Return Value.

fun main() {

    println(add2(694, 842))
    println(subtract2(829, 320))
    println(multiply2(9023, 239))
    println(divide2(90284.948f, 294.87f))
    println(mathe2(23904f, 4902f, 9503f))

} // End of Main Function

5 Functions which receive arguments

fun add2(a:Int, b:Int):Int{
    return a+b
}

fun subtract2(a:Int, b:Int):Int{
    return a-b
}

fun multiply2(a:Int, b:Int):Int{
    return a*b
}

fun divide2(a:Float, b:Float):Float{
    return a/b
}

fun mathe2(a:Float, b:Float, c:Float):Float{
    return (a/b)*c
}
