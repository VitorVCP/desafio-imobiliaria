
import java.util.Scanner;

//Uma empresa de imobiliária vende terrenos de formato retângular e triângular, deve descrever seu formato, sua área e seu valor.
public class imobiliaria {
public static void main(String[] args) {
    double numero, compR, largR, valor = 98.56, valorq, frente, fundo, lateral, area, base, altura, semi, valort;
    System.out.println("Qual será o formato do terreno, retângular ou triângular? \ndigite:\n(1): retângulo.\n(2): triângulo.\n");
    Scanner scanner = new Scanner(System.in);
     numero = scanner.nextDouble();

switch ((int)numero) {
    case 1 -> {
        System.out.println("Insira o valor do comprimento, em metros:\nComprimento: ");
        compR = scanner.nextDouble();
        System.out.println("\nInsira o valor da largura:\nLargura: ");
        largR = scanner.nextDouble();
        System.out.println("A área total do terreno será: " + (compR * largR) + " metros.\n");
        double a = valor * compR * largR;
        valorq = Math.round(a * 100.0) / 100.0;
        System.out.println("E seu valor será de: " + valorq + " reais");
        }
        

case 2 -> {
    System.out.println("Insira o diâmetro da frente, em metros:\nfrente: ");
    frente = scanner.nextDouble();
    System.out.println("\nInsira o diâmetro do fundo:\nfundo: ");
    fundo = scanner.nextDouble();
    System.out.println("\nInsira o diâmetro da lateral:\nlateral: ");
    lateral = scanner.nextDouble();
    
    if (frente == fundo && fundo == lateral) {
        area = (frente * frente * 1.732) / 4;
        System.out.println("\nSeu triângulo é equilátero.");
    } else if (frente == fundo || frente == lateral || fundo == lateral) {
        System.out.println("\n Seu triângulo é isósceles. \n");
        
        if (frente == fundo) {
            base = lateral;
            altura = Math.sqrt(frente * frente - (base / 2) * (base / 2));
            
        } else if (frente == lateral) {
            base = fundo;
            altura = Math.sqrt(frente * frente - (base / 2) * (base / 2));
            
        } else {
            base = frente;
            altura = Math.sqrt(fundo * fundo - (base / 2) * (base / 2));
        }
        area = (base * altura) / 2;
    } else {
        System.out.println("\nSeu triângulo é escaleno.");
        semi = (frente + fundo + lateral) / 2;
        area = Math.sqrt(semi * (semi - frente) * (semi - fundo) * (semi - lateral));
    }
    System.out.println("A área do triângulo é: " + area + " metros.");
    double b = area * valor;
    valort = Math.round(b * 100.0) / 100.0;
    System.out.println("E seu valor será de: " + valort + " R$.");
        }

}
}
}
