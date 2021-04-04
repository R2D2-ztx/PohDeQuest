package org.byte2code.pohdequest.services;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import io.github.cdimascio.dotenv.Dotenv;

public class PodcastServiceImpl implements PodcastService{

    @Override
    public void fetch(String endpoint) {

        // dotenv class can be a singleton or just stay on main class
        Dotenv dotenv = Dotenv.load();

        String host = "https://listen-api.listennotes.com/api/v2/search";
        String x_api_key = dotenv.get("API_KEY");

        // string for test
        String s = "joe rogan experience";

        // format query to the format the listen api demands
        String query = s.replaceAll("\\s", "%20");

        // fetch the api
        try {
            HttpResponse<JsonNode> response = Unirest.get(host + "?q=" + query + "&sort_by_date=0&type=podcast&offset=0&len_min=10&len_max=30&genre_ids=68%2C82&published_before=1580172454000&published_after=0&only_in=title%2Cdescription&language=English&safe_mode=0")
                    .header("X-ListenAPI-Key", x_api_key)
                    .asJson();

            // Prettifying - This is going to be deleted
            // Actually we need to get result (the JSON) and format to the necessary to use it on a thymeleaf template (jsonToJsonDtoConverter ?)
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            JsonParser jp = new JsonParser();
            JsonElement je = jp.parse(response.getBody().toString());
            String prettyJsonString = gson.toJson(je);
            System.out.println(prettyJsonString);
            System.out.println(prettyJsonString);

        } catch (UnirestException e) {
            e.printStackTrace();
        }
    }
}
