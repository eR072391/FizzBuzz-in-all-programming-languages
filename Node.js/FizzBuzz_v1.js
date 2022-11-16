#! /usr/bin/env node
// Node.jsでFizzBuzz
// sudo apt install nodejs npm
// npm install express

//ブラウザに表示する見た目部分にはEJS形式のファイルを使う。
//ビューファイルと呼ぶ。

// Expressを使用
// expressの読み込み
const express = require('express');
const app = express();

//publicフォルダ内のファイルを読み込める
//app.use(express.static('public'));

let res_text = '';

app.get('/', (req, res) => {
    res.end('go to /fizzbuzz')
});

// ルーティング「fizzbuzz」にリクエストが来たときに、処理
app.get('/fizzbuzz', (req, res) => {
    for (let i = 0; i<=100; i++){
        if (i % 5 == 0 && i % 3 == 0){
            res_text += i + " FizzBuzz.\n";
        }else if (i % 3 == 0){
            res_text += i + " Fizz.\n";
        }else if (i % 5 == 0){
            res_text += i + " Buzz.\n";
        }else{
            res_text += i + "\n";
        }
    }

    res.end(res_text);
});


// ポート3000番を使用
app.listen(3000)
