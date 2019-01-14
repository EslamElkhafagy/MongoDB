package MongoProject;

import java.util.Collection;

import org.bson.BSON;
import org.bson.Document;
import org.bson.conversions.Bson;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Collation;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
// connections to url from : cloud.mongodb.com 
    String url="mongodb://root:root@mongodb-shard-00-00-tdpu4.mongodb.net:27017,mongodb-shard-00-01-tdpu4.mongodb.net:27017,mongodb-shard-00-02-tdpu4.mongodb.net:27017/admin?replicaSet=MongoDB-shard-0&ssl=true";
   MongoClientURI clientURI = new MongoClientURI(url);
   MongoClient mongoClient = new MongoClient(clientURI);
   
   // database name in MongoDB Compass 
   MongoDatabase mongoDatabase = mongoClient.getDatabase("Mongo");
   
   // select collection at My database " Mongo in this example "
   MongoCollection mongoCollection = mongoDatabase.getCollection("CollectionTest");
   
   System.out.println("DataBase Connected");
   /**
    * this example for insert data
    * */
 /*  Document document = new Document();
   
   document.append("name", "Elkhafagy");
   document.append("age", "23");
   document.append("salary", 2000);
   mongoCollection.insertOne(document);
   
   */
   
   
   /**
    * this example for update value
    * 
    * */
   /*
   Document found = (Document) mongoCollection.find(new Document("name","Elkhafagy")).first(); // check data founded or not
  
   if(found != null)
	   System.out.println("Name is founded");
   
   
   // Bson is interface 
   // this is a new value to update it
   Bson updatedValue = new Document("name","Eslam Ahmed Elkafagy");
   
   Bson updatedOperation = new Document("$set",updatedValue);// update quary
   
   mongoCollection.updateOne(found, updatedOperation);
   System.out.println("name updated !!");
   */
   
    
    }
}
