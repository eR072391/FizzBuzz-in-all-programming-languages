//usr/bin/env java $0 $@;exit
// JavaでのFizzBuzz

//public 全てのクラスからアクセスできる
//protected 同じクラス、同じパッケージ・サブクラスからアクセスできる
//なし 同じクラス、同じパッケージからアクセスできる
//private 同じクラスのみアクセス可能

//void 戻り値なし
//main(String[] args) コマンドライン引数を表す

package FizzBuzz;

public class FizzBuzz {
    public static void main(String[] args){
        for (int i = 0;i<=100;i++){
            if (i % 3 == 0 && i % 5 == 0){
                System.out.println(i+" FizzBuzz.");
            }else if(i % 3 == 0){
                System.out.println(i+" Fizz.");
            }else if(i % 5 == 0){
                System.out.println(i+" Buzz.");
            }else{
                System.out.println(i);
            }
        }
    }
}
