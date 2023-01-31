public class PrivateClinicAdapterInh extends PrivateClinic implements IHospital {
    @Override
    public void createMedicalCard() {
        createElectronicAccount();
    }

    @Override
    public void getMedicalTreatment() {
        signUpForServices();
        getTreatment();
    }
}
