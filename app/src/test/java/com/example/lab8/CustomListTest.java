package com.example.lab8;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class CustomListTest {
    private CustomList list;

    public CustomList MockCityList(){
        list = new CustomList(null,new ArrayList<>());
        return list;
    }

    @Test
    public void addCityTest(){
        list = MockCityList();
        int listSize = list.getCount();
        list.addCity(new City("Estevan", "SK"));
        assertEquals(list.getCount(),listSize + 1);
    }
    @Test
    void testCountCities() {
        list = MockCityList();
        int listSize = list.getCount();
        list.addCity(new City("City1", "Province1"));
        list.addCity(new City("City2", "Province2"));
        assertEquals(list.getCount(), listSize + 2);
    }

    @Test
    void testDeleteCity() {
        list = MockCityList();
        City testCity = new City("TestCity", "TestProvince");
        list.addCity(testCity);
        Assertions.assertTrue(list.hasCity("TestCity"));

        list.deleteCity("TestCity");
        Assertions.assertFalse(list.hasCity("TestCity"));
    }


    @Test
    void testHasCity() {
        list = MockCityList();
        City testCity = new City("TestCity", "TestProvince");
        list.addCity(testCity);

        Assertions.assertTrue(list.hasCity("TestCity"));
    }


}


