
/**
 * Nuestro matemático es una persona bastante inteligente
 * por lo que es capaz de realizar 
 * muchos  cálculos el solo, sin la ayuda de una calculadora ni nadie mas.
 * @José Roberto Vargas Orellana
 * 
 * 
 * Las operaciones que nuestro matemático sabe realizar son: 
• Dados tres números: El matemático sabe indicar cual es el numero mayor,
cual el menor y cual del medio. 
• Dados la base y altura de un cuadrado: El sabe indicar el área de dicha 
figura. • Dados las coordenadas de dos puntos: Sabe calcular distancia 
entre estos puntos. • Dado las coordenadas de un punto: Es capaz de indicar
en que cuadrante se encuentra dicho punto. 
Tu labor es implementar una clase que nos permite representar 
al matemático. Debes identificar los métodos necesarios e implementarlos. 

 */
public class Matematico
{
    public String DeterminarElMayorMenorEIgual(double n1,double n2,double n3){

        if((n1>n2) && (n1>n3)){

            if((n3<n2)){
                return "El mayor es el primer numero"+n1+"El numero medio es "+n2+" y el menor"+n3;
            }
            if(n2<n3){
                return "El mayor es el primer numero"+n1+"El numero medio es "+n3+" y el menor"+n2;
            }
        }
        else if((n2>n1) && (n2>n3)){

            if((n1>n3)){
                return "El mayor es el segundo numero"+n2+"El numero medio es "+n1+" y el menor"+n3;
            }if((n1<n3)){
                return "El mayor es el segundo numero"+n2+"El numero medio es "+n3+" y el menor"+n1;
            }
        } 
        else if((n3>n1) && (n3>n2)){
            if((n1>n2)){
                return  "El mayor es el tercer numero :"+n3+" ,El numero medio es :"+n1+" ,y el menor :"+n2;
            }if((n1<n2)){
                return "El mayor es el tercer numero :"+n3+" El numero medio es "+n2+" y el menor"+n1;
            }
        }else{
        return "Error al ingresar datos";
        }
         return "fin del metodo determinar orden de 3 numeros"  ;
    }

    public String DeterminarAreaCuadrados(double base, double altura){
        double area = base *altura;
        return "el area del cuadrado-rectangulo es : "+area;
    }

    public String DistanciaPuntos(Punto punto1,Punto punto2){
        double distancia= Math.sqrt(Math.pow(punto1.getAbscisas()-punto2.getAbscisas(),2)+Math.pow(punto1.getOrdenadas()-punto2.getOrdenadas(),2));
        return "La distancia entre los puntos es :" +distancia;
    }

    public String determinarcuadrante(Punto puntocuadrante){
        if ((puntocuadrante.getAbscisas()>0)&&(puntocuadrante.getOrdenadas()>0)){
            return "el punto esta en el primer cuadrante" ;
        }else if((puntocuadrante.getAbscisas()<0)&&(puntocuadrante.getOrdenadas()>0)){
            return "el punto esta en el segundo cuadrante" ;
        }else if((puntocuadrante.getAbscisas()<0)&&(puntocuadrante.getOrdenadas()<0)){
            return "el punto esta en el tercer cuadrante" ;
        }else if((puntocuadrante.getAbscisas()>0)&&(puntocuadrante.getOrdenadas()<0)){
            return "el punto esta en el cuarto cuadrante" ;
        }else if((puntocuadrante.getAbscisas()==0)){
            return "el punto se encuentra en el plano nulo o en la linea de las Abscisas" ;
        }else if((puntocuadrante.getOrdenadas()==0)){
            return "el punto se encuentra en el plano nulo  o en la linea de las Ordenadas" ;
        }else{
            return "Error al ingresar los datos";
        }

    }

}
