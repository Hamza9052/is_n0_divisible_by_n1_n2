//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    Divisbel()
}

fun Divisbel(n0:Int,n1:Int,n2:Int):Boolean{

   if (n0 % n1 == 0 && n0 % n2 == 0 ){
       return true
    }else {
       return false
    }

}