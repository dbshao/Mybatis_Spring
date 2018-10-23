package org.ks.service.impl;

import org.ks.dao.CostDao;
import org.ks.entity.Cost;
import org.ks.service.ICostService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by itachi on 2017/2/9.
 */

@Service
public class CostService implements ICostService {
    @Resource(name="costDao")
    private CostDao costDao;

    public CostDao getCostDao() {
        return costDao;
    }

    public void setCostDao(CostDao costDao) {
        this.costDao = costDao;
    }

    @Override
    public List<Cost> findAll() {
        return costDao.findAll();
    }
}
