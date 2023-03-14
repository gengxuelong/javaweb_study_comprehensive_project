package com.itheima.domain.store;

import com.itheima.domain.store.Catalog;
import com.itheima.domain.store.Company;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@AllArgsConstructor
@Data
@NoArgsConstructor
public class Question {
    private String id;			//题目ID

    private String companyId;	//所属企业
    private String catalogId;	//题目所属目录ID

    private String remark;		//题目简介

    private String subject;     //题干

    private String analysis;	//题目分析

    private String type;       	//题目类型  1:单选，2：多选，3：简答
    private String difficulty; 	//难易程度： 1极易 2容易 3普通  4困难  5极难

    private String isClassic; 	//是否经典面试题 0：否 1：是
    private String state;   	//题目状态  0：不可用  1：可用（只有审核通过的题目才可以设置）

    private String reviewStatus;//审核状态  -1 审核不通过  0 审核中   1 审核通过
    private Date createTime;
    
    private Company company;
    private Catalog catalog;

    private String picture;
    
	// getter/setter 略
}