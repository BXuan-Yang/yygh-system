package com.BXuan.yygh.common.handler;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * Mybatis plus Handler配置类
 */
@Component
public class CommonMetaObjectHandler implements MetaObjectHandler {

    /**
     * 插入时对数据进行自动填充
     * @param metaObject 对象
     */
    @Override
    public void insertFill(MetaObject metaObject) {
        this.setFieldValByName("createTime",new Date(), metaObject);
        this.setFieldValByName("updateTime",new Date(), metaObject);
    }

    /**
     * 更新时对数据进行自动填充
     * @param metaObject 对象
     */
    @Override
    public void updateFill(MetaObject metaObject) {
        this.setFieldValByName("updateTime",new Date(), metaObject);
    }
}
