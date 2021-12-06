package cn.jaylong.lab.controller;

import cn.hutool.core.convert.Convert;
import cn.hutool.core.util.RandomUtil;
import cn.jaylong.lab.po.User;
import cn.jaylong.lab.po.VerifierEmbed;
import cn.jaylong.lab.repository.UserJpaRepository;
import com.sankuai.inf.leaf.service.SnowflakeService;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

/**
 * Created by IntelliJ IDEA.
 * Author: I'm
 * Date: 2021/9/22
 */
@RestController
@ApiModel("test")
@RequestMapping("test")
@RequiredArgsConstructor
public class TestController {

    private final UserJpaRepository jpaRepository;

    private final SnowflakeService snowflakeService;

    @Value("${app.name}")
    public String appName;

    @ApiOperation("value")
    @GetMapping("value")
    public String value() {
        return appName;
    }

    @ApiOperation("insert")
    @PostMapping("insert")
    public void insert() {
        User user = new User();
        String random = RandomUtil.randomString(32);
        user.setId(random);
        user.setUsername(random);
        user.setZoneId("1");
        VerifierEmbed embed = new VerifierEmbed();
        embed.setValue(random);
        user.setEmail(embed);
        user.setPhoneNumber(embed);
        jpaRepository.save(user);
    }

    @ApiOperation("update")
    @PatchMapping("/{id}")
    public void update(@PathVariable String id) {
        User user = jpaRepository.findById(id).orElse(new User());
        String random = RandomUtil.randomString(32);
        user.setUsername(random);
        user.setZoneId("1");
        VerifierEmbed embed = new VerifierEmbed();
        embed.setValue(random);
        user.setEmail(embed);
        user.setPhoneNumber(embed);
        jpaRepository.save(user);
    }

    @ApiOperation("delete")
    @DeleteMapping("/{id}")
    public void delete(@PathVariable String id) {
        User user = jpaRepository.findById(id).orElse(new User());
        jpaRepository.delete(user);
    }

    @ApiOperation("query")
    @GetMapping("/{id}")
    public User insert(@PathVariable String id) {
        return jpaRepository.findById(id).orElse(new User());
    }

    @ApiOperation("snowflake")
    @GetMapping("/snowflake/id")
    public String snowflake() {
        return Convert.toStr(snowflakeService.getId("id").getId());
    }
}
