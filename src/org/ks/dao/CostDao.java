package org.ks.dao;

import org.ks.entity.Cost;
import org.ks.util.MyBatisDao;

import java.util.List;

/**
 * Created by itachi on 2017/2/9.
 */

@MyBatisDao
public interface CostDao {
    public List<Cost> findAll();
}
