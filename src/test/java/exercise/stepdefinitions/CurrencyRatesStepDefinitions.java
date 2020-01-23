package exercise.stepdefinitions;

import exercise.ApiEndPoints;
import io.cucumber.java.en.Given;
import io.restassured.RestAssured;

import static exercise.ApiEndPoints.CRatesApi;
import static exercise.ApiEndPoints.CRatesWeb;

public class CurrencyRatesStepDefinitions {

    @Given("Patricia is an active trader on IEX")
    public void patricia_is_an_active_trader_on_IEX() {
        System.out.println("test");

        //Web Check
        RestAssured.given().
                when().get(CRatesWeb.getUrl())
                .then().statusCode(200);
//API Chcek
        RestAssured.given().
                when().get(CRatesApi.getUrl())
                .then().statusCode(200);

        System.out.println(RestAssured.given().get(CRatesApi.getUrl()).print());



    }
}
