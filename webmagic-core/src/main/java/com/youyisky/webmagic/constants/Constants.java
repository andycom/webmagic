package com.youyisky.webmagic.constants;

public class Constants {
  /*
   * DEV PRO ：用于区别不同的环境
   */
  public static final int DEV = 0; //开发环境
  public static final int PRO = 1; // 生产环境
  
  /**
   * crawler system database config
   */
  public static final String DBC_URL_SPIDER_DEV = "jdbc:mysql://1.1.18.172:3306/spiderdata?autoReconnect=true&useUnicode=true&characterEncoding=utf8&zeroDateTimeBehavior=convertToNull";
  public static final String JDBC_URL_ARTICLE1 = "jdbc:mysql://12.1.3.6:3306/spiderdata?autoReconnect=true&useUnicode=true&characterEncoding=utf8&zeroDateTimeBehavior=convertToNull";
  public static final String JDBC_URL_SPIDER_PRO = "jdbc:mysql://12.16.4.17:3306/spiderdata?autoReconnect=true&useUnicode=true&character_set_server=utf8mb4&zeroDateTimeBehavior=convertToNull";
  public static final String JDBC_USERNAME = "root";
  public static final String JDBC_PASSWORD = "111111";
}
