package org.ks.controller;

import org.ks.entity.Cost;
import org.ks.service.ICostService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;

/**
 * Created by itachi on 2017/2/9.
 */

@Controller
@RequestMapping("/cost")
public class CostController implements Serializable {

    @Resource
    private ICostService costService;

    public ICostService getCostService() {
        return costService;
    }

    public void setCostService(ICostService costService) {
        this.costService = costService;
    }

    @RequestMapping("/find.do")
    public String findAll(ModelMap model){
        List<Cost> list=costService.findAll();
        model.addAttribute("costs",list);
        return "cost/cost_list";
    }
}
