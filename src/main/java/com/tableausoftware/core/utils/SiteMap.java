package com.tableausoftware.core.utils;

import java.util.*;

import java.util.HashMap;
import java.util.Map;

public final class SiteMap {

    private static final Map<String, UUID> SITE_NAME_TO_ID;

    static {
        Map<String, UUID> map = new HashMap<>();
        map.put("seattle", UUID.fromString("16cb2062-2ad9-4cab-b5b2-1c8000c89b46"));
        map.put("nabanita", UUID.fromString("3cefc306-e72c-4ec3-9a45-d792616f31de"));
        map.put("india site", UUID.fromString("866db577-91f8-451a-9913-c1d332430045"));
        map.put("tokyo", UUID.fromString("9afc96b6-3ecc-494f-bdb4-8677a850a91e"));
        map.put("hack", UUID.fromString("c68e5517-c5cc-480c-bf45-dd376a676916"));
        map.put("default", UUID.fromString("f35729ea-5f62-4ea1-b06f-456bea4b78d9"));
        SITE_NAME_TO_ID = Collections.unmodifiableMap(map);
    }

    public SiteMap() {
        // Prevent instantiation
    }

    public static UUID getSiteId(String siteName) {
        if (siteName == null)
            return null;

        String loweredInput = siteName.toLowerCase();

        for (Map.Entry<String, UUID> entry : SITE_NAME_TO_ID.entrySet()) {
            if (entry.getKey().contains(loweredInput)) {
                System.out.println("site is: " + siteName + " and siteId is: " + entry.getValue());
                return entry.getValue();
            }
        }
        System.out.println("site is default and siteId is: " + SITE_NAME_TO_ID.get("default"));
        return SITE_NAME_TO_ID.get("default");
    }
}
