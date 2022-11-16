package com.example.codefordisaster.Entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

@Data
public class disaster {
    @TableId(type = IdType.AUTO)
    private Long disasterId;
    private String disasterCode;
    private String govSendId;
    private String location;
    private String disasterTime;
    private String sourceBig;
    private String sourceSmall;
    private String contentType;
    private String content;
    private String disasterBig;
    private String disasterMiddle;
    private String disasterSmall;
}
