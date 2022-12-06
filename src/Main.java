//Primera parte:
//Crear una función con tres parámetros que sean números que se suman entre sí.
//Llamar a la función en el main y darle valores.
public class Main {
    public static void main(String[] args) {
        float Resultado;
        Resultado = suma(10F, 2.333F, 30F);
        System.out.println(Resultado);
        coche micoche = new coche();
        micoche.IncrementarPuertas();
        System.out.println(micoche.puertas);
    }
    private static float suma (float a, float b, float c){
        return a + b + c;
    }
}
//Segunda parte:
//Crear una clase coche.
//Dentro de la clase coche, una variable numérica que almacene el número de puertas que tiene.
//Una función que incremente el número de puertas que tiene el coche.
//Crear un objeto miCoche en el main y añadirle una puerta.
//Mostrar el número de puertas que tiene el objeto.
class coche {
    public int puertas = 0;

    public void IncrementarPuertas() {
        this.puertas ++;
    }
}