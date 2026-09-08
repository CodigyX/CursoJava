public class HolaMundo {
        public static void main(String[] args) {
                System.out.println("Hola mundo");
// Uso
Persona persona1 = new Persona ("Ana", 25);
persona1.saludar(); // "Hola, soy Ana"
        }

/** lenght() -  substring() - equals()
 * String nombre = "Java"; // Forma literal (Recomendada)
 * String lenguaje = new String("Python"); // Usando constructor
 * System.out.println(nombre.lenght());  // 4
 */

/** Arrays (Arreglos) son del mismo tipo
 * int[] numeros = {10, 20, 30}; // Forma simplicada
 * String[] palabras = new String[3]; // Forma con tamaño definido
 * palabras [0] = "Hola";
 * System.ou.println(numeros[1]); //20
 */

//TIPOS DE OPERADORES
/** Operadores aritméticos
 * int suma = 5 + 3;  //8
 * int resto = 10 % 3; // 1 (módulo)
 * double división = 10.0 / 3; // 3.333...
 */

/** Operadores de comparación (igualdad == | desigualdad != | mayor que > | menor que < | mayor o igual que >= | menor o igual que <= )
 * Booleano siempre devuelve true o false
 * boolean esIgual = (5 == 5);      // true
 * boolean esMayor = (10 > 20);     // false
 * boolean esDiferente = (7 != 3);  // true
 */

/** Operadores lógicos [Conjunción (AND) &&], [Disyunción (OR) ||], [Negación (NOT) !]
 * boolean andLogico = (true && false); //false
 * boolean orLogico = (true || false);  //true
 * boolean notLogico = !true;           //false
 */

/** Operadores de asignación [Asignación básica =], [Asignación y suma +=], [Asignación y resta -=], [Asignación y multiplicación *=], [Asignación y división /=]
 * int x = 10;             // Asignación básica
 * x += 5;                 // Equivale a x = x + 5 (x = 15)
 * String nombre = "Ana";  // Asignación a String
 */

/** Operadores de incremento/decremento [Incremental ++], [Decremental ++]
 * int contador = 0;
 * contador++;          // Incrementa a 1 (post-incremento)
 * int y = --contador;  // Incrementa a 0 (pre-decremento)
 */

/** Operadores ternarios (permiten realizar operaciones condicionales en una sola línea) [| Condicional ? : |]
 * int edad 18;
 * String mensaje = (edad >= 18) ? "Mayor" : "Menor"; // "Mayor"
 *
 */
}
