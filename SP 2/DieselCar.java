public class DieselCar extends AFuelCar {

    boolean particleFilter;

    DieselCar(String registrationNumber, String make, String model, int numberOfDoors,int kmPrLitre, boolean particleFilter){
        super(registrationNumber, make, model, numberOfDoors, kmPrLitre);
        this.particleFilter= particleFilter;

    }

    @Override
    public String toString() {
        return " fuelType: "+ getFuelType();
    }

    public String getFuelType(){
        return "diesel";
    }

    public boolean hasParticleFilter(){
        return  hasParticleFilter();
    }

    public int getRegistrationFee() {
        int ekstraFee = 0;



        if (!particleFilter) {
            ekstraFee += 1000;
        }

        if (kmPrLitre>= 20 && kmPrLitre <=50) {
            ekstraFee += 130;
        }else if (kmPrLitre >= 15 && kmPrLitre <=20) {
            ekstraFee += 1390;
        }else if (kmPrLitre >= 10 && kmPrLitre <=15){
            ekstraFee += 1850;
        }else if (kmPrLitre >= 5 && kmPrLitre <=10){
            ekstraFee += 2770;
        } else if (kmPrLitre<5) {
            ekstraFee += 15260;
        }
        return ekstraFee;

    }


    }




