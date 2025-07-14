package com.tableausoftware.core.constants;

/**
 * This class holds the constants for user Service.
 * any URL should be defined with proper placeholders
 */
public class APIRoutes {
    public static String USERS_V1 = "/api/v1/tenants/%s/users";
    public static String USERS_BY_ID_V1 = "/api/v1/tenants/%s/users/%s";
    public static String BULK_USER_OPERATION_DETAILS_V1 = "/api/v1/users/jobs/%s";
}