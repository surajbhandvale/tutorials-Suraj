package com.baeldung.list.multiple.objecttypes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MultipleObjectTypeArrayList {

    public static void main(String[] args) {

        List<Object> multiTypeList = new ArrayList<>();
        multiTypeList.add(Integer.valueOf(10));
        multiTypeList.add(Double.valueOf(11.5));
        multiTypeList.add("String Data");
        multiTypeList.add(Arrays.asList(1, 2, 3));
        multiTypeList.add(new CustomObject("Class Data"));

        for (Object dataObj : multiTypeList) {
            if (dataObj instanceof Integer intData)
                System.out.println("Integer Data : " + intData);
            if (dataObj instanceof Double doubleData)
                System.out.println("Double Data : " + doubleData);
            if (dataObj instanceof String stringData)
                System.out.println("String Data : " + stringData);
            if (dataObj instanceof List<?> intList)
                System.out.println("List Data : " + intList);
            if (dataObj instanceof CustomObject customObj)
                System.out.println("CustomObject Data : " + customObj.getClassData());
        }
    }

}
