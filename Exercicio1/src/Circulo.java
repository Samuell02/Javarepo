public class Circulo extends FormaGeometrica {
 double raio;
 double area;

 double perimetro;
     public void CalcularArea(){
         System.out.println("A area do circulo é");
         area = Math.PI*Math.pow(raio,2);
         System.out.println(area);


     }
     public void CalcularPerimetro(){
         System.out.println("O perimetro do Circulo é");
         perimetro = 2*Math.PI*raio;
         System.out.println(perimetro);
     }


}
