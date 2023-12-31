package io.geekidea.boot.system.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * 修改部门参数
 *
 * @author geekidea
 * @since 2022-12-26
 */
@Data
@Schema(description = "修改部门参数")
public class SysDeptUpdateDto implements Serializable {
    private static final long serialVersionUID = 1L;

    @Schema(description = "主键")
    @NotNull(message = "主键不能为空")
    private Long id;

    @Schema(description = "部门名称")
    @NotBlank(message = "部门名称不能为空")
    @Length(max = 32, message = "部门名称长度超过限制")
    private String name;

    @Schema(description = "父id")
    @NotNull(message = "父id不能为空")
    private Long parentId;

    @Schema(description = "状态，0：禁用，1：启用")
    private Boolean status;

    @Schema(description = "排序")
    private Integer sort;

}


