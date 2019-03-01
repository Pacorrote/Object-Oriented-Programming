package programming_exercises_c4.blooddata;

public class BloodData {
	private BloodType bloodType;
	private Factor factor;
	public BloodData() {
		// TODO Auto-generated constructor stub
		this.bloodType=BloodType.O;
		this.factor=Factor.POSITIVO;
	}
	public BloodData(BloodType bloodType, Factor factor) {
		this.bloodType=bloodType;
		this.factor=factor;
	}
	public BloodType getBloodType() {
		return bloodType;
	}
	public void setBloodType(BloodType bloodType) {
		this.bloodType = bloodType;
	}
	public Factor getFactor() {
		return factor;
	}
	public void setFactor(Factor factor) {
		this.factor = factor;
	}
	

}
