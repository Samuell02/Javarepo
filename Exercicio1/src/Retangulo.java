public class Retangulo extends  FormaGeometrica{
    double altura;
    double area;
   double perimetro;
    double base;
    public void CalcularArea(){
        System.out.println("A area do Retangulo é");
        area = altura*base;
        System.out.println(area);


    }
    public void CalcularPerimetro(){
        System.out.println("O perimetro do Retangulo é");
        perimetro = 2*(area+base);
        System.out.println(perimetro);
    }

}
