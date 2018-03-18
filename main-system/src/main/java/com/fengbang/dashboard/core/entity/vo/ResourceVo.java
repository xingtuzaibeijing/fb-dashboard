package com.fengbang.dashboard.core.entity.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fengbang.dashboard.core.entity.AuthResource;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.List;

/**
 * @description:
 * @author:QianHuaSheng
 * @since:2018/1/18
 */
@Data
public class ResourceVo {
    @JsonProperty("authResources")
    List<AuthResource> authResources;
}
