package com.lipari.app.users.entities;

import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * The type Role.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="t_role")
public class Role {

    /**
     * The Id.
     */
    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "role_id")
	private Long id;
    /**
     * The Name.
     */
    private String name;

}
