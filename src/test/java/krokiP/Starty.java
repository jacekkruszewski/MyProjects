package krokiP;

import cucumber.api.DataTable;
//import cucumber.api.PendingException;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.List;

public class Starty {
    @Then("^nic sie nie zmienilo$")
    public void nicSieNieZmienilo() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //  System.out.println("pierwszy teścik \n");
        // throw new PendingException();
    }

    @Given("^jestem w aplikacji$")
    public void jestemWAplikacji() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //    throw new PendingException();
    }

    @When("^coś tam$")
    public void cośTam() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //    throw new PendingException();
    }

    @And("^mam więcej o$")
    public void mamWięcejO() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //   throw new PendingException();
    }


    @And("^moje haslo to \"([^\"]*)\" a user to \"([^\"]*)\"$")
    public void mojeHasloToAUserTo(String haslo, String user) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //    throw new PendingException();

        //  System.out.println("haselo to: " +haslo + " a user to: "+ user);
    }


    @And("^a tutaj inna metoda$")
    public void aTutajInnaMetoda(DataTable table) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //  throw new PendingException();

        List<List<String>> lista = table.raw();

        int x = lista.size();
        int x2 = 75;
        int x3 = 75;
        int x4 = 75;
        // for (int i =0; i<x; i++)
        //{
        System.out.println(lista.get(0).get(0));
        System.out.println(lista.get(0).get(1));
        //}

// druga metoda to stworzenie klasy Users i asList (Users.class)

    }

    @And("^moje haslo to ([^\"]*) a user to ([^\"]*)$")
    public void mojeHasloToHasloAUserToUser(String Userek, String Haslo) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //  throw new PendingException();
        System.out.println("user z SO: " + Userek.toString());

        System.out.println("haslo z SO: " + Haslo.toString());
    }
}
