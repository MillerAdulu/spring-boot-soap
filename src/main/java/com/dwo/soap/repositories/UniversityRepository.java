package com.dwo.soap.repositories;

import localhost._7000.universities.University;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

@Component
public class UniversityRepository {
    private Map<String, University> universityMap = new HashMap<>();

    @PostConstruct
    private void loadData() {
        University strath = new University();
        strath.setLocation("Ole Sangale");
        strath.setName("Strathmore");
        strath.setYearFounded(1960);
        universityMap.put(strath.getName(), strath);

        University jkuat = new University();
        strath.setLocation("Juja");
        strath.setName("Jomo Kenyatta University and Technology");
        strath.setYearFounded(1990);
        universityMap.put(jkuat.getName(), jkuat);

        University riara = new University();
        strath.setLocation("Madaraka");
        strath.setName("Riara University");
        strath.setYearFounded(2003);
        universityMap.put(riara.getName(), riara);
    }

    public University getUniversityByName(String name) {
        return universityMap.get(name);
    }
}
