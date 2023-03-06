package com.BXuan.yygh.vo.hosp;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 * 返回科室列表的部分信息
 */
@Data
@ApiModel(description = "Department")
public class DepartmentVo {

	@ApiModelProperty(value = "科室编号")
	private String depcode;

	@ApiModelProperty(value = "科室名称")
	private String depname;

	@ApiModelProperty(value = "下级节点")
	private List<DepartmentVo> children;

}

