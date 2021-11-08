package com.sxt.sys.vo;

import com.sxt.sys.domain.User;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author shkstart
 * @create 2021-03-24 11:10
 */
@Data
@EqualsAndHashCode(callSuper = false)//自动的给model bean实现equals方法和hashcode方法
public class UserVo  extends User {

    private static final Long serialVersionUID = 1L;

    private Integer page = 1;

    private Integer limit =10;

}
