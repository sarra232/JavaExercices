package com.wilsdres.examples.services.impl;

import com.wilsdres.examples.services.StreamsExplamplesServices;
import com.wilsdres.examples.utils.ListObjectsUtils;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.stream.Collectors;

@Service
public class StreamsExamplesServicesImpl implements StreamsExplamplesServices {

    public ArrayList<Integer> getNumberForFuntionalPrograming() {
        ArrayList<Integer> listNumberRamdon = ListObjectsUtils.getRandomArrayListNumberOfInteger(30);
        ArrayList<Integer> listNumberSorted =
                listNumberRamdon.stream().sorted().limit(5).collect(Collectors.toCollection(ArrayList::new));
        return listNumberSorted;
    }
}
