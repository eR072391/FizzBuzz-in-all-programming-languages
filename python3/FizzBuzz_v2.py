class FizzBuzz():
    def __init__(self, i):
        self.i = i
    
    def fizzbuzz_start(self, max):
        while True:
            if self.i > max:
                break
            elif self.i % 3 == 0 and self.i % 5 == 0:
                print(f"{self.i} FizzBuzz.")
            elif self.i % 3 == 0:
                print(f"{self.i} Fizz.")
            elif self.i % 5 == 0:
                print(f"{self.i} Buzz.")
            else:
                print(self.i)
            
            self.i += 1

def main():
    fb = FizzBuzz(0)
    fb.fizzbuzz_start(100)


if __name__ == "__main__":
    main()
