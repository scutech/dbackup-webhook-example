package com.scutech.dbackup;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;

public class WebHookServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String token = req.getHeader("X-DBackup2-Token");

        // token, verify that the request is secure
        // 令牌，用于验证请求是否合法，排除不合法请求
        System.out.println("Token: " + token);

        BufferedReader reader = req.getReader();
        StringBuilder data = new StringBuilder();
        String str;
        while((str = reader.readLine()) != null) {
            data.append(str);
        }

        // The data is JSON String
        // data 是 JSON 字符串
        System.out.println("Data: " + data);
    }
}
