fun main() {
    fun FisrtFactorial(num: Int): Int{

        return if (num < 0){
            -1
        } else if (num ==0){
            1
        } else {
            num * FisrtFactorial(num-1)
        }
    }
    println(FisrtFactorial(5))fun FisrtFactorial(num: Int): Int{

        return if (num < 0){
            -1
        } else if (num ==0){
            1
        } else {
            num * FisrtFactorial(num-1)
        }
    }
    println(FisrtFactorial(5))
}