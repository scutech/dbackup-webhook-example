<?php
// token, verify that the request is secure
// 令牌，用于验证请求是否合法，排除不合法请求
$token = $_SERVER['X_DBACKUP2_TOKEN'];

// The data is JSON String
// data 是 JSON 字符串
$data = file_get_contents("php://input");
file_put_contents("webhooks.json", $data);
