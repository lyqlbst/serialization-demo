package priv.serialization.demo;

import priv.serialization.demo.jdk.JdkSerialization;
import priv.serialization.demo.messagepack.MessagePackSerialization;
import priv.serialization.demo.protobuf.ProtoBufSerialization;

/**
 * @author lyqlbst
 * @description 测试序列化
 * @email 1098387108@qq.com
 * @date 2019/11/26 5:15 PM
 */
public class TestSerialization {
    /**
     * 测试 序列化 | 反序列化 的次数
     */
    private static final int TEST_COUNT = 100_000;
    /**
     * 实例化一个user，用于测试
     */
    private static final User USER = User.builder()
            .userId(3L)
            .userName("张三")
            .age(18)
            .build();

    public static void main(String[] args) throws Exception {
        testSerialization(new JdkSerialization());
        testSerialization(new MessagePackSerialization());
        testSerialization(new ProtoBufSerialization());
    }

    /**
     * 测试各种序列化，打印序列化后字节流的大小
     *
     * @param serialization 某种序列化
     */
    private static void testSerialization(Serialization<User> serialization) throws Exception {
        System.out.println("------------------------------\n");
        System.out.println("序列化类别：" + serialization.getSerializationName() + "\n");

        byte[] bytes = serialization.serialize(USER);
        System.out.print("字节流长度为：" + bytes.length + "\t");

        long loopSerializeMillis = loopTest(() -> serialize(serialization));
        System.out.print("序列化" + TEST_COUNT + "次所用时间为：" + loopSerializeMillis + "ms\t\t");

        serialization.deserialize(bytes);

        long loopDeserializeMillis = loopTest(() -> deserialize(serialization, bytes));
        System.out.println("反序列化" + TEST_COUNT + "次所用时间为：" + loopDeserializeMillis + "ms\n");
    }

    /**
     * 测试序列化
     *
     * @param serialization 序列化测试类
     */
    private static void serialize(Serialization<User> serialization) {
        try {
            serialization.serialize(USER);
        } catch (Exception e) {
            System.out.println("循环测试序列化失败...");
            e.printStackTrace();
        }
    }

    /**
     * 测试反序列化
     *
     * @param serialization 反序列化测试类
     * @param bytes         字节流
     */
    private static void deserialize(Serialization<User> serialization, byte[] bytes) {
        try {
            serialization.deserialize(bytes);
        } catch (Exception e) {
            System.out.println("循环测试反序列化失败...");
            e.printStackTrace();
        }
    }

    /**
     * 循环测试
     *
     * @param r 测试的任务
     * @return 所用时间（毫秒ms）
     */
    private static long loopTest(Runnable r) {
        long startMillis = System.currentTimeMillis();

        int count = 0;
        while (count++ < TEST_COUNT) {
            r.run();
        }

        long endMillis = System.currentTimeMillis();

        return endMillis - startMillis;
    }
}
