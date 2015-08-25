package com.jjmsoftsolutions.jtracking.persistence.specification;

/**
 * The {@code ID} class represents a specification of persistence identifier
 * 
 * @author Jonathan Jara Morales
 * @since 0.0.1
 * @version 0.0.1
 */
public interface ID {

	/**
	 * Sets the id.
	 *
	 * @author Jonathan Jara Morales
	 * @since 0.0.1
	 * @param id the new id
	 */
	public void setId(int id);

	/**
	 * Gets the id.
	 *
	 * @author Jonathan Jara Morales
	 * @since 0.0.1
	 * @return the id
	 */
	public int getId();
}
