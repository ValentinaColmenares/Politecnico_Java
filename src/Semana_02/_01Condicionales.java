package Semana_02;

// Tema 1: Estructuras Condicionales

public class _01Condicionales {
    public static void main(String[] args) {

        //if - condición
        if (true) {
            //contenedor de valor en cumplimiento
        }

        if (9 < 12) {
            System.out.println("9 sí es menor a 12");
        }

        if (4 > 2)
            System.out.println("4 sí es mayor a 2");

        if (9 < 12 && 2 <= 4) {
            System.out.println("9 sí es menor a 12");
            System.out.println("2 sí es menor a 4");
        }

        //Se inicializan ambas variables
        boolean p = false;
        boolean q = false;

        //Primera condición donde P y Q tienen que ser true
        //para cumplir el if correctamente.
        if (p && q) {
            //Ejecución en caso de que P y Q sean verdaderas
            System.out.println("P y Q tienen un valor true");
        }
        //Segunda condición donde P o Q tienen que ser true
        //para cumplir el if correctamente.
        if (p || q)
        {
            //Ejecución en caso de que P o Q sean true
            System.out.println("P o Q tienen un valor true");
        }
        //Tercera condición donde P al ser true y agregar el operador
        //"!" niega el true y lo convierte a false (Sólo en ejecución
        //de la condición, la variable P sigue siendo true)
        if(!p)
        {
            //Ejecución en caso de que P sea true
            System.out.println("P tiene un valor true");
        }

        //Condicional
        if(false)
        {
            //Ejecución si es true
            System.out.println("True");
        }
        else
        {
            //Ejecución si es false
            System.out.println("False");
        }

        String respuesta1 = "Si";
        String respuesta2 = "Si";
        System.out.println("- ¿Quieres un café?");
        System.out.println("* " + respuesta1);
        if(respuesta1 == "Si") {
            System.out.println("- ¿Vas a comprarlo?");
            if (respuesta2 == "Si") {
                System.out.println("* " + respuesta2);
                System.out.println("- Comprar café");
            } else {
                System.out.println("* " + respuesta2);
                System.out.println("- Hacer el café");
            }
            System.out.println("- Beber");
        }
        else
        {
            System.out.println("- Sigue estudiando");
        }

        // equals

        String nombre = "Alejo";
        if(nombre.equals("Alejo"))
        {
            System.out.println("True");
        }

        //equals: evalúa la comparación de valores en los objetos
        // == comprueba si ambos objetos apuntan a la misma unicación de memoria

        String x = new String("Saludo");
        String y = new String("Saludo");

        System.out.println(x == y);
        System.out.println(x.equals(y));

        if(x == y)
        {
            System.out.println("true");
        }
        else
        {
            System.out.println("false");
        }

        if(x.equals(y))
        {
            System.out.println("true");
        }
        else
        {
            System.out.println("false");
        }

        // else if

        if(false)//Primera condición
        {

        }else if(true)//Segunda condición
        {

        }else//Tercera condición implícita
        {

        }

        int velocidad = 101;
        if (velocidad >= 0 && velocidad <= 30) {
            System.out.println("Zonas escolares");
        }else if(velocidad > 30 && velocidad <= 60){
            System.out.println("Vías urbanas");
        }else if(velocidad > 60 && velocidad <= 80){
            System.out.println("Vías rurales");
        }else if(velocidad > 80 && velocidad <= 100){
            System.out.println("Rutas nacionales");
        }else{
            System.out.println("Estás infringiendo los límites de velocidad");
        }

        //Switch case

        int num = 2;

        switch (num) {
            case 1:
                System.out.println("Número 1");
                break;
            case 2:
                System.out.println("Número 2");
                break;
            case 3:
                System.out.println("Número 3");
                break;
            default: //es opcional
                System.out.println("Error");
        }

        //sin break el Switch continúa al siguiente case
        int diaNum = 4;
        String diaLab;
        switch (diaNum){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                diaLab = "dia laborable";
                break;
            case 6:
            case 7:
                diaLab = "fin de semana";
                break;
            default:
                diaLab = "Tipo de dia invalido";
        }
        System.out.println(diaNum + " es un " + diaLab);

        //break: detiene un ciclo
        //continue: detiene la iteración actual y salta a la siguiente

        for (int i = 0; i < 10; i++){
            System.out.println("Dentro del ciclo");
            break;
        }
        System.out.println("Fuera del ciclo");

        for (int i = 0; i < 5; i++){
            if(i == 3){
                continue;
            }
            System.out.println("Dentro del ciclo " + i);
        }

        //switch anidado

        int promedio = 4;
        int parcial = 4;
        switch (promedio){
            case 1:
            case 2:
            case 3:
                System.out.println("Perdiste la materia");
                break;
            case 4:
            case 5:
                System.out.println("Ganaste la materia");
                switch (parcial){
                    case 1:
                    case 2:
                    case 3:
                        System.out.println("Pero perdiste el parcial");
                        break;
                    case 4:
                    case 5:
                        System.out.println("Y también el parcial");
                        break;
                }
                break;
            default:
                System.out.println("Error");
        }

        //Switch case con String, usar con datos que ya estén en forma de cadena

        String nombre1 = "Ana";
        switch (nombre1){
            case "Diego":
                System.out.println("Hola Diego, lindo día");
                break;
            case "Juan":
                System.out.println("Juan, ¿cómo estás?");
                break;
            case "Stiven":
                System.out.println("Stiven, buena barba");
                break;
            case "Ana":
                System.out.println("Lindo cabello Ana");
                break;
            case "Susana":
                System.out.println("Susana ¿y la familia?");
                break;
            default:
                System.out.println("Error");
        }

    }
}
