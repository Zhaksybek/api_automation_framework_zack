package day_4_seril_desial_object_mapper;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.Test;
import pojo.BankAccountPOJO;

public class BankAccountPractice {


    @Test
    public void test_1_getBankAccount() throws JsonProcessingException {
        String token ="eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJjb2Rld2lzZV9iYXRjaDRfYXBpQGdtYWlsLmNvbSIsImV4cCI6MTcwNjQwNTUyOSwiaWF0IjoxNzA1ODAwNzI5fQ.YidPtkHfXioUt2nh3b87IUkykEJQbHsNbrLLEFt9MbXT-5Kf2U33P6YuGdd6Bzu2h1pvIHECFNSDrLexdRqeUw";
        String url ="https://backend.cashwise.us/api/myaccount/bankaccount/958";

        Response response = RestAssured
                .given().auth().oauth2(token)
                .get(url);

        ObjectMapper mapper = new ObjectMapper();
        BankAccountPOJO bankAccount = mapper.readValue(response.asString(), BankAccountPOJO.class );

        System.out.println(bankAccount.getBank_account_name());
    }


}
