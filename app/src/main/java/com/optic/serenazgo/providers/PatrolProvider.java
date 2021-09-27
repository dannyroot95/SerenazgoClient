package com.optic.serenazgo.providers;

import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.optic.serenazgo.models.Patrol;

import java.util.HashMap;
import java.util.Map;

public class PatrolProvider {

    DatabaseReference mDatabase;

    public PatrolProvider() {
        mDatabase = FirebaseDatabase.getInstance().getReference().child("Users").child("Drivers");
    }

    public Task<Void> create(Patrol patrol) {
        return mDatabase.child(patrol.getId()).setValue(patrol);
    }

    public DatabaseReference getDriver(String idDriver) {
        return mDatabase.child(idDriver);
    }

    public Task<Void> update(Patrol patrol) {
        Map<String, Object> map = new HashMap<>();
        map.put("name", patrol.getName());
        map.put("image", patrol.getImage());
        map.put("vehicleBrand", patrol.getVehicleBrand());
        map.put("vehiclePlate", patrol.getVehiclePlate());
        return mDatabase.child(patrol.getId()).updateChildren(map);
    }

}
