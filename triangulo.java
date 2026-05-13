import static java.lang.IO.*;

void main() {
    // Entrada de dados
    print("Informe o valor do primeiro lado: ");
    float l1 = Float.parseFloat(readln());

    print("Informe o valor do segundo lado: ");
    float l2 = Float.parseFloat(readln());

    print("Informe o valor do terceiro lado: ");
    float l3 = Float.parseFloat(readln());

    // Processamento e Saída
    if (l1 == l2 && l2 == l3) {
        println("Triângulo Equilátero!");
    }
    else if (l1 == l2 || l1 == l3 || l2 == l3) {
        println("Triângulo Isósceles!");
    }
    else {
        println("Triângulo Escaleno!");
    }
}