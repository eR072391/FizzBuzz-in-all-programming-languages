for i = 0, 100 do
    if i % 3 == 0 and i % 5 == 0 then
        data = string.format("%d FizzBuzz.",i)
        print(data)
    elseif i % 3 == 0 then
        data = string.format("%d Fizz.",i)
        print(data)
    elseif i % 5 == 0 then
        data = string.format("%d Buzz.",i)
        print(data)
    else
        print(i)
    end
end
