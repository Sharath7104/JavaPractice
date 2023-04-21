package com.masai.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Pet {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer petId;
	private String name;
	private String species;
	private Integer age;
	
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "owner_id")
    private Owner owner;

	@Override
	public String toString() {
		return "Pet [id=" + petId + ", name=" + name + ", species=" + species + ", age=" + age + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pet other = (Pet) obj;
		return age == other.age && Objects.equals(petId, other.petId) && Objects.equals(name, other.name)
				&& Objects.equals(species, other.species);
	}

	@Override
	public int hashCode() {
		return Objects.hash(age, petId, name, species);
	}


	public Integer getOwnerId() {
			// TODO Auto-generated method stub
			return this.getOwner().getOwnerId();
	}
}

