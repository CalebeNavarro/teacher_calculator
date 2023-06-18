package teachercalculator;

public class TeacherHorista extends BaseTeacher {
	private double hoursWorked;
	private double workHourValue;

	public TeacherHorista(String name, double hoursWorked, double workHourValue)
	{
		super(name);
		
		if (hoursWorked <= 0)
			throw new IllegalArgumentException(
					"Horário de trabalho deve ser > 0");
		
		if (workHourValue <= 0)
			throw new IllegalArgumentException(
					"Valor da hora trabalhar deve ser > 0");
		
		this.workHourValue = workHourValue;
		this.hoursWorked = hoursWorked;
	}
	
	public void salaryCalculator()
	{
		double salary = this.hoursWorked * this.workHourValue;
		this.setSalary(salary);
	}
}
