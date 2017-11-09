package ro.sci;

import ro.sci.controller.CauciucController;
import ro.sci.controller.LoginController;
import ro.sci.domain.Cauciuc;
import ro.sci.domain.LoginRequest;
import ro.sci.domain.SearchCauciucRequest;
import ro.sci.domain.User;

public class Main {

    public static void main(String[] args) {

        LoginController loginController = new LoginController();

        LoginRequest loginRequest = new LoginRequest("gigi", "alegeoaia");

        User result = loginController.handleLoginRequest(loginRequest);

        if (result != null) {
            System.out.println("Autentificare cu succes");
        }else {
            System.out.println("mai incearca " + loginRequest.loginName);

        }

        CauciucController cauciucController = new CauciucController();

        SearchCauciucRequest searchCauciucRequest = new SearchCauciucRequest("Continental", "Summer");
        // Atat producatorul cat si tipul de cauciuc trebuie sa se potriveasca pentru a fi afisat un rezultat

        Cauciuc searchResult = cauciucController.handleSearchCauciucRequest(searchCauciucRequest);

        if (searchResult != null) {

            System.out.println("Cautare cu succes" + " - " + searchCauciucRequest.make + " " + searchCauciucRequest.type);

        } else {

            System.out.println("Nici un rezultat");

        }

    }

}
