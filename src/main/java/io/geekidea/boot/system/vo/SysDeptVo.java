package io.geekidea.boot.system.vo;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 部门VO
 *
 * @author geekidea
 * @since 2022-12-26
 */
@Data
@Schema(description = "部门查询结果")
public class SysDeptVo implements Serializable {

    private static final long serialVersionUID = 1L;

    @Schema(description = "主键")
    private Long id;

    @Schema(description = "部门名称")
    private String name;

    @Schema(description = "父id")
    private Long parentId;

    @Schema(description = "状态，0：禁用，1：启用")
    private Integer status;

    @Schema(description = "排序")
    private Integer sort;

    @Schema(description = "创建时间")
    private Date createTime;

    @Schema(description = "修改时间")
    private Date updateTime;

}

