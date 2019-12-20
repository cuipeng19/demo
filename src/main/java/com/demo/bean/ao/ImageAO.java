package com.demo.bean.ao;

import lombok.Data;

/**
 * @author cuipeng 2019/12/20 11:45
 */
@Data
public class ImageAO {

    /**
     * 图片base64编码
     */
    private String img;

    /**
     * 图片后缀
     */
    private String imgSuffix;

    /**
     * 图片类型
     */
    private Integer imgType;
}
