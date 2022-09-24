package com.BXuan.yygh.hosp.service.impl;

import com.BXuan.yygh.hosp.mapper.HospitalSetMapper;
import com.BXuan.yygh.hosp.service.HospitalSetService;
import com.atguigu.yygh.model.hosp.HospitalSet;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class HospitalSetServiceImpl extends ServiceImpl<HospitalSetMapper, HospitalSet> implements HospitalSetService {
    /*
    在ServiceImpl里面已经对Mapper实现注入，这里就不需要再次注入了
     */
//    @Autowired
//    private HospitalSetMapper hospitalSetMapper;
}
