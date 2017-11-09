package ro.sci.service;

import ro.sci.domain.Cauciuc;
import ro.sci.domain.SearchCauciucRequest;

public class SearchCauciucService {

    private CauciucService cauciucService = new CauciucService();

    public Cauciuc search(SearchCauciucRequest searchCauciucRequest) {
        Cauciuc validCauciuc = null;
        if (searchCauciucRequest != null) {
            Cauciuc cauciuc = this.cauciucService.findCauciuc(searchCauciucRequest.make);

            if (searchCauciucRequest !=null) {
                cauciuc = this.cauciucService.findCauciuc(searchCauciucRequest.make);
                validCauciuc = cauciuc;
            }

        }

        return validCauciuc;
    }


}
