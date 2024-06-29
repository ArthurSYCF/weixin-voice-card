package com.tencent.wxcloudrun.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class VoiceUploadRequest implements Serializable {

    private String cardId;

    private String voiceFile;

}
