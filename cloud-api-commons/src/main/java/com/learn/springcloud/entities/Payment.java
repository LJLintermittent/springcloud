package com.learn.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 一些声明信息
 * Description: <br/>
 * date: 2020/10/27 22:30<br/>
 *
 * @author ${李佳乐}<br/>
 * @since JDK 1.8
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment implements Serializable {
    private Long id;
    private String serial;

}
