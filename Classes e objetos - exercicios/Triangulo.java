//Crie uma classe Triangulo com os atributos lado1, lado2 e lado3.
//Adicione um método para verificar se o triângulo é equilátero,
//isósceles ou escaleno. Crie instâncias da classe Triângulo e
//imprima sua classificação.

public class Triangulo {
    //atributos
    private double lado1;
    private double lado2;
    private double lado3;

    public Triangulo(double lado1, double lado2, double lado3){
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }
    public void eh_equilatero(){
        if(lado1==lado2 && lado1==lado3){
            System.out.println("é equilatero");
        }
    }
    public void eh_isosceles(){
        if((lado1==lado2)||(lado2==lado3)||(lado1==lado3)){
            System.out.println("é isosceles");
        }
    }
    public void eh_escaleno(){
        if((lado1!=lado2)&&(lado2!=lado3)&&(lado1!=lado3)){
            System.out.println("é escaleno");
        }
    }

    public static void main(String[] args) {
        Triangulo triangulo = new Triangulo(2,5,3);

        //verificar classificao
        triangulo.eh_equilatero();
        triangulo.eh_escaleno();
        triangulo.eh_isosceles();
    }
}