package org.ks.dao;

import org.ks.entity.Admin;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by itachi on 2017/2/10.
 */

/*SqlSessionTemplate，用法和sqlsessionn一致
有mybatis-spring.jar提供*/

@Repository("dao1")
public class MyBatisAdminDao implements AdminDao {

    @Resource
    private SqlSessionTemplate template;

    public SqlSessionTemplate getTemplate() {
        return template;
    }

    public void setTemplate(SqlSessionTemplate template) {
        this.template = template;
    }

    @Override
    public Admin findByCode(String adminCode) {
        Admin admin=template.selectOne("findByCode",adminCode);
        return admin;
    }

    @Override
    public List<Admin> findAll(){
        List<Admin> list=template.selectList("findAll");
        return list;
    }
}
