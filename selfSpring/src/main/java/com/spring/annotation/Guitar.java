package com.spring.annotation;

import org.springframework.stereotype.Component;

import com.spring.springidol.Instrument;

//需要注册spring bean  默认类名小写  
//@Component("gt")
public class Guitar implements Instrument {
  public void play() {
    System.out.println("Strum strum strum");
  }
}
