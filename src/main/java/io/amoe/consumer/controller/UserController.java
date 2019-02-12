package io.amoe.consumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import io.amoe.consumer.pojo.UserVO;
import io.amoe.entity.User;
import io.amoe.faced.IUserService;
import org.springframework.beans.BeanUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Amoe
 */
@RestController
public class UserController {

    @Reference
    private IUserService userService;

    @GetMapping("user/list")
    public List<UserVO> listUser() {
        return userService.listUser().stream().map(item -> {
            UserVO vo = new UserVO();
            BeanUtils.copyProperties(item, vo);
            return vo;
        }).collect(Collectors.toList());
    }

    @GetMapping("user/name")
    public List<User> listUserByLikeName(String name) {
        return userService.queryUserByName(name);
    }

    @GetMapping("user/phone")
    public List<User> listUserByLikePhone(String phone) {
        return userService.queryUserByPhone(phone);
    }
}
