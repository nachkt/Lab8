package com.example.lab8;

import static org.junit.jupiter.api.Assertions.assertEquals;


//import org.junit.Before;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
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
        list.add(new City("City1", "Province1"));
        list.add(new City("City2", "Province2"));
        int listSize = list.getCount();
        assertEquals(list.getCount(), listSize + 2);
    }

    @Test
    void testDeleteCity() {
        City testCity = new City("TestCity", "TestProvince");
        list.add(testCity);
        Assertions.assertTrue(list.hasCity("TestCity"));

        list.deleteCity("TestCity");
        Assertions.assertFalse(list.hasCity("TestCity"));
    }


    @Test
    void testHasCity() {
        City testCity = new City("TestCity", "TestProvince");
        list.add(testCity);

        Assertions.assertTrue(list.hasCity("TestCity"));
    }


}


