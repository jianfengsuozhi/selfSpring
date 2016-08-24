package com.spring.springidol;

import java.util.Collection;

public class OneManBand implements Performer {
  public OneManBand() {
  }

  public void perform() throws PerformanceException {
    for (String str : strs) {
      System.out.println(str);
    }
  }

  private Collection<String> strs;

  public void setStrs(Collection<String> strs) {
    this.strs = strs; //<co id="co_injectStringCollection"/>
  }
}
