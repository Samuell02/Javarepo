public class Triangulo  extends FormaGeometrica{

    double base;
    double area;
 double altura;
    double perimetro;
    public void CalcularArea(){
        System.out.println("A area do triangulo é");
        area = (base*altura)/2;
        System.out.println(area);


    }
    public void CalcularPerimetro(){
        System.out.println("O perimetro do triangulo é");
        perimetro = (altura*2)+base;
        System.out.println(perimetro);
    }


}
