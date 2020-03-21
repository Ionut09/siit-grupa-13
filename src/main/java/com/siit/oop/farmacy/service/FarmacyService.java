package com.siit.oop.farmacy.service;

import com.siit.oop.farmacy.Antibiotic;
import com.siit.oop.farmacy.Antiviral;
import com.siit.oop.farmacy.Medicine;
import com.siit.oop.farmacy.Mineral;
import com.siit.oop.farmacy.Suplement;
import com.siit.oop.farmacy.Vitamin;
import com.siit.oop.farmacy.repository.FarmacyRepository;

public class FarmacyService {

    public static void main(String... args) {
        FarmacyService sensiblu = new FarmacyService();
        sensiblu.addMedicine(new Antiviral("Paracetamol", "COVID-19"));
        sensiblu.addMedicine(new Antibiotic("Augmentin"));
        sensiblu.addSuplement(new Vitamin("Vitamina B6", 250));
        sensiblu.addSuplement(new Mineral("Iron", 100));

        FarmacyService catena = new FarmacyService();
        System.out.println("catena");
        catena.printStock();

        System.out.println("sensiblu");
        sensiblu.printStock();

    }

    public void addMedicine(Medicine medicine) {
        FarmacyRepository.medicins.add(medicine);
    }

    public void addSuplement(Suplement suplement) {
        FarmacyRepository.suplements.add(suplement);
    }

    public void printStock() {
        for (Medicine medicin : FarmacyRepository.medicins) {
            System.out.println("medicin = " + medicin.toString());
        }

        for (Suplement suplement : FarmacyRepository.suplements) {
            System.out.println("suplement = " + suplement);
        }
    }

    public void getStock() {
        System.out.println("Medicines: " + FarmacyRepository.medicins.size());
        System.out.println("Suplements: " + FarmacyRepository.suplements.size());
    }

    public void removeMedicine(Medicine medicine) {
        FarmacyRepository.medicins.remove(medicine);
    }

    public void removeSuplement(Suplement suplement) {
        FarmacyRepository.suplements.remove(suplement);
    }

}
