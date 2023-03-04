package com.heima.admin.service.impl;

import com.heima.admin.service.AdChannelService;
import com.heima.model.admin.dto.ChannelDTO;
import com.heima.model.common.dtos.ResponseResult;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author xiaoxin
 * @version 1.0
 * @date 2023/3/3 12:40
 */
class AdChannelServiceImplTest {
    @Autowired
    private AdChannelService adChannelService;

    @Test
    void findByNameAndPage() {
        ChannelDTO channelDTO = new ChannelDTO();
        channelDTO.setName("nodejs");
        channelDTO.setStatus(1);
        channelDTO.setPage(1);
        channelDTO.setSize(2);
        ResponseResult result = adChannelService.findByNameAndPage(channelDTO);
        System.out.println(result);
    }
}
