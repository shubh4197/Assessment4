

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.bson.Document;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

/**
 * Servlet implementation class AdServlet
 */
@WebServlet("/AdServlet")
public class AdServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdServlet() {
        super();
        // TODO Auto-generated constructor stub
        
        
    }
    

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		MongoClient connection = ConnectionManager.getMongo();
		MongoDatabase db = ConnectionManager.getDb("Ads");
		MongoCollection<Document> collection = db.getCollection("record");
		String title=request.getParameter("posttitle");
		String city=request.getParameter("city");
		String description=request.getParameter("description");
		String name=request.getParameter("name");
		String email=request.getParameter("email");
		String phone=request.getParameter("phone");
		String category=(String) request.getSession().getAttribute("lol");
		
		Document sd=new Document("category",category).append("posttitle", title).append("city", city).append("description",description).append("name",name).append("email",email).append("phone", phone);
      collection.insertOne(sd);	
        RequestDispatcher hi=request.getRequestDispatcher("New.jsp");
        hi.forward(request, response);
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
