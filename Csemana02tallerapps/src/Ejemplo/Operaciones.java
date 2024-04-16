
package Ejemplo;


public class Operaciones {
    public float suma (float num1, float num2){
    float suma;
    suma = num1+num2;
    return suma;
    }
    
    public float resta (float num1, float num2){
    float resta;
    resta = num1 - num2;
    return resta;
    }
    
    public float multiplicacion (float num1, float num2){
    float mult;
    mult = num1*num2;
    return mult;
    }
    
    public float division (float num1, float num2){
    float division;
    division = (num1)/(num2);
    return division;
    }
    public float raizcuadrada(float num1, float num2){
    float raiz;
    raiz=(float) Math.sqrt(num1);
    return raiz;  
    }
    
    public float funcionseno(float num1){
    float funcionseno;
    funcionseno=(float) Math.sin(num1);
    return funcionseno;  
    }
    public float funcioncoseno(float num1){
    float funcioncoseno;
    funcioncoseno=(float) Math.cos(num1);
    return funcioncoseno;  
    }
    public float potencia(float num1, float num2) {
    float pot = 1;
    for (int i = 0; i < num2; i++) {
        pot *= num1;
    }
    return pot;
}
    public float raizcubica(float num1){
    float raizcubica;
    raizcubica=(float) Math.cbrt(num1);
    return raizcubica;  
    }
    public float mayor(float num1 , float num2){
        if(num1>num2){
            return num1;
        }else{
        return num2;}
    }
    
}
