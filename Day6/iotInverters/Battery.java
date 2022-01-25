package iotInverters;

public class Battery {
	float inputVoltge;
	float inputCurrent;
	
	float outputVoltage;
	float outputCurrent;
	
	
	
	public Battery(float inputVoltage, float inputCurrent, float outputVoltage, float outputCurrent) {
		this.inputCurrent  = inputCurrent;
		this.inputVoltge   = inputVoltage;
		this.outputCurrent = outputCurrent;
		this.outputVoltage = outputVoltage;
	}
}
