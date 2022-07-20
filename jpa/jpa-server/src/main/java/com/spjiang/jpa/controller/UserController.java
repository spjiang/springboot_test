package com.spjiang.jpa.controller;

/**
 * Package: com.spjiang.jpa.controller
 *
 * @description:
 * @author: jiangshengping <spjiang@aliyun.com>
 * @create: 2022-07-20 10:50
 */

import com.spjiang.common.exception.ErrorCode;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.spjiang.common.dto.RespDTO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = "用户")
@RestController
@Slf4j
@RequestMapping("/api/user")
public class UserController {

    @PostMapping("/get")
    @ApiOperation(value = "获取")
    public Object get() {
        return JSON.toJSONString(RespDTO.onError(ErrorCode.NO_OPERATION_ROLE), SerializerFeature.PrettyFormat,
                SerializerFeature.WriteNonStringKeyAsString);
    }
}
