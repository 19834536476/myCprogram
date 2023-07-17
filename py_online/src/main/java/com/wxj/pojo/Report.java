package com.wxj.pojo;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.text.SimpleDateFormat;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Report {

    // 实验报告id
    @TableId
    private Integer reportId;
    // 对应实验id
    private Integer experimentId;
    // 用户id
    private String userId;
    // 实验报告
    private String codeFile;
    // 实验参数
    private String paramsFile;
    // 运行结果路径
    private String resultFile;
    // 得分
    private Integer score;
    // 创建时间
    private Date createTime;
    // 格式化时间
    public String getFormatDate(){
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return sdf.format(createTime);
    }
}
