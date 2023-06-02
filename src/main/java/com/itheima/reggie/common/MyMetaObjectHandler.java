package com.itheima.reggie.common;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class MyMetaObjectHandler implements MetaObjectHandler {
    @Override
    public void insertFill(MetaObject metaObject) {
        metaObject.setValue("createTime",LocalDateTime.now());
        metaObject.setValue( "updateTime",LocalDateTime.now());
        metaObject.setValue("createUser",BaseContext.getCurrent());
        metaObject.setValue("updateUser",BaseContext.getCurrent());

    }

    @Override
    public void updateFill(MetaObject metaObject) {
        //employee.setUpdateUser(empId);
        //employee.setUpdateTime(LocalDateTime.now());

        metaObject.setValue("updateTime", LocalDateTime.now());
        metaObject.setValue("updateUser",BaseContext.getCurrent());
    }
}
