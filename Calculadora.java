public class Calculadora{

    //variaveis
    int a;
    int b;

    //metodo de soma
    final public int somar(int a, int b){
        return a + b;
    }
}

class CalculadoraCientifica extends Calculadora{
    
    //inutil pois o metodo eh final
    //@Override
    //public int somar(int a, int b){
    //return a - b;
  //}
}