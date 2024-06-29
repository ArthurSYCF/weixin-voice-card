package com.tencent.wxcloudrun.service.impl;

import com.tencent.wxcloudrun.dao.CardMapper;
import com.tencent.wxcloudrun.dao.CountersMapper;
import com.tencent.wxcloudrun.model.Card;
import com.tencent.wxcloudrun.model.Counter;
import com.tencent.wxcloudrun.service.CardService;
import com.tencent.wxcloudrun.service.CounterService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.Optional;

@Service
public class CardServiceImpl implements CardService {

    @Autowired
    private CardMapper cardMapper;

    @Override
    public Card getCard(String cardId) {
        return cardMapper.selectCardByCardId(cardId);
    }

    @Override
    public Card uploadVoice(String cardId, String voiceFile) {
        Card card = cardMapper.selectCardByCardId(cardId);
        if (card == null) {
            return null;
        }

        card.setVoiceFile(voiceFile);
        card.setUpdatedAt(LocalDateTime.now());
        cardMapper.updateById(card);
        return card;
    }
}
