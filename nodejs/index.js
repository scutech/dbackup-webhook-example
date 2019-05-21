const express = require('express')
const fs = require('fs')
const app = express()
const port = 3000

app.use(express.json())

app.post('/webhook', (req, res) => {
  // token, verify that the request is secure
  // 令牌，用于验证请求是否合法，排除不合法请求
  const token = req.get('X-DBackup2-Token')
  console.log('Token: ' + token)

  // The data is JSON Object
  // data 是 JSON 对象
  const data = req.body
  console.log('Data: ' + JSON.stringify(data))
})

app.listen(port, () => console.log(`Example app listening on port ${port}!`))
