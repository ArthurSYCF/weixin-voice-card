package com.tencent.wxcloudrun.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.tencent.wxcloudrun.model.Card;
import com.tencent.wxcloudrun.model.Counter;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface CardMapper extends BaseMapper<Card> {

    @Select("select * from card " +
            "where card_id = #{cardId} and is_delete = 0; ")
    Card selectCardByCardId(@Param("cardId") String cardId);
}
