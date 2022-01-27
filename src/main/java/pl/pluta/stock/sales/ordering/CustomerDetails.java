package pl.pluta.stock.sales.ordering;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class CustomerDetails {
    String firstname;
    String lastname;
    String email;

    public static CustomerDetails of(String firstname, String lastname, String email) {
        return new CustomerDetails(firstname, lastname, email);
    }
}
