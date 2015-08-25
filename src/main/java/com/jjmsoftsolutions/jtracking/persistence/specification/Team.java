package com.jjmsoftsolutions.jtracking.persistence.specification;

import java.util.Set;

/**
 * The {@code Team} class represents a specification of team.
 *
 * @author Jonathan Jara Morales
 * @since 0.0.1
 * @version 0.0.1
 */
public interface Team extends ID {

	/**
	 * Sets the name.
	 *
	 * @author Jonathan Jara Morales
	 * @since 0.0.1 @ * @param name the new name
	 * 
	 */
	public void setName(String name);

	/**
	 * Gets the name.
	 *
	 * @author Jonathan Jara Morales
	 * @since 0.0.1
	 * @return the name
	 */
	public String getName();

	/**
	 * Sets the description.
	 *
	 * @author Jonathan Jara Morales
	 * @since 0.0.1
	 * @param description the new description
	 */
	public void setDescription(String description);

	/**
	 * Gets the description.
	 *
	 * @author Jonathan Jara Morales
	 * @since 0.0.1
	 * @return the description
	 */
	public void getDescription();

	/**
	 * Sets the avatar.
	 *
	 * @author Jonathan Jara Morales
	 * @since 0.0.1
	 * @param avatar the new avatar
	 * 
	 */
	public void setAvatar(String avatar);

	/**
	 * Gets the avatar.
	 *
	 * @author Jonathan Jara Morales
	 * @since 0.0.1
	 * @return the avatar
	 */
	public void getAvatar();

	/**
	 * Sets the users.
	 * 
	 * @author Jonathan Jara Morales
	 * @since 0.0.1
	 */
	public void setUsers();

	/**
	 * Gets the users.
	 *
	 * @author Jonathan Jara Morales
	 * @since 0.0.1
	 * @return the users
	 */
	public Set<User> getUsers();

	/**
	 * Adds the user.
	 *
	 * @author Jonathan Jara Morales
	 * @since 0.0.1
	 * @param user the user
	 * @return the user
	 */
	public User addUser(User user);

	/**
	 * Removes the user.
	 *
	 * @author Jonathan Jara Morales
	 * @since 0.0.1
	 * @param user the user
	 * @return the user
	 */
	public User removeUser(User user);

}
