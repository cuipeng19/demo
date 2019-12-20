package com.demo.api;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.demo.bean.ao.AddBarcodeMerchAO;
import com.demo.util.EncryptUtil;
import com.demo.util.SignUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.TreeMap;

/**
 * @author cuipeng 2019/12/20 11:42
 */
@RestController
@RequestMapping("/demo")
public class DemoController {

    @Autowired
    private RestTemplate restTemplate;

    /**
     * 请求地址
     */
    private String url = "";

    /**
     * 密钥
     */
    private String channelKey = "";

    /**
     * 3DES模式填充
     */
    private String model = "";


    /**
     * 商户进件
     */
    @PostMapping("/add")
    public Object add(@RequestBody AddBarcodeMerchAO ao) throws Exception {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        JSONObject jsonObject = JSON.parseObject(JSON.toJSONString(ao));

        // 加密
        EncryptUtil.encryptByMap(channelKey, jsonObject, model);

        // 签名
        jsonObject.put("sign", SignUtil.signByMap(channelKey, new TreeMap<>(jsonObject)));

        ResponseEntity<String> responseEntity = restTemplate.postForEntity(url, new HttpEntity<>(JSON.toJSONString(jsonObject),headers), String.class);
        return responseEntity;
    }


}
