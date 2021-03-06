package com.mooc.ppjoke;


import com.kunminx.architecture.BaseApplication;
import com.mooc.libarchitecture.utils.Utils;
import com.mooc.libnetwork.ApiService;

/**
 * 咱们的服务器已经部署到公网了.
 * <p>
 * 项目在线Api文档地址：http://123.56.232.18:8080/serverdemo/swagger-ui.html#/
 * <p>
 * 同学们有需要的话,可以按照:https://git.imooc.com/Chubby/jetpack_ppjoke/src/master/%e6%9c%8d%e5%8a%a1%e5%99%a8%e7%8e%af%e5%a2%83%e6%90%ad%e5%bb%ba.md
 * 来搭建本地服务器
 */
public class JokeApplication extends BaseApplication {

    @Override
    public void onCreate() {
        super.onCreate();
        Utils.init(this);
        ApiService.init("http://123.56.232.18:8080/serverdemo", null);
    }
}
