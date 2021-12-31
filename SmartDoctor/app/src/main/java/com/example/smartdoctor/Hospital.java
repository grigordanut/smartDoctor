package com.example.smartdoctor;

import com.google.firebase.database.Exclude;

public class Hospital {

    public String hospUnique_Code;
    public String hosp_Name;
    public String hospEmail_Address;
    public String hosp_Key;

    public Hospital(){

    }

    public Hospital(String hospUnique_Code, String hosp_Name, String hospEmail_Address) {
        this.hospUnique_Code = hospUnique_Code;
        this.hosp_Name = hosp_Name;
        this.hospEmail_Address = hospEmail_Address;
    }

    public String getHospUnique_Code() {
        return hospUnique_Code;
    }

    public void setHospUnique_Code(String hospUnique_Code) {
        this.hospUnique_Code = hospUnique_Code;
    }

    public String getHosp_Name() {
        return hosp_Name;
    }

    public void setHosp_Name(String hosp_Name) {
        this.hosp_Name = hosp_Name;
    }

    public String getHospEmail_Address() {
        return hospEmail_Address;
    }

    public void setHospEmail_Address(String hospEmail_Address) {
        this.hospEmail_Address = hospEmail_Address;
    }

    @Exclude
    public String getHosp_Key() {
        return hosp_Key;
    }

    @Exclude
    public void setHosp_Key(String hosp_Key) {
        this.hosp_Key = hosp_Key;
    }
}
