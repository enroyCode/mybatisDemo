/**
 * 版权所有(C)，上海海鼎信息工程股份有限公司，2016，所有权利保留。
 * <p>
 * 项目名：	mybatisDemo
 * 文件名：	InitializationListener.java
 * 模块说明：
 * 修改历史：
 * 2018/2/11 - zhuchao - 创建。
 */
package com.enroy.mybatis.demo.server;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;

/**
 * @author zhuchao
 */
public class InitializationListener implements ApplicationListener<ContextRefreshedEvent> {
  @Override
  public void onApplicationEvent(ContextRefreshedEvent event) {

  }
}
