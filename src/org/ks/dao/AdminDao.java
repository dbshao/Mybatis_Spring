package org.ks.dao;

import org.ks.entity.Admin;
import org.ks.util.MyBatisDao;

import java.util.List;

/**
 * Created by itachi on 2017/2/9.
 */

@MyBatisDao
public interface AdminDao {
    public Admin findByCode(String adminCode);
    public List<Admin> findAll();
}
