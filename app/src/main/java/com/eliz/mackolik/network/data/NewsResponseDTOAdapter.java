package com.eliz.mackolik.network.data;

import androidx.annotation.Nullable;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class NewsResponseDTOAdapter extends JsonAdapter<NewsResponseDTO> {

    @Nullable
    @Override
    public NewsResponseDTO fromJson(JsonReader reader) throws IOException {
        List<NewsItem> newsList = new ArrayList<>();
        reader.beginArray();
        while(reader.hasNext()) {
            reader.beginObject();
            newsList.add(new NewsItem(
                    reader.nextLong(),
                    reader.nextString(),
                    reader.nextString(),
                    reader.nextString(),
                    reader.nextString(),
                    reader.nextString()
            ));
            reader.endObject();
        }
        reader.endArray();
        return new NewsResponseDTO(newsList);
    }

    @Override
    public void toJson(JsonWriter writer, @Nullable NewsResponseDTO value) throws IOException { }
}
