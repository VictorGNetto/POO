package aula4.encapsulamento2;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int h, m, s;
        Hora h1, h2;

        System.out.println("Entre com dois horários no formato hh mm ss");

        h = input.nextInt();
        m = input.nextInt();
        s = input.nextInt();
        h1 = new Hora(h, m, s);

        h = input.nextInt();
        m = input.nextInt();
        s = input.nextInt();
        h2 = new Hora(h, m, s);
        
        System.out.println("Os horários são:");
        System.out.println(h1.GetHorario());
        System.out.println(h2.GetHorario());
        System.out.printf("Esses horários diferem em %d minuto(s)\n", Hora.DiferencaMinutos(h1, h2));

        input.close();
    }
}