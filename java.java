
import java.util.Scanner;
/**
 *
 * @author KAROLINA GR
 */
public class PTAP_AGUA {


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
           Sting numero2;
           do {
               System.out.println("\n por favor, dame el segundo numero);
               numero2= sc.nextline();
           }while (!numero2.matches("[+-]?[\\d]*[.]?[\\d]+"));
           double nume2 = Double.parseDouble(numero2);
           double n2 = new Double(numero2);
           //fin de verificacion datos 2
           do{
               comprobar = true;
               switch(operacion){
                   case "+":
                      res = n1 + n2;
                      break;
                   case "-":
                      res = n1 - n2;
                      break;
                   case "x":
                   case "X":
                     res = n1*n2;
                     break;
                    case "/":
                     while(n2 == 0){
                         do{
                             System.err.println("En el denominador se encuentra \n"
                             + "un cero, para evitar errores coloca otro numero.");
                             numero2 = sc.nextline();
                         }while(!numero2.matches("[+-]?[\\d]*[.]?[\\d]+"));
                         nume2 = Double.parseDouble(numero2);
                         n2 = new Double(numero2);
                         // division 
                     }
               }
           }
       }
    }
    
}
System.out.println("modificación Gomez_Rincon");
System.out.println("modificación Gomez");
