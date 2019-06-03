# -*- coding: utf-8 -*-
# vim: ts=4 sw=4 sts=4 et:
from flask import Flask, request, jsonify

app = Flask(__name__)


@app.route("/webhook", methods=["POST"])
def webhook():
    # token, verify that the request is secure
    # 令牌，用于验证请求是否合法，排除不合法请求
    token = request.args.get('X-DBackup2-Token')
    print('Token: ' + token)

    # The data is JSON Object
    # data 是 JSON 对象
    data = request.json
    print(data)
    return jsonify()


app.run()
