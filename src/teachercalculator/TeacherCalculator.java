package teachercalculator;

import java.util.Scanner;

public class TeacherCalculator {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite seu nome: ");
		String name = input.next();
		
		System.out.print("Digite seu regime de pagamento seguindo a seguinte regra; CLT digite (C), Horista digite (H) e PJ digite (P): ");
		char regime = input.next().charAt(0);
		
		switch (regime) 
		{
			case 'C':
				System.out.print("Digite seu salário mensal: ");
				double salaryMonth = input.nextDouble();
				TeacherCLT teacherCLT = new TeacherCLT(name, salaryMonth);
				System.out.print(teacherCLT.toString());
				break;
			case 'H':
				System.out.print("Digite seu número de horas trabalhadas: ");
				double hoursWorked = input.nextDouble();
				
				System.out.print("Digite seu valor da hora trabalhada: ");
				double workHourValue = input.nextDouble();
				
				TeacherHorista teacherHorista = new TeacherHorista(name, hoursWorked, workHourValue);
				teacherHorista.salaryCalculator();
				System.out.print(teacherHorista.toString());
				break;
			case 'P':
				System.out.print("Digite o valor do seu contrato: ");
				double contract = input.nextDouble();
				TeacherCLT TeacherPJ = new TeacherCLT(name, contract);
				System.out.print(TeacherPJ.toString());
				break;
			default: System.out.print("Regime de pagamento invalido."); break;
		}
		
		input.close();
	}
}
