package com.mango.restapi;

import com.mango.db.ConnectToDB;
import com.mango.entity.Users;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import org.bson.Document;
import org.codehaus.jackson.map.ObjectMapper;

import javax.ws.rs.*;
import javax.ws.rs.core.Application;
import javax.ws.rs.core.MediaType;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Path("/dbQuery")
public class DatabaseInteraction {

    //private final MongoDatabase mongoDatabase = ConnectToDB.getInstance().getMongoDB();

    @GET
    @Path("/hello")
   // @Produces(MediaType.TEXT_HTML)
    @Produces(MediaType.TEXT_PLAIN)
    public String getRecord() {/*{
    @QueryParam("value") String value
        final List<Users> users = new ArrayList<Users>();
        String resource = "";
        final MongoCollection collection = mongoDatabase.getCollection("Users");
        final FindIterable<Document> usr = collection.find(Filters.eq("username", username));
        Users user = null;
        final Iterator itr = usr.iterator();
        while (itr.hasNext()) {
            final Document doc = (Document) itr.next();
            final String json = doc.toJson();
            final ObjectMapper mapper = new ObjectMapper();
            try {
                user = mapper.readValue(json, Users.class);
            } catch (final IOException e) {
                e.printStackTrace();
            }
            users.add(user);
        }
        *//*if (users.size() != 0 && !user.isEmpty()) {
            return users.get(0);
        } else {
            return null;
        }*//*
        if (users == null) {
            resource = "Data not found";
        } else {

            resource = "Database retrived";
        }


        return "<html>" +"<title>" + "Dataretrival statuus" +"</title>" + "<body>" + "<h1>" + resource+"</h1>" + "</body>"+"</html>";
    }*/
        System.out.println("Hi");
        return "got it!";
    }
}