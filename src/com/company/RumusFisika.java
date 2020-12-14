package com.company;

public class RumusFisika {

    public double momentum(double massa, double kecepatan){
        return massa * kecepatan;
    }

    public double perubahanMomentum(double massa, double kecAwal, double kecAkhir){
        return (massa * kecAkhir) - (massa * kecAwal);
    }

    public double energiPotensial(double massa, double tinggi){
        return massa * 10 * tinggi;
    }

    public double energiKinetik(double massa, double kecepatan){
        return (massa * Math.pow(kecepatan,2))/2;
    }

    public double energiMekanik(double energiPotensial, double energiKinetik){
        return energiPotensial + energiKinetik;
    }

}
