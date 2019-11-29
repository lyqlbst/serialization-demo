package priv.serialization.demo.json;

import com.alibaba.fastjson.JSON;
import priv.serialization.demo.Serialization;
import priv.serialization.demo.User;

/**
 * @author lyqlbst
 * @description FastJson序列化
 * @email 1098387108@qq.com
 * @date 2019/11/29 4:03 PM
 */
public class FastJsonSerialization implements Serialization<User> {
    @Override
    public String getSerializationName() {
        return "FastJson序列化";
    }

    @Override
    public byte[] serialize(User user) {
        return JSON.toJSONBytes(user);
    }

    @Override
    public User deserialize(byte[] bytes) {
        return JSON.parseObject(bytes, User.class);
    }
}
