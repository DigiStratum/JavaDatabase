package com.digistratum.Database.Exception;

public class MHDatabaseException extends Exception {
	public MHDatabaseException(String message) { super(message); }
	public MHDatabaseException(String message, Throwable cause) { super(message, cause); }
	public MHDatabaseException(Throwable cause) { super(cause); }
	public MHDatabaseException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}
}
