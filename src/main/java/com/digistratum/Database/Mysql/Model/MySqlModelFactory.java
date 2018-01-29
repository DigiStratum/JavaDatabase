package com.digistratum.Database.Mysql.Model;

import com.digistratum.Database.Model;
import com.digistratum.Database.ModelFactory;
import com.digistratum.Database.Exception.MHDatabaseException;

/**
 * MysqlModelImpl Factory
 */
public class MySqlModelFactory implements ModelFactory {

	@Override
	public <T extends Model> T newModel(Class<T> modelClass) throws MHDatabaseException {
		try {
			return modelClass.getConstructor().newInstance();
		} catch (Exception e) {
			throw new MHDatabaseException("Failed to instantiate a new Model of type '" + modelClass.getCanonicalName() + "'", e);
		}
	}
}
