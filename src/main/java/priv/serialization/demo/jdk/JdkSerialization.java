package priv.serialization.demo.jdk;

import priv.serialization.demo.Serialization;
import priv.serialization.demo.User;

import java.io.*;

/**
 * @author lyqlbst
 * @description JDK自带的序列化
 * @email 1098387108@qq.com
 * @date 2019/11/26 4:57 PM
 */
public class JdkSerialization implements Serialization<User> {
    @Override
    public String getSerializationName() {
        return "JDK序列化";
    }

    @Override
    public byte[] serialize(User user) throws IOException {
        try (ByteArrayOutputStream bos = new ByteArrayOutputStream()) {
            try (ObjectOutputStream oos = new ObjectOutputStream(bos)) {
                oos.writeObject(user);
                return bos.toByteArray();
            }
        } catch (IOException e) {
            System.out.println("jdk序列化错误...");
            throw e;
        }
    }

    @Override
    public User deserialize(byte[] bytes) throws Exception {
        try (ByteArrayInputStream bis = new ByteArrayInputStream(bytes)) {
            try (ObjectInputStream ois = new ObjectInputStream(bis)) {
                return ((User) ois.readObject());
            }
        } catch (IOException e) {
            System.out.println("jdk反序列化错误...");
            throw e;
        } catch (ClassNotFoundException e) {
            System.out.println("无法实例化对象，类未找到...");
            throw e;
        }
    }
}
