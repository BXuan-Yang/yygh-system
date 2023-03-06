package com.BXuan.yygh.hosp.service;

import com.BXuan.yygh.model.hosp.HospitalSet;
import com.baomidou.mybatisplus.extension.service.IService;

public interface HospitalSetService extends IService<HospitalSet> {
    /**
     * 获取签名key
     */
    String getSignKey(String hoscode);
}
