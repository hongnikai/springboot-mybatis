package com.sailing.springbootmybatis.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sailing.springbootmybatis.bean.Userinfo;
import com.sailing.springbootmybatis.mapper.one.UserinfoMapper;
import com.sailing.springbootmybatis.mapper.two.PeopleMapper;
import com.sailing.springbootmybatis.service.UserinfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

/**
 * @author baibing
 * @project: springboot-mybatis
 * @package: com.sailing.springbootmybatis.service.impl
 * @Description: service实现类
 * @date 2018/9/12 10:03
 */
@Service
@Transactional
public class UserinfoServiceImpl implements UserinfoService {

    @Autowired
    private UserinfoMapper userinfoMapper;

    @Autowired
    private PeopleMapper peopleMapper;


    /**
     * 删除指定用户(如果多个数据源，没有使用jta的情况下只有transactionManagerOne会回滚，transactionManagerTwo不会回滚)
     * @param id 用户id
     * @return
     */
    @Override
    public Object deleteUser(Integer id) {
        userinfoMapper.deleteByPrimaryKey(id);

        peopleMapper.deleteByPrimaryId(id);
        return "ss";

    }


}
