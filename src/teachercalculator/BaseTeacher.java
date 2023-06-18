package teachercalculator;

public class BaseTeacher {
	private String name;
	private double salary = 0;
	
	public BaseTeacher(String name)
	{
		this.name = name;
	}
	
	public void setSalary(double salary)
	{
		this.salary = salary;
	}

	@Override
	public String toString()
	{
		return String.format("%s%s%nR$%.2f",
				name, ", seu valor a receber é de:", salary);
	}
}
