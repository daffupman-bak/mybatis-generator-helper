package io.daff.base.entity;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 实体类基类
 *
 * @author daffupman
 * @since 2020/1/25
 */
@Data
public class BaseEntity {

    @ApiModelProperty("主键id")
    private Integer id;
}
