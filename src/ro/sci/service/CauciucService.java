package ro.sci.service;

import ro.sci.domain.Cauciuc;

public class CauciucService {

    private Cauciuc[] cauciucuri;

    public CauciucService() {
        initCauciucuri();
    }

    public Cauciuc findCauciuc(String make) {
        Cauciuc foundCauciuc = null;
        for(Cauciuc cauciuc : cauciucuri) {
            if (make != null && make.equals(cauciuc.make)) {
                foundCauciuc = cauciuc;
                break;
            }
        }
        return foundCauciuc;
    }

    private void initCauciucuri() {
        Cauciuc c1 = new Cauciuc("Michellin");
        c1.type = "Winter";
        Cauciuc c2 = new Cauciuc("Continental");
        c2.type = "Summer";
        Cauciuc c3 = new Cauciuc("Goodyear");
        c3.type = "All seasons";
        cauciucuri = new Cauciuc[] {c1, c2, c3};

    }


}
