public class Main {
    public static void main(String[] args) {
        IHospital hospital1 = new PrivateClinicAdapterComp(new PrivateClinic());
        hospital1.createMedicalCard();
        hospital1.getMedicalTreatment();

        IHospital hospital2 = new PrivateClinicAdapterInh();
        hospital2.createMedicalCard();
        hospital2.getMedicalTreatment();
    }
}
