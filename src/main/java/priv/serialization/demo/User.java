package priv.serialization.demo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import org.msgpack.annotation.Message;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @author lyqlbst
 * @description 用户信息，用于测试序列化和反序列化
 * @email 1098387108@qq.com
 * @date 2019/11/22 7:05 PM
 */
@Data
@Builder
@Message
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public final class User implements Serializable {
    /**
     * 用户id
     */
    private Long userId;
    /**
     * 用户名
     */
    private String userName;
    /**
     * 用户年龄
     */
    private Integer age;
}
