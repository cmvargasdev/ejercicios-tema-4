public class Main {
    public static void main(String[] args) {
        int numeroIf = -2;


        if(numeroIf>0){
            System.out.println("El Numero " + numeroIf + " es Positivo");
        }else if(numeroIf==0){
            System.out.println("El Numero " + numeroIf + " es 0");
        }else{
            System.out.println("El Numero " + numeroIf + " es Negativo");
        }

        int numeroWhile = 0;
        while (numeroWhile<3){
            System.out.println("(While) numeroWhile es igual a " + numeroWhile);
            numeroWhile++;
        }
        do{
            System.out.println("(Do While) numeroWhile es igual a " + numeroWhile);
            numeroWhile++;
        }while (numeroWhile>20);

        for(int numeroFor = 0;numeroFor<=3;numeroFor++){
            System.out.println("numeroFor es igual a " + numeroFor);
        }

        String estacion = "Otoño";
        switch (estacion)
        {
            case "Primavera":  System.out.println("La estación actual es Primavera");
                break;
            case "Verano":  System.out.println("La estación actual es Verano");
                break;
            case "Otoño":  System.out.println("La estación actual es Otoño");
                break;
            case "Invierno":  System.out.println("La estación actual es Invierno");
                break;
            default: System.out.println("'" + estacion + "' No es una estación valida");
                break;
        }

    }
}