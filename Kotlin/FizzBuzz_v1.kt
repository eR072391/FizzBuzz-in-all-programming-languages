// KotlinでFizzBuzz
// kotlinc hello.kt -include-runtime -d hello.jar コンパイル
// java -jar hello.jar 実行
// kotlinc-js hello.kt -output hello.js JavaScriptにコンパイルも可

// var 変数名   ミュータブル
// val 変数名   イミュータブル

fun FizzBuzz() {
    for (i in 0..100){
        if (i % 3 == 0 && i % 5 == 0){
            println("${i} FizzBuzz.")
        }else if (i % 3 == 0){
            println("${i} Fizz.")
        }else if (i % 5 == 0){
            println("${i} Buzz.")
        }else{
            println(i)
        }
    }
}

fun main() {
    FizzBuzz()
}
