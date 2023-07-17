package com.wxj.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wxj.mapper.ExperimentMapper;
import com.wxj.pojo.Experiment;
import com.wxj.service.ExperimentService;
import org.springframework.stereotype.Service;

@Service // 此处使用了mp提供的通用service模板
public class ExperimentServiceImpl extends ServiceImpl<ExperimentMapper, Experiment> implements ExperimentService {


}
