package com.volonter.services;

import com.volonter.models.Application;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class ApplicationService {
    private List<Application> applications = new ArrayList<>();
    private List<Application> applications2 = new ArrayList<>();
    private List<Application> applications3 = new ArrayList<>();
    private List<Application> applications4 = new ArrayList<>();
    private long ID = 0;

    public List<Application> listApplications() {return applications;}
    public List<Application> listApplications2() {return applications2;}
    public List<Application> listApplications3() {return applications3;}
    public List<Application> listApplications4() {return applications4;}
    public void saveApplication(Application application) {
        application.setId(++ID);
        if (application.getStatus().equals("1") | application.getStatus().equals("")) {
            applications.add(application);
        } else if (application.getStatus().equals("2")) {
            applications2.add(application);
        } else if (application.getStatus().equals("3")) {
            applications3.add(application);
        } else if (application.getStatus().equals("4")) {
            applications4.add(application);
        }
    }

    public void deleteApplication(Long id) {
        applications.removeIf(application -> application.getId().equals(id));
    }

    public Application getApplicationById(Long id) {
        for (Application application : applications) {
            if (application.getId().equals(id)) return application;
        }
        return null;
    }
}