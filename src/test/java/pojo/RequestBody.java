package pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;


@Data
//@Getter  // day
//@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class RequestBody {
    /**
     * day_3
     * Purpose of this class is set RequestBody
     */

    // CashwiseAuthorization
    private String email;
    private String password;

    // Category-controller
    private String category_title;
    private String category_description;
    private boolean flag;


/*

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

 */


}
