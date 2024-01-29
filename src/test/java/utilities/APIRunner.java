package utilities;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import lombok.Getter;
import pojo.CustomResponse;

public class APIRunner {
    @Getter
    private static CustomResponse customResponse;

    //@Getter
    //private static CustomResponse[] myResponse;


    private static String token = CashwiseAuthorization.getToken(); // Get token once in class level and use it for entire project


    /** Day_5 APIRunner (Description about this class)
     * APIRunner class contains custom methods for CRUD commands
     * With help of this class we can focus on test logic, instead of automation
     * script
     */


    /**
     * Executes a GET request to the specified API path and returns a CustomResponse object.
     *
     * @param path The API path to make the GET request to.
     * @return A CustomResponse object representing the response from the API.
     */
    public static CustomResponse runGET(String path){
        String url = Config.getProperty("baseUrl") + path;

        Response response = RestAssured.given()
                .auth().oauth2( token  )
                .get( url );

        ObjectMapper mapper = new ObjectMapper();
            try {
                 customResponse = mapper.readValue(response.asString(), CustomResponse.class);

                 //  System.out.println(APIRunner.getCustomResponse().getResponseBody());
                // it allows to me get response body as a String and see if something wrong
                 customResponse.setResponseBody(response.asString());
            } catch (JsonProcessingException e) {
                System.out.println("Maybe list response");;
            }

        return customResponse;

    }




}
