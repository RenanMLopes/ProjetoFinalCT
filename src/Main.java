public class Main {
    public static void main(String[] args) {
        double sal1 = 1212.00;
        double sal2 = 2234.32;
        double sal3 = 3453.24;
        double sal4 = 5203.29;
        double sal5 = 7087.22;
        double ir1 = DescontoSalario.descontoIR(sal1);
        double ir2 = DescontoSalario.descontoIR(sal2);
        double ir3 = DescontoSalario.descontoIR(sal3);
        double ir4 = DescontoSalario.descontoIR(sal4);
        double ir5 = DescontoSalario.descontoIR(sal5);
        double inss1 = DescontoSalario.descontoInss(sal1);
        double inss2 = DescontoSalario.descontoInss(sal2);
        double inss3 = DescontoSalario.descontoInss(sal3);
        double inss4 = DescontoSalario.descontoInss(sal4);
        double inss5 = DescontoSalario.descontoInss(sal5);
        double salarioLiquido1 = sal1 - inss1 - ir1;
        double salarioLiquido2 = sal2 - inss2 - ir2;
        double salarioLiquido3 = sal3 - inss3 - ir3;
        double salarioLiquido4 = sal4 - inss4 - ir4;
        double salarioLiquido5 = sal5 - inss5 - ir5;


        System.out.println("Funcionário 1");
        System.out.println("Salario Bruto: R$" + sal1);
        System.out.printf("O funcionário pagou ao INSS o valor de: R$%.2f \n", DescontoSalario.descontoInss(sal1));
        System.out.printf("O funcionário pagou de Imposto de Renda o valor de: R$%.2f \n", DescontoSalario.descontoIR(sal1));
        System.out.printf("Salario liquido do funcionário: R$%.2f \n", salarioLiquido1);
        System.out.println("");
        System.out.println("Funcionário 2");
        System.out.println("Salario Bruto: R$" + sal2);
        System.out.printf("O funcionário pagou ao INSS o valor de: R$%.2f \n", DescontoSalario.descontoInss(sal2));
        System.out.printf("O funcionário pagou de Imposto de Renda o valor de: R$%.2f \n", DescontoSalario.descontoIR(sal2));
        System.out.printf("Salario liquido do funcionário: R$%.2f \n", salarioLiquido2);
        System.out.println("");
        System.out.println("Funcionário 3");
        System.out.println("Salario Bruto: R$" + sal3);
        System.out.printf("O funcionário pagou ao INSS o valor de: R$%.2f \n", DescontoSalario.descontoInss(sal3));
        System.out.printf("O funcionário pagou de Imposto de Renda o valor de: R$%.2f \n", DescontoSalario.descontoIR(sal3));
        System.out.printf("Salario liquido do funcionário: R$%.2f \n", salarioLiquido3);
        System.out.println("");
        System.out.println("Funcionário 4");
        System.out.println("Salario Bruto: R$" + sal4);
        System.out.printf("O funcionário pagou ao INSS o valor de: R$%.2f \n", DescontoSalario.descontoInss(sal4));
        System.out.printf("O funcionário pagou de Imposto de Renda o valor de: R$%.2f \n", DescontoSalario.descontoIR(sal4));
        System.out.printf("Salario liquido do funcionário: R$%.2f \n", salarioLiquido4);
        System.out.println("");
        System.out.println("Funcionário 5");
        System.out.println("Salario Bruto: R$" + sal5);
        System.out.printf("O funcionário pagou ao INSS o valor de: R$%.2f \n", DescontoSalario.descontoInss(sal5));
        System.out.printf("O funcionário pagou de Imposto de Renda o valor de: R$%.2f \n", DescontoSalario.descontoIR(sal5));
        System.out.printf("Salario liquido do funcionário: R$%.2f \n", salarioLiquido5);

    }
}