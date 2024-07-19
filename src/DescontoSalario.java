public class DescontoSalario {

    public static double descontoInss(double salario){
        double valorInss = 0;
        if(salario <= 1212.00){
            valorInss = salario * 0.075;
            return valorInss;
        } else if(salario >= 1212.01 && salario <= 2427.35){
            valorInss = salario * 0.09;
        } else if(salario >= 2427.36 && salario <= 3641.03){
            valorInss = salario * 0.12;
        } else if(salario > 3641.03){
            valorInss = salario * 0.14;
        };

        return valorInss;

    }

    public static double descontoIR(double salario) {
        double valorIR = 0;
        if (salario <= 1903.98) {
            valorIR = 0;
        } else if (salario >= 1903.99 && salario <= 2826.65) {
            valorIR = salario * 0.075;
        } else if (salario >= 2826.66 && salario <= 3751.05) {
            valorIR = salario * 0.15;
        } else if (salario >= 3751.06 && salario <= 4664.68) {
            valorIR = salario * 0.225;
        } else if (salario > 4664.68) {
            valorIR = salario * 0.275;
        }

        return valorIR;
    }
}


