package com.jjmsoftsolutions.jtracking.persistence.specification;

import java.util.Set;

/**
 * The {@code User} class represents a specification of the user. With this specification that
 * person who use the system can access the system
 * 
 * @author Jonathan Jara Morales
 * @since 0.0.1
 * @version 0.0.1
 */
public interface User extends ID {

	/**
	 * Sets the first name.
	 *
	 * @author Jonathan Jara Morales
	 * @since 0.0.1
	 * @param firstName the new first name
	 */
	public void setFirstName(String firstName);

	/**
	 * Gets the first name.
	 *
	 * @author Jonathan Jara Morales
	 * @since 0.0.1
	 * @return the first name
	 */
	public String getFirstName();

	/**
	 * Sets the last name.
	 *
	 * @author Jonathan Jara Morales
	 * @since 0.0.1
	 * @param lastName the new last name
	 */
	public void setLastName(String lastName);

	/**
	 * Gets the last name.
	 *
	 * @author Jonathan Jara Morales
	 * @since 0.0.1
	 * @return the last name
	 */
	public String getLastName();

	/**
	 * Sets the second last name.
	 *
	 * @author Jonathan Jara Morales
	 * @since 0.0.1
	 * @param secondLastName the new second last name
	 */
	public void setSecondLastName(String secondLastName);

	/**
	 * Gets the second lastname.
	 * 
	 * @author Jonathan Jara Morales
	 * @since 0.0.1
	 * @return the second lastname
	 */
	public String getSecondLastname();

	/**
	 * Sets the email.
	 *
	 * @author Jonathan Jara Morales
	 * @since 0.0.1
	 * @param email the new email
	 */
	public void setEmail(String email);

	/**
	 * Gets the email.
	 *
	 * @author Jonathan Jara Morales
	 * @since 0.0.1
	 * @return the email
	 */
	public String getEmail();

	/**
	 * Sets the password.
	 *
	 * @author Jonathan Jara Morales
	 * @since 0.0.1
	 * @param password the new password
	 */
	public void setPassword(String password);

	/**
	 * Gets the password.
	 *
	 * @author Jonathan Jara Morales
	 * @since 0.0.1
	 * @return the password
	 */
	public String getPassword();

	/**
	 * Sets the phone.
	 *
	 * @author Jonathan Jara Morales
	 * @since 0.0.1
	 * @param phone the new phone
	 */
	public void setPhone(String phone);

	/**
	 * Gets the phone.
	 *
	 * @author Jonathan Jara Morales
	 * @since 0.0.1
	 * @return the phone
	 */
	public String getPhone();

	/**
	 * Sets the avatar.
	 *
	 * @author Jonathan Jara Morales
	 * @since 0.0.1
	 * @param avatar the new avatar
	 */
	public void setAvatar(String avatar);

	/**
	 * Gets the avatar.
	 *
	 * @author Jonathan Jara Morales
	 * @since 0.0.1
	 * @return the avatar
	 */
	public String getAvatar();

	/**
	 * Gets the teams.
	 *
	 * @author Jonathan Jara Morales
	 * @since 0.0.1
	 * @return the teams
	 */
	public Set<Team> getTeams();

	/**
	 * Sets the teams.
	 *
	 * @author Jonathan Jara Morales
	 * @since 0.0.1
	 * @param teams the new teams
	 */
	public void setTeams(Set<Team> teams);

	/**
	 * Assign team.
	 *
	 * @author Jonathan Jara Morales
	 * @since 0.0.1
	 * @param team the team
	 * @return the team
	 */
	public Team assignTeam(Team team);

	/**
	 * Removes the team.
	 *
	 * @author Jonathan Jara Morales
	 * @since 0.0.1
	 * @param team the team
	 */
	public void removeTeam(Team team);

}