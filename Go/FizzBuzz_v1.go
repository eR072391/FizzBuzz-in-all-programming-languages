//usr/bin/go run $0 $@ ; exit
//golangでFizzBuzz

/*
	var a int = 100
	省略可
	var a = 100
	a := 100
*/

package main

func main() {
	for i := 0; i <= 100; i++ {
		if i % 3 == 0 && i % 5 == 0{
			println(i,"FizzBuzz.")
		}else if i % 3 == 0 {
			println(i,"Fizz.")
		}else if i % 5 == 0 {
			println(i,"Buzz.")
		}else{
			println(i)
		}
	}
}
