

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
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;

/**
 * Servlet implementation class InterestServlet
 */
@WebServlet("/InterestServlet")
public class InterestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InterestServlet() {
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
		Ad fd=null;
		String id=request.getParameter("id");
		MongoCursor<Document> cursor=collection.find(Filters.eq("posttitle",id)).iterator();
		while(cursor.hasNext())
		{
			Document p=(Document) cursor.next();
			fd=new Ad(p.getString("category"),p.getString("posttitle"),p.getString("city"),p.getString("description"),p.getString("name"),p.getString("email"),p.getString("phone"));
		}
		
		request.getSession().setAttribute("last", fd);
		RequestDispatcher rd=request.getRequestDispatcher("ConfirmInterest.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
