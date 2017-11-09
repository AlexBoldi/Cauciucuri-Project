package ro.sci.service;

import ro.sci.domain.Cauciuc;

public class CauciucService {

    private Cauciuc[] cauciucuri;

    public CauciucService() {

        initLocalCauciucuri();

    }

    public Cauciuc findCauciuc(String make, String type) {

        Cauciuc foundCauciuc = null;

        for (Cauciuc cauciuc : cauciucuri) {

            if (make.equals(cauciuc.make) && type.equals(cauciuc.type)) {

                foundCauciuc = cauciuc;
                break;

            }
        }

        return foundCauciuc;
    }

    private void initLocalCauciucuri() {
        Cauciuc c1 = new Cauciuc("Yokohama");
        c1.type = "Summer";
        Cauciuc c2 = new Cauciuc("Continental");
        c2.type = "Winter";
        Cauciuc c3 = new Cauciuc("Goodyear");
        c3.type = "Winter";
        Cauciuc c4 = new Cauciuc("Continental");
        c4.type = "Summer";
        Cauciuc c5 = new Cauciuc("Yokohama");
        c5.type = "All Seasons";
        cauciucuri = new Cauciuc[] {c1, c2, c3, c4, c5};

    }


}
