
package Aula2;

public class Carro {
    
    String marca;
    String modelo;
    int numPassageiros;
    double capCombustivel;
    double consumoCombustivel;
    
    void exibirAutonomia(){
        System.out.println("A autonomia do carro is:" + capCombustivel * consumoCombustivel + " km");
   
    }
}
