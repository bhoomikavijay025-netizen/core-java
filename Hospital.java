class Hospital {

  public static void main(String []args){

    System.out.println("Are you open now");
    getHospital();
  
    System.out.println("How many patients were treated");
    int morningPatients = 60;
    int eveningPatients = 40;
    boolean hasEmergencyWard = true;
    tosay(morningPatients, eveningPatients, hasEmergencyWard);

    double consultationFee = getYourConsultationFee();
    System.out.println(consultationFee);
    System.out.println("Hi Hospital what is your consultation fee");
  }
  static void getHospital(){
    System.out.println("Yes I am open now");
  }

  static void tosay(int morningPatients, int eveningPatients, boolean hasEmergencyWard){
    System.out.println("Ok I will tell you");
    int totalPatients = morningPatients + eveningPatients;
    System.out.println(totalPatients);
    System.out.println(hasEmergencyWard);
  }
  static double getYourConsultationFee(){
    System.out.println("Wait a minute");
    double consultationFee = 500.0;
    System.out.println("Now I know my consultation fee");
    return consultationFee;
  }
}
