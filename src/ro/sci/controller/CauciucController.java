package ro.sci.controller;

import ro.sci.domain.Cauciuc;
import ro.sci.domain.SearchCauciucRequest;
import ro.sci.service.SearchCauciucService;

public class CauciucController {

    private SearchCauciucService searchCauciucService = new SearchCauciucService();

    public Cauciuc handleSearchCauciucRequest(SearchCauciucRequest searchCauciucRequest) {
        Cauciuc cauciuc = this.searchCauciucService.search(searchCauciucRequest);

        return cauciuc;


    }

}




