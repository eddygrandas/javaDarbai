package com.company;

import java.util.HashMap;

public class DuomenuBaze implements Saugykla {
    private HashMap<Integer, Info> mapas;

    public DuomenuBaze() {
        this.mapas = new HashMap<>();
    }

    @Override
    public void saugotiInfo(Info info) {
        mapas.put(info.getId(), info);
    }

    @Override
    public Info rastiInfo(int id) {
        return mapas.get(id);
    }

    @Override
    public Info rastiInfo(String zodis) {
        for (Info infoIsMapo : mapas.values()) {
            if (infoIsMapo.getTekstas().contains(zodis)) {
                return infoIsMapo;
            }
        }
        return null;
    }


}
