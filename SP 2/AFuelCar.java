public  abstract class AFuelCar extends ACar{

   protected int kmPrLitre;

 public AFuelCar(String registrationNumber, String make,String model,int numberOfDoors, int kmPrLitre){
     super(registrationNumber,make,model,numberOfDoors);
     this.kmPrLitre=kmPrLitre;
 }


    abstract String getFuelType();


   public int kmPrLitre(int kmPrLitre){
     return kmPrLitre;


   }


}
