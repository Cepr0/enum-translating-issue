package io.github.cepr0.enumtranslatingissue;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

/**
 * @author Cepro, 2017-09-07
 */
@NoArgsConstructor
@Data
@Entity
public class User {

	@Id
	@GeneratedValue
	private Long id;

	private String name;

	@Enumerated(EnumType.STRING)
	@CollectionTable(name = "roles", joinColumns = @JoinColumn(name = "user_id"))
	@ElementCollection
	private Set<Role> roles;

	public User(String name, Set<Role> roles) {
		this.name = name;
		this.roles = roles;
	}
}
