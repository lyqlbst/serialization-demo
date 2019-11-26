package priv.serialization.demo;

/**
 * @author lyqlbst
 * @description 序列化接口
 * @email 1098387108@qq.com
 * @date 2019/11/26 4:57 PM
 */
public interface Serialization<T> {
    /**
     * @return  哪种序列化类型
     */
    String getSerializationName();
    /**
     * 序列化
     *
     * @param obj 对象
     * @return 字节流
     * @throws Exception 可能出现的异常
     */
    byte[] serialize(T obj) throws Exception;

    /**
     * 反序列化
     *
     * @param bytes 字节流
     * @return 反序列化的对象
     * @throws Exception 可能出现的异常
     */
    T deserialize(byte[] bytes) throws Exception;
}
