//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    Divisbel()
}

fun Divisbel(n0:Int,n1:Int,n2:Int):Triple<Int,Int,Int>{

    return if (n0 % n1 == 0 && n0 % n2 == 0 ){
        println("Number $n0 is divisible by $n1 and $n2")
        Divisbel(n0,n1,n2)
    }else {
        println("Number $n0 is indivisible by $n1 or $n2")
        Divisbel(n0,n1,n2)
    }

}