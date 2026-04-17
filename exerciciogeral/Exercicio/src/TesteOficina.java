import java.time.LocalDate;
import java.time.DayOfWeek;
import java.time.Month;

public class TesteOficina {

    public static void main(String[] args) {

        Proprietario proprietario1 = new Proprietario("Joao");
        Proprietario proprietario2 = new Proprietario("Maria");

        Carro carro1 = new Carro("Prisma", 0, LocalDate.of(2026,4,11), proprietario1, "Sedan");
        Moto moto1 = new Moto("CG160", 0, LocalDate.of(2026,8,15), proprietario2, 160);

        carro1.trocarOleo();
        carro1.revisao();

        moto1.lavarVeiculo();
        moto1.trocarOleo();

        System.out.println("===== CARRO =====");
        System.out.println(carro1);
        System.out.println("Dia da semana: " + carro1.dataConserto.getDayOfWeek());
        System.out.println("Mes: " + carro1.dataConserto.getMonth());

        if(carro1.dataConserto.getDayOfWeek() == DayOfWeek.SATURDAY){
            System.out.println("Desconto realizado por causa da data (Sabado)");
        }

        if(carro1.dataConserto.getMonth() == Month.AUGUST){
            System.out.println("Desconto realizado por causa do mes (Agosto)");
        }

        System.out.println("Valor total: " + carro1.getValorCobrado());

        System.out.println();

        System.out.println("===== MOTO =====");
        System.out.println(moto1);
        System.out.println("Dia da semana: " + moto1.dataConserto.getDayOfWeek());
        System.out.println("Mes: " + moto1.dataConserto.getMonth());

        if(moto1.dataConserto.getDayOfWeek() == DayOfWeek.SATURDAY){
            System.out.println("Desconto realizado por causa da data (Sabado)");
        }

        if(moto1.dataConserto.getMonth() == Month.AUGUST){
            System.out.println("Desconto realizado por causa do mes (Agosto)");
        }

        System.out.println("Valor total: " + moto1.getValorCobrado());
    }
}