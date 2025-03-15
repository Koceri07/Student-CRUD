package org.example.springhybernate164;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

import java.util.Objects;

@Entity
@Table(name = "Address")
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class AdressEntity {
    @Id
    @GeneratedValue
    private Long id;
    private String city;
    private String street;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AdressEntity that = (AdressEntity) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
