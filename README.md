# stomp
RabbitMQ 实时消息推送

WebSocket 作为 HTML5 提供的新一代客户端-服务器异步通信方法，能够轻松完成前端与后台的双向通信。
RabbitMQ 服务提供了一个 STOMP 插件，能够实现与 WebSocket 的桥接，这样既能够实现消息的主动推送，
同时也能够实现消息的异步处理。在传统的 Web 开发中存在许多状态变更实时性的需求，
比如资源被占用后需要广播它的实时状态，利用本文提出的解决方案，可以方便将其推送到所有监听的客户端。
因此在新 J2EE 开发项目中，建议使用本文提出的方案替代原来 ajax 轮询方法刷新状态。