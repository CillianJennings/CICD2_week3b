package ie.atu.week3_recap_partb;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PositiveOrZero;
import jakarta.validation.constraints.Size;


    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public class Product {

        @NotNull(message = "ID cannot be NULL")
        private long id;

        @NotBlank(message = "Name cannot be Blank")
        @Size(min = 1, max=50, message = "Name must be between 1 to 50")
        private String name;

        @PositiveOrZero(message = "Price must be positive or 0")
        private double price;

    }

