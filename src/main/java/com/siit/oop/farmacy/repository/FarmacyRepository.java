package com.siit.oop.farmacy.repository;

import com.siit.oop.farmacy.Medicine;
import com.siit.oop.farmacy.Suplement;

import java.util.ArrayList;
import java.util.List;

public abstract class FarmacyRepository {

    public final static List<Medicine> medicins = new ArrayList<>(20);

    public final static List<Suplement> suplements = new ArrayList<>();
}
