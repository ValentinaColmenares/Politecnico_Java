package Semana_01;

// Tema 3: Operadores

public class _03Operadores {
    public static void main(String[] args) {

        //Asignación

        int numero1 = 8;
        int numero2 = numero1;
        System.out.println("La variable numero 1 vale: "+numero1);
        System.out.println("La variable numero 2 vale: "+numero2);

        //Operadores aritméticos (-, +, -, *, /, %)

        //El resultado es de tipo long si, al menos, uno de los operandos
        //es de tipo long y ninguno es real (float o double).
        long numero3 = 8;
        int numero4 = 13;
        long resta = numero3-numero4;
        System.out.println("El resultado es "+resta);

        //El resultado es de tipo int si ninguno de los operandos es de
        //tipo long y tampoco es real (float o double).
        int numero5 = 3;
        int numero6 = 52;
        int suma = numero5+numero6;
        System.out.println("El resultado es "+suma);

        //El resultado es de tipo double si, al menos, uno de los operandos
        //es de tipo double.
        double numero7 = 7.6;
        int numero8 = 4;
        double multiplicacion = numero7*numero8;
        System.out.println("El resultado es "+multiplicacion);

        //El resultado es de tipo float si, al menos, uno de los operandos
        //es de tipo float y ninguno es double.
        float numero9 = 2.3F;
        int numero10 = 5;
        float division = numero9/numero10;
        System.out.println("El resultado es "+division);

        //ArithmeticException
        //double division1 = 15/0;
        //System.out.println("El resultado es "+division1);

        //Overflow y Underflow
        //int numero11 = 248154379456;
        //double numero12 = 2e308;
        //System.out.println("El numero11 es "+numero11);
        //System.out.println("El numero12 es "+numero12);

        //Expresión inválida
        double modulo = 2.0%0;
        System.out.println("El resultado es "+modulo);

        // Operadores aritméticos incrementales

        // ++A Incrementa el valor y luego se utiliza la variable
        // A++ Utiliza la variable y luego incrementa el valor
        // --A Decrementa el valor y luego se utiliza la variable
        // A-- Utiliza la variable y luego decrementa el valor

        int a = 5;
        int b = ++a;
        System.out.println(a);
        System.out.println(b);

        int c = 5;
        int d = c++;
        System.out.println(c);
        System.out.println(d);

        int e = 5;
        int f = --e;
        System.out.println(e);
        System.out.println(f);

        int g = 5;
        int h = g--;
        System.out.println(g);
        System.out.println(h);

        // Operadores aritméticos combinados

        // Suma combinada +=
        int i = 5;
        int j = 2;
        j += i;
        System.out.println(j);

        // Resta combinada -=
        int k = 5;
        int l = 2;
        l -= k;
        System.out.println(l);

        // Multiplicación combinada *=
        int m = 5;
        int n = 2;
        n *= m;
        System.out.println(n);

        // División combinada /=
        int o = 5;
        double p = 2.0;
        p /= o;
        System.out.println(p);

        // Módulo combinado /=
        int q = 5;
        int r = 2;
        r %= q;
        System.out.println(r);

        // Operadores de relación
        boolean igualQue = 5 == 4;
        System.out.println(igualQue);
        boolean distintoQue = 4 != 2;
        System.out.println(distintoQue);
        boolean menorQue = 5 < 3;
        System.out.println(menorQue);
        boolean mayorQue = 5 > -5;
        System.out.println (mayorQue);
        boolean menorIgualQue = 2 <= 3;
        System.out.println(menorIgualQue);
        boolean mayorIgualQue = 3 >= 9;
        System.out.println(mayorIgualQue);

        // Operadores lógicos
        boolean negacion = !false;
        System.out.println(negacion);
        boolean sumalogica = true | false;
        System.out.println(sumalogica);
        boolean sumaLogicaExclusiva = (5 == 5) ^ (5 < 4);
        System.out.println(sumaLogicaExclusiva);
        boolean productoLogico = (5 == 5) & (5 < 4) ;
        System.out.println(productoLogico);
        boolean sumaLogicaCortocircuito = true || false;
        System.out.println (sumaLogicaCortocircuito);
        boolean productoLogicoCortocircuito = (5 == 5) && (5 < 4);
        System.out.println(productoLogicoCortocircuito);

        // Operador condicional
        int s = 4;
        int t = s == 4 ? s + 5 : 6 - s;
        System.out.println(t);
        t = s > 4 ? s * 7: s + 8;
        System.out.println(t);

        // Operador de concatenación de cadenas
        String saludo = "Hola" + "Juan";
        System.out.println(saludo);

        // Operadores de separación () {} [] ; , .
        int suma1 = (5+9)*2;
        int arreglo[] = {2, 9};
        int u,v,w;
        double euler = Math.E;

        // Prioridad entre operadores
        // Ver tabla Prioridad_Operadores en carpeta de imágenes

    }
}
