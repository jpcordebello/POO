public class ExemploVetor {
    public static void main(String[] args) {

        String[] times = new String[4];

        times[0] = "Flamengo";
        times[1] = "Fluminense";
        times[2] = "Botafogo";
        times[3] = "Vasco";

        //for (int i = 0; i < times.length; i++) {
        //   System.out.println(times[i]);

            
        for (String time : times) {
            System.out.println(time);
            
        }
        
        
        
    }

}