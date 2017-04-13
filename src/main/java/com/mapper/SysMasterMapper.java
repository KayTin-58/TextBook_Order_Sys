package com.mapper;

import com.po.SysMaster;

/**
 * Created by 直到世界尽头 on 3/11 0011.
 */

public interface SysMasterMapper {

    /**
     * 根据账号获取系统管理员信息
     * @param AccountNum
     * @return
     */
    public SysMaster selectByAccountnum (String AccountNum);


}
