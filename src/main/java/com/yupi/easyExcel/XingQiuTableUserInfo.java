package com.yupi.easyExcel;


import com.alibaba.excel.annotation.ExcelProperty;
import lombok.Data;

/**
 * @author: xinhuo
 * @ClassName: yupao-backend
 * @Description:    星球表格用户信息
 */
@Data
public class XingQiuTableUserInfo {
    /**
     * id
     */
    @ExcelProperty("成员编号")
    private String planetCode;

    /**
     * 用户昵称
     */
    @ExcelProperty("成员昵称")
    private String username;

}