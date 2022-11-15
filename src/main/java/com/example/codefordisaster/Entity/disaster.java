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
}
