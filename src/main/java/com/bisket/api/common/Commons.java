package com.bisket.api.common;

public class Commons {

    public static String getBusinessCompositeKey(String openServiceId, String openAutonomousBodyCode, String managementCode) {
        return String.format("%s|%s|%s", openServiceId, openAutonomousBodyCode, managementCode);
    }

    /**
     * API 응답결과
     */
    public enum ApiResponseResult {
        SUCCESS, FAIL
    }
}
