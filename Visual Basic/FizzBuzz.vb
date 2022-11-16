' Visual BasicでFizzBuzz.
' vbns FizzBuzz.vb ビルド
' mono FizzBuzz.exe 実行

' If文とか大文字小文字気にしなくていいみたい
' 他の算術演算子は他の言語と変わらないが、剰余だけModになる

Imports System

Public Module FizzBuzz
    Sub Main(args As String())
        Dim i As Integer

        For i = 0 To 100
            If i Mod 3 = 0 And i Mod 5 = 0 then
                Console.WriteLine(i & " FizzBuzz.")
            Else If i Mod 3 = 0 then 
                Console.WriteLine(i & " Fizz.")
            Else If i Mod 5 = 0 then
                Console.WriteLine(i & " Buzz.")
            Else
                Console.WriteLine(i)
            End If
        Next
    End Sub
End Module
