package org.example.api;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import java.io.IOException;

public class DOWSerialize extends JsonDeserializer<Integer> {


    @Override
    public Integer deserialize(JsonParser jp,
                               DeserializationContext ctxt) throws IOException {
        Bus.DOW[] dow = jp.readValueAs(Bus.DOW[].class);
        int i = 0;
        for(Bus.DOW d : dow){
            int z = d.ordinal();
            i = i | (1<<z);
        }

        return i;
    }
}
