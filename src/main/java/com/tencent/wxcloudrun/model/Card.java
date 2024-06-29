package com.tencent.wxcloudrun.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@TableName("card")
public class Card implements Serializable {

  @TableId(type = IdType.AUTO)
  private Integer id;

  private String cardId;

  private String voiceFile;

  private CardStatus status;

  private boolean isDeleted;

  private LocalDateTime createdAt;

  private LocalDateTime updatedAt;
}
