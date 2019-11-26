package priv.serialization.demo.messagepack;

import org.msgpack.MessagePack;
import org.msgpack.template.TemplateRegistry;
import priv.serialization.demo.Serialization;
import priv.serialization.demo.User;

import java.io.IOException;
import java.util.Objects;

/**
 * @author lyqlbst
 * @description MessagePack序列化
 * @email 1098387108@qq.com
 * @date 2019/11/26 5:42 PM
 */
public class MessagePackSerialization implements Serialization<User> {
    /**
     * 初始化MessagePack实例
     */
    private MessagePack messagePack;

    public MessagePackSerialization() {
        messagePack = new MessagePack();
    }

    @Override
    public String getSerializationName() {
        return "MessagePack序列化";
    }

    @Override
    public byte[] serialize(User user) throws IOException {
        try {
            return messagePack.write(user);
        } catch (IOException e) {
            System.out.println("MessagePack序列化错误...");
            throw e;
        }
    }

    @Override
    public User deserialize(byte[] bytes) throws IOException {
        try {
            return messagePack.read(bytes, User.class);
        } catch (IOException e) {
            System.out.println("MessagePack反序列化错误...");
            throw e;
        }
    }
}
