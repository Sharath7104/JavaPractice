package com.masai.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.AttributeOverride;
import jakarta.persistence.AttributeOverrides;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Owner {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer ownerId;
	
	@NotBlank(message = "First name is mandatory")
	@NotEmpty(message = "First name cannot be blank")
	@NotNull(message = "First name cannot be null")
    @Pattern(regexp = "^[a-zA-Z]+$", message = "First name must contain only characters")
    private String firstName;
	
	@NotBlank(message = "Last name is mandatory")
	@NotEmpty(message = "Last name cannot be blank")
	@NotNull(message = "Last name cannot be null")
    @Pattern(regexp = "^[a-zA-Z]+$", message = "Last name must contain only characters")
	private String lastName;
	
	@NotBlank(message = "Mobile number is mandatory")
	@Pattern(regexp = "^[6-9]\\d{9}$", message = "Mobile number must have 10 digits")
    private String mobileNumber;
	
	@Embedded
	@AttributeOverrides({
		@AttributeOverride(name = "city", column = @Column(name = "city")),
		@AttributeOverride(name = "state", column = @Column(name = "state")),
		@AttributeOverride(name = "pincode", column = @Column(name = "pincode")),
	})
	private Address address;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "owner", cascade = CascadeType.ALL)
	@JsonIgnore
	private List<Pet> pets;
}
