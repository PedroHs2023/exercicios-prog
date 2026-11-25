public class CarsAssemble {

    private static final double NUMERO_PRODUZIDO_POR_HORA =  221;
    
    public double calcularTaxaProducao(int speed, double taxaSucesso){
        return (speed * NUMERO_PRODUZIDO_POR_HORA * taxaSucesso);
    }

    public double productionRatePerHour(int speed) {
        
        double taxaSucesso;

        if(speed >= 1  && speed <= 4){
            taxaSucesso = 1.00;
        }else if(speed >= 5 && speed <= 8){
            taxaSucesso = 0.90;
        }else if(speed == 9){
            taxaSucesso = 0.80;
        }else if(speed == 10){
            taxaSucesso = 0.77;
        }else if(speed == 0){
            taxaSucesso = 0.00;
        }else return 0.0;

        return calcularTaxaProducao(speed,taxaSucesso);
    }

    public int workingItemsPerMinute(int speed) {
        return (int) (productionRatePerHour(speed) / 60.0);
    }
}
