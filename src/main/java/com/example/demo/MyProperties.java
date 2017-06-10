package com.example.demo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * Created by ValkSam on 10.06.2017.
 */
@ConfigurationProperties(prefix = "forMyProportiesPrefix")
/*см p.properties и folderNotSetInLocation/m.properties
* для folderNotSetInLocation/m.properties указываем @PropertySource. Для p.properties тоже надо указать, но  уже указали в class MyCommandLineRunner*/
@PropertySource({"classpath:/folderNotSetInLocation/m.properties"})
@Component
public class MyProperties {
  private Integer hhh;
  private Integer kkk;
  private Integer zzz;
  private Integer vvv;

  public Integer getHhh() {
    return hhh;
  }

  public void setHhh(Integer hhh) {
    this.hhh = hhh;
  }

  public Integer getKkk() {
    return kkk;
  }

  public void setKkk(Integer kkk) {
    this.kkk = kkk;
  }

  public Integer getZzz() {
    return zzz;
  }

  public void setZzz(Integer zzz) {
    this.zzz = zzz;
  }

  public Integer getVvv() {
    return vvv;
  }

  public void setVvv(Integer vvv) {
    this.vvv = vvv;
  }
}
