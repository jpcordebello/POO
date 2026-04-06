public class exemploDiaSemana {
    public static void main(String[] args) {
        String dia = "Domingo";

        String resultado = switch (dia){
              case "Segunda" -> "dia de semana";
              case "Terça"-> "dia de semana";  
              case "Quarta"-> "dia de semana";  
              case "Quinta"-> "dia de semana";  
              case "Sexta"-> "dia de semana";  
              case "Sábado"-> "fim de semana";  
              case "Domingo"-> "fim de semana";  
            default -> "Dia inválido";

        };
        System.out.println(resultado);
    }
}
