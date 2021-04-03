package org.byte2code.pohdequest;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.exceptions.UnirestException;
import io.github.cdimascio.dotenv.Dotenv;
import java.net.URLEncoder;
import java.io.UnsupportedEncodingException;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

public class App {

  public static void main(String[] args) throws UnsupportedEncodingException, UnirestException {

    Dotenv dotenv = Dotenv.load();


    try {
      HttpResponse<JsonNode> response = Unirest.get("https://listen-api.listennotes.com/api/v2/search?q=star%20wars&sort_by_date=0&type=episode&offset=0&len_min=10&len_max=30&genre_ids=68%2C82&published_before=1580172454000&published_after=0&only_in=title%2Cdescription&language=English&safe_mode=0")
              .header("X-ListenAPI-Key", "f57dbc4b2faa481b9ff32d8726f9f38c")
              .asJson();
      //Prettifying
      Gson gson = new GsonBuilder().setPrettyPrinting().create();
      JsonParser jp = new JsonParser();
      JsonElement je = jp.parse(response.getBody().toString());
      String prettyJsonString = gson.toJson(je);
      System.out.println(prettyJsonString);
            System.out.println(prettyJsonString);
    } catch (UnirestException e) {
      e.printStackTrace();
    }


    /*
    // Host url
    String host = "https://listen-api.listennotes.com/api/v2/search";
    String charset = "UTF-8";

    // Headers for a request
    String x_api_host = "https://listen-api.listennotes.com/api/v2/openapi";
    String x_api_key = dotenv.get("API_KEY");

    // Params
    String s = "star";

    // Format query for preventing encoding problems

      String query = String.format("q=%s",
              URLEncoder.encode(s, charset));

  HttpResponse<JsonNode> response = Unirest.get(host + "?q=" + s +"&sort_by_date=0&type=episode&offset=0&len_min=10&len_max=30&genre_ids=68%2C82&published_before=1580172454000&published_after=0&only_in=title%2Cdescription&language=English&safe_mode=0")
          .header("X-ListenAPI-Host", x_api_host)
          .header("X-ListenAPI-Key", x_api_key)
          .asJson();

     */


  }
}
