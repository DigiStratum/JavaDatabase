package com.digistratum.Database;

import com.digistratum.Database.Exception.MHDatabaseException;

public interface ModelFactory {

	/**
	 * Generic Model Maker
	 *
	 * @return Object instance of modelClass type
	 *
	 * @throws MHDatabaseException
	 */
	public <T extends Model> T newModel(Class<T> modelClass) throws MHDatabaseException;
}
