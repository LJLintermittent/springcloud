package com.learn.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 一些声明信息
 * Description: <br/>
 * date: 2020/10/27 22:33<br/>
 *
 * @author ${李佳乐}<br/>
 * @since JDK 1.8
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> {
    private Integer code;
    private String message;
    private T      data;

    public CommonResult(Integer code,String message){
        this(code,message,null);
    }
}
