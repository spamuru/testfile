/*package testfile.testfile;

import static com.jayway.restassured.RestAssured.given;
import static org.hamcrest.Matchers.hasItems;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import org.hamcrest.Matchers;
import org.json.simple.JSONArray;
import org.json.JSONException;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.akamai.authzTests.responseBeans.Context;
import com.akamai.authzTests.responseBeans.GetContractDomainInput;
import com.akamai.authzTests.util.CQLs;
import com.akamai.authzTests.util.DBConnectionUtil;
import com.akamai.common.AuthzTestBase;
import com.akamai.common.AuthzURIs;
import com.akamai.taf.exception.DatabaseConnectionException;
import com.datastax.driver.core.BoundStatement;
import com.datastax.driver.core.Row;
import com.datastax.driver.core.Session;
import com.jayway.restassured.response.Response;

public class TestGetGroupHierarchyByDefaultContext2222222222222222222222 extends AuthzTestBase {

  Connection conn = null;
  Statement st = null;
  Session session = null;


  DBConnectionUtil dbutil = new DBConnectionUtil();

  @BeforeClass
  public void ConnecttoDatabase() throws DatabaseConnectionException, SQLException {

    // conn = (Connection) dbutil.getOracleConnection("sqa");
    session = (Session) dbutil.getCassandraSession("sqa");

    // st = conn.createStatement();
    System.out.println("Connection Established");

  }

  
   * Database connection close After executing all test cases
   
  @AfterClass
  public void CloseConnectiontoDatabase() throws DatabaseConnectionException {
    // dbutil.closeOracleConnection(conn);
    dbutil.closeCassandraSession(session);
    System.out.println("Connection closed");
  }


  public Context[] getGroupsFromCassandra(String user, String accountId, String contractTypeId) {

    ArrayList<String> groupList = new ArrayList<String>();
    Context[] contextObject;

    com.datastax.driver.core.PreparedStatement getAcgsFromIdentityEntitlementAcg =
        session.prepare(CQLs.GETGROUPS_IDENTITY_ENTITLEMENT_GROUPS);

    BoundStatement bstatement =
        getAcgsFromIdentityEntitlementAcg.bind(user, accountId, contractTypeId);
    List<Row> output = session.execute(bstatement).all();

    for (Row row : output) {

      String group = row.getString(0);// (Integer.parseInt(s.getString(0))
      groupList.add(group);

    }

    //System.out.println("List -- ++++ ************>>>>>>" + groupList);

    String cqlForContexts =
        "select context_id,child_contexts,parent_context_id,context_name from contexts where context_id =? and context_type='GROUP';";
    com.datastax.driver.core.PreparedStatement getGroupInfoContext =
        session.prepare(cqlForContexts);

    contextObject = new Context[groupList.size()];

    for (int i = 0; i < groupList.size(); i++) {
    // System.out.println("group " + groupList.get(i));

      contextObject[i] = new Context();
      BoundStatement bstatement1 = getGroupInfoContext.bind(groupList.get(i));
      Row contextInfo = session.execute(bstatement1).one();
     //System.out.println("contextInfo contextInfo contextInfo contextInfo" + contextInfo);
      
      if (contextInfo != null) {

        contextObject[i].setGroupId(contextInfo.getString("context_id"));
        contextObject[i].setParentGroupId(contextInfo.getString("parent_context_id"));
        contextObject[i].setChildContext(contextInfo.getSet("child_contexts", String.class));
        contextObject[i].setGroupName(contextInfo.getString("context_name"));


      }
    }

    return contextObject;
  }


  public void testGetGroupTopAndAll(GetContractDomainInput in) throws IOException, JSONException, ParseException {

    ArrayList<Context> parentGroupObject = new ArrayList<Context>();
    ArrayList<Integer> parentGroup = new ArrayList<Integer>();
    HashMap<String, Set> childParent = new HashMap<String, Set>();
    ArrayList<Integer> GroupList = new ArrayList<Integer>();
    ArrayList<String> groupNameAll = new ArrayList<String>();
    ArrayList<String> groupNameTop = new ArrayList<String>();

   Context[] contextObject = getGroupsFromCassandra("ccare2", "1-7KLGH",
		   "1-8BYUX");
    for (Context context : contextObject) {
     // System.out.println("object ::::::::::"+context.getGroupId());
      if(context.getGroupId() != null)
      {
      GroupList.add(Integer.parseInt(context.getGroupId()));
      groupNameAll.add(context.getGroupName());
      
      if (context.getParentGroupId() == null) {
        parentGroupObject.add(context);
        groupNameTop.add(context.getGroupName());
        try {
          System.out.println("value ---------->"+context.getGroupId());
          System.out.println("parse ---------->"+Integer.parseInt(context.getGroupId()));
          parentGroup.add(Integer.parseInt(context.getGroupId()));
         
      }
      
      catch (NumberFormatException nfe) {
          nfe.printStackTrace();
      }
  
      }

      }
      
      System.out.println("child :child child "+ context.getChildContext());
      if (!context.getChildContext().isEmpty()) {
        childParent.put(context.getGroupId(), context.getChildContext());
       // System.out.println(childParent + " child parenttttttttttttttttttttttttttttttttttttttttttttttttttttttttttt");
      }
    }
    
    System.out.println("done *********");
    
    Integer[] expectedGroupParent = parentGroup.toArray(new Integer[parentGroup.size()]);
    System.out.println("ParentGroup &&&&&&&&&&&&&" + parentGroup);
    
    Integer[] expectedGroupAll = GroupList.toArray(new Integer[GroupList.size()]);
    System.out.println("All ++++++++++++" + expectedGroupAll);
    for (int i=0;i<=expectedGroupAll.length-1;i++) {
   	System.out.println(expectedGroupAll[i]+ "this is printed now check it out");
    }
    
    String[] groupNameArray = groupNameAll.toArray(new String[groupNameAll.size()]);
    String[] groupNameTopArray = groupNameTop.toArray(new String[groupNameTop.size()]);


    Map cookieSet = loginToGetAkaTokenandXSRFToken("ccare2", "abc123", AuthzURIs.BaseURI);
    
    Response response =
        given().cookies(cookieSet).header("X-XSRF-TOKEN", cookieSet.get("XSRF-TOKEN"))
            .contentType("application/json").baseUri(AuthzURIs.BaseURI).log().all()
            .get("/authz/v2/groups?outputType=tree");
   
  // response.then().log().body();
   String s = response.body().asString();
  //System.out.println(s);
 
	   BufferedWriter bw_Res;
	    File resText1 = new File("src/test/resources/" + "_Response.json");
	    FileWriter fw_Res = new FileWriter(resText1.getAbsoluteFile());
	    bw_Res = new BufferedWriter(fw_Res);
	    bw_Res.write(s);
	    bw_Res.close(); 
   
   //Read from a file and print
    JSONParser parser = new JSONParser();

    try {     
      
        Object obj = parser.parse(new FileReader("src/test/resources/" + "_Response.json"));
        JSONArray pgroup = (JSONArray) obj;
        
        for (int i=0;i<=pgroup.size()-1;i++) { 
        	JSONObject jsonObject = (JSONObject) pgroup.get(i);

            Long parentid = (Long) jsonObject.get("groupId");
            
            System.out.print("\nparent id --> "+ parentid); 
            loopthroughJson(jsonObject);
      }
      
    } catch (FileNotFoundException e) {
        e.printStackTrace();
    } catch (IOException e) {
        e.printStackTrace();
    }
    
    

  }
 
  public static void loopthroughJson(JSONObject jsonObject) {
	 
	  
	  JSONArray childgroups =(JSONArray) jsonObject.get("childGroups");
	  
      for (int j=0;j<=childgroups.size()-1;j++) {
    	  if(j==0) {
    	  System.out.print("[");
    	  }
      	JSONObject jsonObject1 = (JSONObject) childgroups.get(j);
      	Long childid = (Long) jsonObject1.get("groupId");
          System.out.print(childid);
          loopthroughJson(jsonObject1);
          if(j==childgroups.size()-1) {
        	  System.out.print("]");
        	  }else {
        		  System.out.print(",");  
        	  }
      }
  }

  @Test(dataProvider = "GroupDataProvider",
      dataProviderClass = com.akamai.authzTests.dataProvider.GroupDataProvider.class)
  public void getGroupsHierarchyIndirect(GetContractDomainInput in) throws IOException, JSONException, ParseException {
    testGetGroupTopAndAll(in);
    

  }
 
  @Test
  public void test() throws IOException { 
    Map cookieSet = loginToGetAkaTokenandXSRFToken("ccare2", "abc123", AuthzURIs.BaseURI);
    
        given().cookies(cookieSet).header("X-XSRF-TOKEN", cookieSet.get("XSRF-TOKEN"))
            .contentType("application/json").baseUri(AuthzURIs.BaseURI).log().all()
            .get("/authz/v2/arlfile/identifiers").then().log().all();
   
}
  
}
=======
"getGroupsHierarchyIndirect": {
	"description": "Check response for a InDirect user ",		
    "user": "fmglccsitelecoms@rabobank.com",
	"accountId": "F-AC-477485",
	"pswd": "abc123",
	"contractTypeDesc": "Indirect Customer",
	"contractType": "1-5G3LB",
	"contractid": "3-11BQ93Z",
	"acgId":"3-11BQ93Z",
	"scope":"BC_USAGE_REPORT_READ"
}
"getGroupsHierarchyInvalidScope": {
			"description": "Check response for a Invalid scope ",
			"user": "ccare2",
			"pswd": "abc123",
			"accountId": "1-7KLGH",
			"contractType": "1-8BYUX",
			"contractid": "1-7KLGU",
			"scope":"BC"
		},

*/