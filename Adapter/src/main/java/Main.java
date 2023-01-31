public class Main {
    public static void main(String[] args) {
        IHospital hospital = new PrivateClinicAdapterComp(new PrivateClinic());
        hospital.createMedicalCard();
        hospital.getMedicalTreatment();
    }
}
