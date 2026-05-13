import static java.lang.IO.*;


void main() {
    IO.print("Digite seu Peso: ");
    float peso = Float.parseFloat(readln());

    IO.print("Digite sua Altura: ");
    float altura = Float.parseFloat(readln());

    float imc = peso / altura * 2f;
    IO.println("Resultado: " + imc);

    if (imc < 16){
        IO.print("Magreza Grave");
    } else if (imc < 17) {
        IO.print("Magreza Moderada");
    } else if (imc < 18.5) {
        IO.print("Magreza Leve");
    } else if (imc < 25) {
        IO.print("Saúdavel");
    } else if (imc < 30) {
        IO.print("Sobrepeso");
    } else if (imc < 35) {
        IO.print("Obesidade Grau I");
    } else if (imc < 40) {
        IO.print("Obesidade Grau II (severa)");
    } else {
        IO.print("Obesidade Grau III (mórbida)");

    }
}