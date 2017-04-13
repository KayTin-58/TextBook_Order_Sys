package com.ServiceImple;

        import com.mapper.SysMasterMapper;
        import com.po.SysMaster;
        import com.service.SysService;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.stereotype.Service;

/**
 * Created by 直到世界尽头 on 3/11 0011.
 */
@Service
public class SysServiceImpl  implements SysService{

    @Autowired
    SysMasterMapper sysm;

    @Override
    public SysMaster selectByAccountnum(String AccountNum) {

        SysMaster sm=sysm.selectByAccountnum(AccountNum);

        return sm;
    }


    /**
     * 判断管理员的账号和密码
     * @param account
     * @param userpassword
     * @return
     */
    public boolean judgment(String account,String userpassword){
        SysMaster sm=this.selectByAccountnum(account);
        if(sm!=null){//用户存在
            if(sm.getmPassword().equals(userpassword)&&sm.getAccountNum().equals(account)){
                //密码正确
                return true;
            }else{
                //密码不正确
                return false;
            }

        }else{//用户不存在
            return false;
        }
    }


}
