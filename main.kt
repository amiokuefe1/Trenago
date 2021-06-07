5 Functions without Return Value.

fun main() {
    println(add())
    println(subtract())
    println(multiply())
    println(divide())
    println(mathe())

} // End of Main Function

5 functions with return values

fun add():Int {
    var fnum:Int = 403;
    var snum:Int = 538;
    
    return fnum + snum
}

fun subtract():Int {
    var fnum:Int = 1923;
    var snum:Int = 503;
    
    return fnum - snum
}

fun multiply():Int {
    var fnum:Int = 403;
    var snum:Int = 538;
    
    return fnum * snum
}

fun divide():Float {
    var fnum:Float = 403868.03f;
    var snum:Float = 538.32f;
    
    return fnum / snum
}

fun mathe():Float {
    var fnum:Float = 403868.03f;
    var snum:Float = 538.32f;
    var tnum:Float = 2346.27f;
    
    return (fnum + snum)/tnum
}
