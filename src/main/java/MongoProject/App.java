package MongoProject;

import org.bson.Document;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

    String url="mongodb://root:root@mongodb-shard-00-00-tdpu4.mongodb.net:27017,mongodb-shard-00-01-tdpu4.mongodb.net:27017,mongodb-shard-00-02-tdpu4.mongodb.net:27017/admin?replicaSet=MongoDB-shard-0&ssl=true";
   MongoClientURI clientURI = new MongoClientURI(url);
   MongoClient mongoClient = new MongoClient(clientURI);
   
   MongoDatabase mongoDatabase = mongoClient.getDatabase("Mongo");
   
   MongoCollection mongoCollection = mongoDatabase.getCollection("CollectionTest");
   
   Document document = new Document();
   
   document.append("name", "Elkhafagy");
   document.append("age", "23");
   document.append("salary", 2000);
   
   
   mongoCollection.insertOne(document);
   
   
   
   
   
   
    
    }
}
