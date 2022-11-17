import Control.Monad

-- HaskellでFizzBuzz
-- 関数の利用 f(x, y)という形でなく、f x y という形で書く。


-- 変数iの型はIntと宣言
-- i :: Int

main = fizzbuzz 100

fizzbuzz max = do
    forM_ [0..max] $ \i -> do
        if (i `mod` 3 == 0 && i `mod` 5 == 0)
        then
            putStrLn $ (show i) ++ " FizzBuzz."
        else if (i `mod` 3 == 0)
        then
            putStrLn $ (show i) ++ " Fizz."
        else if (i `mod` 5 == 0)
        then
            putStrLn $ (show i) ++ " Buzz."
        else
            putStrLn (show i)
