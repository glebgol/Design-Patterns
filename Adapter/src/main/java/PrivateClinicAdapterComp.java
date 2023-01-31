public class PrivateClinicAdapterComp implements IHospital {
    protected PrivateClinic privateClinic;

    public PrivateClinicAdapterComp(PrivateClinic privateClinic) {
        this.privateClinic = privateClinic;
    }


    @Override
    public void createMedicalCard() {
        privateClinic.createElectronicAccount();
    }

    @Override
    public void getMedicalTreatment() {
        privateClinic.signUpForServices();
        privateClinic.getTreatment();
    }
}
