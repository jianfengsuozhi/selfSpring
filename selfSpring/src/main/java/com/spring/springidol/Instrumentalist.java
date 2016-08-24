package com.spring.springidol;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;

import com.spring.annotation.StringedInstrument;

public class Instrumentalist implements Performer {
  public Instrumentalist() {
  }

  public void perform() throws PerformanceException {
    System.out.print("Playing " + song + " : ");
    instrument.play();
  }
  public String testReturn(){
	  return "return";
  }
  //注解 基本类型和String的值
//  @Value("str")
  //EL表达式
//  @Value("#{systemEnvironment['JAVA_HOME']}")
  private String song;

  public void setSong(String song) { //<co id="co_injectSong"/>
    this.song = song;
  }

  public String getSong() {
    return song;
  }

  public String screamSong() {
    return song;
  }
  //按类型自动装配  问题：如果没有这个bean或多个bean,会抛异常
  //required=false，若没有匹配为null
//  @Autowired(required=false)
//  private Instrument instrument;
  //当多个bean时，使用@Qualifier进行限定
//   @Autowired
//  //名字是instrument1的bean
//  @Qualifier("instrument1")
//  private Instrument instrument;
//   @Autowired
   //名字是instrument1的bean
//   @Qualifier("instrument1")
   private Instrument instrument;

  public void setInstrument(Instrument instrument) {
    this.instrument = instrument;
  }

	public Instrumentalist(String song, Instrument instrument) {
		super();
		this.song = song;
		this.instrument = instrument;
	}
  
}
