package com.spring.aop;

import com.spring.springidol.PerformanceException;
import com.spring.springidol.Performer;

public class TestPerfomer implements Performer{

	@Override
	public void perform() throws PerformanceException {
		System.out.println("测试切面");
	}

}
