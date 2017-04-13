package com.service;

import com.po.SysMaster;

/**
 * Created by 直到世界尽头 on 3/11 0011.
 */
public interface SysService {

    /**
     * 根据账号获取管理员信息
     * @param AccountNum
     * @return
     */
    public SysMaster selectByAccountnum(String AccountNum);
}
