/* 
 * Copyright
 * 
 */
package io.mosip.preregistration.datasync.code;

/**
 * 
 * This Enum provides the constant variables to accept input request.
 * 
 * @author Ravi C Balaji
 * @since 1.0.0
 *
 */
public enum RequestCodes {
	PRE_REGISTARTION_ID("preRegistrationId"), 
	REGISTARTION_CLIENT_ID("registrationCenterId"), 
	FROM_DATE("fromDate"), 
	TO_DATE("toDate"), 
	IDENTITY("identity"),
	POA("POA"),
	POI("POI"),
	POR("POR"),
	POD("POD"),
	POB("POB"),
	POLG("POLG"),
	POLSD("POLSD"),
	POLDP("POLDP"),
	POPMT("POPMT"),
	POREP("POREP"),
	POREG("POREG"),
	POSIG("POS"),
	POCP("POCP"),
	POADTN("POADTN"),
	POC("POC"),
	POE("POE"),
	POCO("POCO"),
	POOSD("POOSD"),
	POABD("POABD");
	
	/**
	 * @param code
	 */
	private RequestCodes(String code) {
		this.code = code;
	}

	private final String code;

	/**
	 * @return the code
	 */
	public String getCode() {
		return code;
	}
}
