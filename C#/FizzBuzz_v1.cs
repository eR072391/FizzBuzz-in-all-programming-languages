// C# で FizzBuzz.
// Monoを使用
// mcs FizzBuzz.cs コンパイル
// mono FizzBuzz.exe 実行
using System;

// 名前空間の定義
namespace FizzBuzzApplication{
    class FizzBuzz{
        static void Main(String[] args){
            
            for(int i = 0; i <= 100; i++){
                if (i % 3 == 0 && i % 5 == 0){
                    Console.WriteLine($"{i} FizzBuzz.");
                }else if (i % 3 == 0){
                    Console.WriteLine($"{i} Fizz.");
                }else if (i % 5 == 0){
                    Console.WriteLine($"{i} Buzz.");
                }else{
                    Console.WriteLine($"{i}");
                }
            }

        }
    }
}
