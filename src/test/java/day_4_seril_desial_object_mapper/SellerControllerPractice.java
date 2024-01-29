package day_4_seril_desial_object_mapper;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import utilities.CashwiseAuthorization;
import utilities.Config;
import utilities.DataGenerator;

public class SellerControllerPractice {

    String token = CashwiseAuthorization.getToken();


    /**
     * This test used by DataGenerator.sellerGenerator() class
     */
    @Test
    public void createSeller(){

        String url = Config.getProperty("baseUrl") + "/api/myaccount/sellers" ;

        Response response = RestAssured.given()
                .auth().oauth2(token)
                .contentType(ContentType.JSON)
                .body(DataGenerator.sellerGenerator())
                .post(url);

        response.prettyPrint();


    }


}
