import java.util.Scanner;

public class Ejercicio {
    public static void main(String[] args) {
       Scanner scanner = new Scanner (System.in);
       int intentos =0;
       boolean acceso= false;
       int contraseñacorrecta =1234;
        String frasesecreta = "la matrix vive";
        int edad =18;
        while (acceso<3) {
        System.out.println("ingresar edad");
        int edad = scanner.nextInt();
        scanner.nextLine;
        if (edad<edadrequerida");
         System.out.println("no tienes edad suficiente");
         intentos++;
         continue;
         System.out.println("ingrese  frase secreta");
         System.out.print("¿Cuál es la clave? ");
         String claveIngresada = scanner.nextLine();
         System.out.println("clave incorrecta")
        intentos++;
        continue;
         System.out.print(" frase secreta: ");
            String fraseIngresada = scanner.nextLine();
            if (!fraseIngresada.equals(frase)) {
                System.out.println("Frase incorrecta.");
                intentos++;
                continue;
                 acceso = true;
            break; // Si pasa todo, ya tiene acceso
        }

        if (acceso) {
            System.out.println("¡Bienvenido al club casi secreto!");
        } else {
            System.out.println("Lo siento, no puedes entrar.");
        }

        scanner.close();
    }




        


        
        }

    }
}
