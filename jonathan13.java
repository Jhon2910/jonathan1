import java.util.Scanner;
    class jonathan13 {
        public static void main(String[] args) {
            Scanner teclado = new Scanner(System.in);
            System.out.print("Ano : ");
            
            int Ano = teclado.nextInt();
            int CopasRealizadas = ((Ano - 1930)/4)+1;
            
            System.out.printf("O total de copas do mundo realizadas neste periodo e de : %d",CopasRealizadas);
            teclado.close(); //ainda nao acabei
        }
    }
