package com.example.demo.controller;


import com.example.demo.model.entity.UserInfo;
import com.example.demo.model.vo.ResponseVo;
import com.example.demo.service.UserInfoService;
import lombok.extern.slf4j.Slf4j;
import org.apache.catalina.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (UserInfo)表控制层
 *
 * @author pzr
 * @since 2024-11-12 13:57:42
 */
@RestController
@RequestMapping("userInfo")
@Slf4j
public class UserInfoController {
    /**
     * 服务对象
     */
    @Resource
    private UserInfoService userInfoService;


    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("/query-user")
    public ResponseVo<UserInfo> queryById(@Param("id") Integer id) {
        ResponseVo<UserInfo> res = new ResponseVo<>();
        UserInfo userInfo = new UserInfo();
        try{
            userInfo = userInfoService.queryById(id);
            res.setData(userInfo);
        }catch (Exception e){
            log.error("userInfo not found, userId={}", id);
        }
        return res;
    }

}

