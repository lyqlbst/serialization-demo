package priv.serialization.demo.json;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import priv.serialization.demo.Serialization;
import priv.serialization.demo.User;

import java.io.IOException;

/**
 * @author lyqlbst
 * @description Jackson序列化
 * @email 1098387108@qq.com
 * @date 2019/11/29 3:56 PM
 */
public class JacksonSerialization implements Serialization<User> {
    private ObjectMapper mapper;

    public JacksonSerialization() {
        this.mapper = new ObjectMapper();
    }

    @Override
    public String getSerializationName() {
        return "JackSon序列化";
    }

    @Override
    public byte[] serialize(User user) throws JsonProcessingException {
        return mapper.writeValueAsBytes(user);
    }

    @Override
    public User deserialize(byte[] bytes) throws IOException {
        return mapper.readValue(bytes, User.class);
    }
}
