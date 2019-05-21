package com.scutech.dbackup.webhook;

import org.springframework.web.bind.annotation.*;

@RestController
public class WebHookController {
    @RequestMapping(value = "/webhook", method = RequestMethod.POST)
    public String webHooks(@RequestBody String data, @RequestHeader("X-DBackup2-Token") String token ) {
        // token, verify that the request is secure
        // 令牌，用于验证请求是否合法，排除不合法请求
        System.out.println("Token: " + token);

        // The data is JSON String
        // data 是 JSON 字符串
        System.out.println("Data: " + data);
        return "";
    }
}
