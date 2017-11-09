package ro.sci.service;

import ro.sci.domain.Cauciuc;
import ro.sci.domain.SearchCauciucRequest;

public class SearchCauciucService {

    private CauciucService cauciucService = new CauciucService();

    public Cauciuc search(SearchCauciucRequest searchCauciucRequest) {

        Cauciuc validCauciuc = null;

        if (searchCauciucRequest.make != null) {

            Cauciuc cauciuc = this.cauciucService.findCauciuc(searchCauciucRequest.make, searchCauciucRequest.type);

            if (cauciuc != null && isTypeMatching(searchCauciucRequest.type, cauciuc)) {

                validCauciuc = cauciuc;
            }

        }

        return validCauciuc;

    }

    private boolean isTypeMatching(String type, Cauciuc cauciuc) {

            return type != null && type.equals(cauciuc.type);
    }


}
