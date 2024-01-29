package pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.util.List;

@Data // It will automatically add getter and Setter method
@JsonIgnoreProperties(ignoreUnknown = true) // com.fasterxml.jackson.databind.exc.UnrecognizedPropertyException: Unrecognized field "category_description"
public class CustomResponse {

    /**
     * Category-controller
     */
    private int category_id;
    private String category_title;
    private String category_description;
    private boolean flag;


    /**
     * "product_id": 719,
     *     "product_title": "Apple magic mouse",
     *     "product_price": 350.0,
     */
    private int product_id;
    private String product_title;
    private double product_price;



    private List<CustomResponse> responses ;

    private String responseBody;





}
