/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ptap_agua;
import java.util.Scanner;
/**
 *
 * @author KAROLINA GR
 */
public class PTAP_AGUA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        INICIO.main(args); 
      //  inializar el programa 
      LOGIN.main(args);
       Scanner sc = new Scanner(System.in);
       double res = 0;
       String operacion;
       boolean comprobar = false;
       //Datos
       do {
           String numero1;
           do{
               System.out.println("\n primer numero");
               numero1= sc.nextline();
           }while (!numero1.matches("[+-]?[\\d]*[.]?[\\d]+"));
           double nume1 = Double.parseDouble(numero1);
           double n1 = new Double(numero1);
           //verificacion de los primeros datos
           do{
               System.out.println("\n ¿que operacion desea hacer?(solo coloque un signo)");
               System.out.println("Teniendo en cuenta que: \n +=sumar \n -=restar \n" 
               + "x=multiplicar \n /=dividir \n *=eñevar primer numero al segundo numero."
               + "\n %=residuo");
               //explicacion de signos
               operacion = sc.nextline();
               if (operacion.equals("+") || operacion-equals ("-") || operacion.equals("x") ||
               operacion.equals("X") || operacion.equals("/") || operacion.equals("%") || 
               operacion.equals("*")){
                   comprobar =true;
               }else { comprobar = false;}
           }while (comprobar !=true);
           // digitos numero 2 ingresados
       }
    }
    
}
