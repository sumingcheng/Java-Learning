package com.string;

import java.util.HashMap;
import java.util.Map;

public class JSON {
    public static Map<String, String> parse (String jsonData) {
        Map<String, String> resultMap = new HashMap<>();

        // 去除大括号
        String trimmedData = jsonData.trim().substring(1, jsonData.length() - 1).trim();

        // 根据逗号分隔键值对
        String[] keyValuePairs = trimmedData.split(",");

        for (String pair : keyValuePairs) {
            // 去除空格
            String trimmedPair = pair.trim();

            // 根据冒号分隔键和值
            String[] keyAndValue = trimmedPair.split(":");

            // 提取键和值，去除双引号
            String key = keyAndValue[0].trim().substring(1, keyAndValue[0].length() - 1);
            String value = keyAndValue[1].trim();

            if (value.startsWith("\"")) {
                value = value.substring(1, value.length() - 1);
            }

            resultMap.put(key, value);
        }

        return resultMap;
    }

    public static void main (String[] args) {
        String jsonData = "{ \"name\": \"John Doe\", \"age\": \"30\", \"city\": \"New York\" }";
        Map<String, String> result = parse(jsonData);
        System.out.println(result);
    }
}
