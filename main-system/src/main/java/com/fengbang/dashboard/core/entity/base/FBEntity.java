package com.fengbang.dashboard.core.entity.base;

import java.io.Serializable;

/**
 * @author luxin
 * @InterfaceName: FBEntity
 * @Description: entity层抽象接口
 * @date: 2017/11/1 18:35
 */
public interface FBEntity extends Serializable {

    /**
     * @Title: getId
     * @Description: 获取ID
     * @param
     * @return java.lang.String
     * @throws
     *
     * @author luxin
     * @date 2017/11/02 10:10:14
     */
    String getId();

}