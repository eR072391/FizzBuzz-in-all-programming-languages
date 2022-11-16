#! /usr/bin/env ruby
# RubyでFizzBuzz.

def FizzBuzz
    for i in 0..100 do
        if i % 5 == 0 && i % 3 == 0
            puts "#{i} FizzBuzz."
        elsif i % 3 == 0 
            puts "#{i} Fizz."
        elsif i % 5 == 0
            puts "#{i} Buzz."
        else
            puts "#{i}"
        end
    end
end

FizzBuzz()
