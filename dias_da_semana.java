import static java.lang.IO.*;

void main() {
    //entradas
    IO.print("Digite um Número: ");
    float numero = Float.parseFloat(readln());

    //processamentos

    if (numero == 1){
        IO.print("Domingo");
    } else if (numero == 2) {
        IO.print("Segunda");
    } else if (numero == 3) {
        IO.print("Terça");
    } else if (numero == 4) {
        IO.print("Quarta");
    } else if (numero == 5) {
        IO.print("Quinta");
    } else if (numero == 6) {
        IO.print("Sexta");
    } else if (numero == 7) {
        IO.print("Sábado");
    } else {
        IO.print("Opção Invalida");
    }
}