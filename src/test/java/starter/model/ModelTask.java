package starter.model;

public class ModelTask {

    public formRegister getformRegister(formRegister formRegister2){

        formRegister2.setF_name(user.F_NAME);
        formRegister2.setL_name(user.L_NAME);
        formRegister2.setAddress(user.EMAIL);
        formRegister2.setCity(user.CITY);
        formRegister2.setZip_code(user.ZIP_CODE);
        formRegister2.setPass(user.PASS);
        return formRegister2;
    }
}
