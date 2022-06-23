/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication61;

/**
 *
 * @author manso
 */
public class RegistroCity {
    private int CityId;
    private String Cityname;

    public RegistroCity(int CityId, String Cityname) {
        this.CityId = CityId;
        this.Cityname = Cityname;
    }

    public int getCityId() {
        return CityId;
    }

    public void setCityId(int CityId) {
        this.CityId = CityId;
    }

    public String getCityname() {
        return Cityname;
    }

    public void setCityname(String Cityname) {
        this.Cityname = Cityname;
    }

    @Override
    public String toString() {
        return "RegsitroCity{" + "CityId=" + CityId + ", Cityname=" + Cityname + '}';
    }
    
}
