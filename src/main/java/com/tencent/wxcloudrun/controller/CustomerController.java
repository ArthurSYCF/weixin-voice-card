package com.tencent.wxcloudrun.controller;

import com.tencent.wxcloudrun.config.ApiResponse;
import com.tencent.wxcloudrun.dto.CounterRequest;
import com.tencent.wxcloudrun.dto.VoiceUploadRequest;
import com.tencent.wxcloudrun.model.Card;
import com.tencent.wxcloudrun.model.Counter;
import com.tencent.wxcloudrun.service.CardService;
import com.tencent.wxcloudrun.service.CounterService;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

/**
 * counter控制器
 */

@Slf4j
@RestController
@RequestMapping("/customer/card")
public class CustomerController {

    @Autowired
    private CardService cardService;

    @GetMapping(value = "/{cardId}")
    ApiResponse getCard(@PathVariable String cardId) {
        log.info("getCard: {}", cardId);
        Card card = cardService.getCard(cardId);
        return ApiResponse.ok(card);
    }

    @PostMapping(value = "/uploadVoice")
    ApiResponse uploadVoice(@RequestBody VoiceUploadRequest request) {
        log.info("uploadVoice: {}", request);
        Card card = cardService.uploadVoice(request.getCardId(), request.getVoiceFile());
        return ApiResponse.ok(card);
    }

}