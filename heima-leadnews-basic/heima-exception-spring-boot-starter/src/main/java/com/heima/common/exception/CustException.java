package com.heima.common.exception;

import com.heima.model.common.enums.AppHttpCodeEnum;
/**
 * @Description:  抛异常工具类
 * @Version: V1.0
 */
public class CustException {
    //可以改善，加一个string类型的参数为描述信息；不依赖于枚举类的已有的
    public static void cust(AppHttpCodeEnum codeEnum) {
        throw new CustomException(codeEnum );
    }
    public static void cust(AppHttpCodeEnum codeEnum,String msg) {
        throw new CustomException(codeEnum,msg);
    }
}
