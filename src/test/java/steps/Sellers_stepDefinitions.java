package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import utilities.APIRunner;

import java.util.HashMap;
import java.util.Map;

public class Sellers_stepDefinitions {

    @Given("user hits get all sellers api with {string} and parameters: isArchived {string}, page {int}, size {int}")
    public void user_hits_get_all_sellers_api_with_and_parameters_is_archived_page_size(String path, String isArchived, Integer page, Integer size) {
        System.out.println(path);
        System.out.println(isArchived);
        System.out.println(page);
        System.out.println(size);

        System.out.println("=========");
        String pathParam = path;
        Map<String, Object> params = new HashMap<>();
        params.put("isArchived", false);
        params.put("page",page);
        params.put("size",size);
        APIRunner.runGET(pathParam,params);
        System.out.println("Test passed");
    }

    @Then("user gets all sellers phone number")
    public void user_gets_all_sellers_phone_number() {
        int size =  APIRunner.getCustomResponse().getResponses().length;
        for (int i=0; i<size; i++){
            System.out.println(APIRunner.getCustomResponse().getResponses()[i].getPhone_number());
            Assert.assertNotNull( "Phone number is empty",APIRunner.getCustomResponse().getResponses()[i].getPhone_number()  );
        }

        System.out.println("Test passed");
    }

}
