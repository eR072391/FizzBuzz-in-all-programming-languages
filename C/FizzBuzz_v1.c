/* C言語でFizzBuzz */

/* 標準の入力/出力を扱うヘッダーファイルの読み込み */
#include <stdio.h>

int FizzBuzz(void){
    int i;
    for (i = 0; i <= 100; i++){
        if (i % 3 == 0 && i % 5 == 0){
            printf("%d FizzBuzz.\n", i);
        }else if (i % 3 == 0){
            printf("%d Fizz.\n", i);
        }else if (i % 5 == 0){
            printf("%d Buzz.\n", i);
        }else{
            printf("%d\n",i);
        }
    }
}


/* void 型がなし、戻り値なし*/
void main(){
    FizzBuzz();
}
