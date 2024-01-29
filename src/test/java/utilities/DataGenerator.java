package utilities;

import com.github.javafaker.Faker;
import pojo.RequestBody;

public class DataGenerator {
    static Faker faker = new Faker();
    static RequestBody requestBody = new RequestBody();


    public static RequestBody sellerGenerator(){
        requestBody.setCompany_name(faker.company().name());
        requestBody.setSeller_name(faker.name().fullName());
        requestBody.setEmail(faker.internet().emailAddress());
        requestBody.setPhone_number(faker.phoneNumber().cellPhone());
        requestBody.setAddress(faker.address().fullAddress());
         /*
         private String company_name;
         private String seller_name;
        //  private String email;   We already have it
         private String phone_number;
         private String address;
          */
        return requestBody;
    }


    /*

    public Map<String, Object > reqBodyBankAccount(){
        Faker faker = new Faker();
        String companyName = faker.company().name();
        Map<String, Object> requestBody = new HashMap<>();
        requestBody.put("bank_account_name", companyName);
        requestBody.put("description",  faker.company().name() + " Financial inc" );
        requestBody.put("type_of_pay", "BANK");
        requestBody.put("balance", faker.number().randomNumber(4, true));

        return requestBody;
    }
     */



}
