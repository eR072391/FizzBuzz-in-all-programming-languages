/* C++ で FizzBuzz */
/* printf関数、cout.write()でも出力可能 */

/* ヘッダ読み込み */
#include <iostream>

/* 指定された名前の名前空間を使う */
using namespace std;

int main(){

    for (int i = 0; i <= 100; i++){
        if(i % 3 == 0 && i % 5 == 0){
            std::cout << i << " FizzBuzz." << std::endl;
        }else if(i % 3 == 0){
            std::cout << i << " Fizz." << std::endl;
        }else if(i % 5 == 0){
            std::cout << i << " Buzz." << std::endl;
        }else{
            std::cout << i << std::endl;
        }
    }

    return 0;
}
