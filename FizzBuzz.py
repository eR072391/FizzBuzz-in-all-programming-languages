#!/usr/bin/env python3
# python3でのFizzBuzz

def main():
        for i in range(100):
            if i % 3 == 0 and i % 5 == 0:
                print(i,"FizzBuzz.")
            elif i % 3 == 0:
                print(i,"Fizz.")
            elif i % 5 == 0:
                print(i,"Buzz.")
            else:
                print(i)
        

if __name__ == '__main__':
    main()
