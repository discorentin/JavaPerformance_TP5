package org.polytechtours.javaperformance.tp.paintingants;

import org.apache.jmeter.config.Arguments;
import org.apache.jmeter.protocol.java.sampler.JavaSamplerClient;
import org.apache.jmeter.protocol.java.sampler.JavaSamplerContext;
import org.apache.jmeter.samplers.SampleResult;


public class JMeterTest implements JavaSamplerClient {

	private SampleResult results;
	
	@Override
	public Arguments getDefaultParameters() {
		Arguments args = new Arguments();                
        return args;

	}

	@Override
	public SampleResult runTest(JavaSamplerContext arg0) {
		
		results = new SampleResult();
		
		results.setSampleLabel("PaintingantsTest");
		results.sampleStart(); 
		try {
			CColonie colonie = new CColonie();
			colonie.run();
			System.out.println("testing1");			
			results.setSuccessful(true);

		} catch (Throwable e) {
			results.setSuccessful(false);
			e.printStackTrace();
		} finally {
			results.sampleEnd();
		}
		return results;

	}

	@Override
	public void setupTest(JavaSamplerContext arg0) {
		System.out.println("testing start");
	}

	@Override
	public void teardownTest(JavaSamplerContext arg0) {
		System.out.println("testing end");
	}


}
