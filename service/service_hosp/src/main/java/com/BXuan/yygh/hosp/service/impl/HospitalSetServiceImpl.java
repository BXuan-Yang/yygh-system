package com.BXuan.yygh.hosp.service.impl;

import com.BXuan.yygh.common.exception.YyghException;
import com.BXuan.yygh.common.result.ResultCodeEnum;
import com.BXuan.yygh.common.utils.MD5;
import com.BXuan.yygh.hosp.mapper.HospitalSetMapper;
import com.BXuan.yygh.hosp.service.HospitalSetService;
import com.BXuan.yygh.model.hosp.HospitalSet;
import com.BXuan.yygh.vo.order.SignInfoVo;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class HospitalSetServiceImpl extends ServiceImpl<HospitalSetMapper, HospitalSet> implements HospitalSetService {
//        在ServiceImpl里面已经对Mapper实现注入，这里就不需要再次注入了
//    @Autowired
//    private HospitalSetMapper hospitalSetMapper;

    @Override
    public String getSignKey(String hoscode) {
        QueryWrapper<HospitalSet> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("hoscode", hoscode);
        HospitalSet hospitalSet = baseMapper.selectOne(queryWrapper);
        return MD5.encrypt(hospitalSet.getSignKey());
    }

    private SignInfoVo getSignInfoVo(String hoscode){
        QueryWrapper<HospitalSet> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("hoscode", hoscode);
        HospitalSet hospitalSet = baseMapper.selectOne(queryWrapper);
        if (hospitalSet == null){
            throw new YyghException(ResultCodeEnum.HOSPITAL_OPEN);
        }
        SignInfoVo signInfoVo = new SignInfoVo();
        signInfoVo.setSignKey(hospitalSet.getSignKey());
        signInfoVo.setApiUrl(hospitalSet.getApiUrl());
        return signInfoVo;
    }

}
