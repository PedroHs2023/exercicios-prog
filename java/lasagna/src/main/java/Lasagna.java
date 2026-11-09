

public class Lasagna {
    // TODO: define the 'expectedMinutesInOven()' method
    public int expectedMinutesInOven(){
        return 40;
    }
    // TODO: define the 'remainingMinutesInOven()' method
    public int remainingMinutesInOven(int minutosNoForno){
        return expectedMinutesInOven() - minutosNoForno;
    }
    // TODO: define the 'preparationTimeInMinutes()' method
    public int preparationTimeInMinutes(int camadas){
        return camadas * 2;
    }
    // TODO: define the 'totalTimeInMinutes()' method
    public int totalTimeInMinutes(int camadas, int minutosNoForno){
        return preparationTimeInMinutes(camadas) + minutosNoForno;
    }
}
