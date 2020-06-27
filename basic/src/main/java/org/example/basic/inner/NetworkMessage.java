package org.example.basic.inner;

/**
 * <p>描述: [类型描述] </p>
 * <p>创建时间: 2020/6/26 </p>
 *
 * @author <a href="mailto:jiangy@highzap.com" rel="nofollow">蒋勇</a>
 * @version v1.0
 */
public class NetworkMessage {
    public void send() {
        System.out.println("网络消息");
    }

    protected abstract class AbstractQQMessage {
        abstract void sendMessage();
    }
}
