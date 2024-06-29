package com.tencent.wxcloudrun.service;

import com.tencent.wxcloudrun.model.Card;
import com.tencent.wxcloudrun.model.Counter;

import java.util.Optional;

public interface CardService {

    Card getCard(String cardId);

    Card uploadVoice(String cardId, String voiceFile);

}
