package com.pholar.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pholar.db.DBConnection;

/**
 * Servlet implementation class getDataServlet
 */
@WebServlet("/getDataServlet")
public class getDataServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private Connection conn;
    private PreparedStatement stmt;
    private ResultSet rs;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public getDataServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/plain");
		response.setCharacterEncoding("utf-8");
		request.setCharacterEncoding("utf-8");
		String user_id = request.getParameter("user_id");
		String query = "select * from data where user_id = ?";
		PrintWriter out = response.getWriter();
		out.write(query);
//		conn = DBConnection.getConnection();
//		try {
//			stmt = conn.prepareStatement(query);
//			stmt.setString(0, user_id);
//			rs = stmt.executeQuery();
//			
//			JSONObject obj = new JSONObject();
//			while(rs.next()){
//				//push...
//			}
//		out.write(obj);
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
	}

}
