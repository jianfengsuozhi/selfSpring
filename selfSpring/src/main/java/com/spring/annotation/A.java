package com.spring.annotation;

import com.spring.springidol.Instrument;
import com.spring.springidol.PerformanceException;
import com.spring.springidol.Performer;

public class A implements Performer{
	private Instrument instrument;
	
	public Instrument getInstrument() {
		return instrument;
	}

	public void setInstrument(Instrument instrument) {
		this.instrument = instrument;
	}

	@Override
	public void perform() throws PerformanceException {
		instrument.play();
	}
	

}
