package com.MyRedis;
import org.springframework.data.redis.core.StringRedisTemplate;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
public class RedisDao {
    private StringRedisTemplate redisTemplate;
    /**
     * 缓存优先读取 JavaBean
     *
     * @param clazz 实体类型
     * @param redisKey key
     * @param supplier 缓存失败时的数据提供器， supplier == null 时 return null
     * @param <T>   类型约束
     * @return 实体对象
     */
    public <T> T get(Class<T> clazz, String redisKey, com.google.common.base.Supplier<T> supplier) {
        T d = null;
        String json = redisTemplate.opsForValue().get(redisKey);
        if (json != null) {
            // 如果解析发生异常，有可能是 Redis 里的数据无效，故把其从 Redis 删除
            try {
                d = JSON.parseObject(json, clazz);
            } catch (Exception ex) {
                redisTemplate.delete(redisKey);
            }
        }
        if (d == null && supplier != null) {
            d = supplier.get();
            // 这里需要考虑，null 对象如果不放缓存，如果这个对象被大量访问，会导致缓存穿透，增加数据库的压力
            if (d != null) {
                redisTemplate.opsForValue().set(redisKey, JSON.toJSONString(d));
            }
        }
        return d;
    }
    /**
     * 缓存优先读取 Collections Or Map
     *
     * @param typeReference 使用泛型时 FastJson 需要用 TypeReference 来指定类型，例如类型为 List<Demo>
     * @param redisKey key
     * @param supplier 缓存失败时的数据提供器， supplier == null 时 return null
     * @param <T>   类型约束
     * @return 实体对象
     */
    public <T> T get(TypeReference<T> typeReference, String redisKey, com.google.common.base.Supplier<T> supplier) {
        T d = null;
        String json = redisTemplate.opsForValue().get(redisKey);
        if (json != null) {
            // 如果解析发生异常，有可能是 Redis 里的数据无效，故把其从 Redis 删除
            try {
                d = JSON.parseObject(json, typeReference);
            } catch (Exception ex) {
                redisTemplate.delete(redisKey);
            }
        }
        if (d == null && supplier != null) {
            d = supplier.get();
            // 这里需要考虑，null 对象如果不放缓存，如果这个对象被大量访问，会导致缓存穿透，增加数据库的压力
            if (d != null) {
                redisTemplate.opsForValue().set(redisKey, JSON.toJSONString(d));
            }
        }
        return d;
    }
    public StringRedisTemplate getRedisTemplate() {
        return redisTemplate;
    }
    public void setRedisTemplate(StringRedisTemplate redisTemplate) {
        this.redisTemplate = redisTemplate;
    }
}