package com.du.controller;

import com.aliyuncs.dysmsapi.model.v20170525.SendSmsResponse;
import com.aliyuncs.exceptions.ClientException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import static com.du.common.AliyunSmsUtils.sendSms;

/**
 * @author xiaolong
 * @create 2020-09-24 10:09
 * @description
 */
@Controller
@RequestMapping("/getMessage")
public class MessageController {
//
//    private static int newcode;
//
//    public static int getNewcode() {
//        return newcode;
//    }
//    public static void setNewcode(){
//        newcode = (int)(Math.random()*1000000);  //每次调用生成一位六位数的随机数
//    }
//
//    @GetMapping
//    @ResponseBody
//    public Object getMessage(int tel) throws ClientException {
//        setNewcode();
//        String code = Integer.toString(getNewcode());
//        System.out.println("发送的验证码为："+code);
//        //发短信
//        SendSmsResponse response =sendSms(String.valueOf(tel),code); // TODO 填写你需要测试的手机号码
//        System.out.println("短信接口返回的数据----------------");
//        System.out.println("Code=" + response.getCode());
//        System.out.println("Message=" + response.getMessage());
//        System.out.println("RequestId=" + response.getRequestId());
//        System.out.println("BizId=" + response.getBizId());
//        return "发送成功";
//    }
}
