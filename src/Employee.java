
public abstract class Employee {
	BonusCalculator bonusCalculator;
	void setB(int n){

		System.out.println("��⺹��������鹨ҡ���  "+n+" = "+(bonusCalculator.computeBonus(n)));
	}
}
