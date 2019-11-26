package priv.serialization.demo.protobuf;

import com.google.protobuf.InvalidProtocolBufferException;
import priv.serialization.demo.Serialization;
import priv.serialization.demo.User;

/**
 * @author lyqlbst
 * @description ProtoBuf序列化
 * @email 1098387108@qq.com
 * @date 2019/11/26 6:39 PM
 */
public class ProtoBufSerialization implements Serialization<User> {
    @Override
    public String getSerializationName() {
        return "ProtoBuf序列化";
    }

    @Override
    public byte[] serialize(User user) {
        UserProto.UserProtocol userProtocol = UserProto.UserProtocol.newBuilder()
                .setUserId(user.getUserId())
                .setUserName(user.getUserName())
                .setAge(user.getAge())
                .build();

        return userProtocol.toByteArray();
    }

    @Override
    public User deserialize(byte[] bytes) throws InvalidProtocolBufferException {
        UserProto.UserProtocol userProtocol = UserProto.UserProtocol
                .parseFrom(bytes);

        return User.builder()
                .userId(userProtocol.getUserId())
                .userName(userProtocol.getUserName())
                .age(userProtocol.getAge())
                .build();
    }
}
