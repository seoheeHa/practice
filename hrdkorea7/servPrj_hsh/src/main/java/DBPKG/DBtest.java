package DBPKG;

import java.sql.Connection;

public class DBtest {

	private static void main(String[] args) {
		
		try {
			
			Connection con = DBcon.getConnection();
			if(con != null){
				
				System.out.println("db 연결성공");
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
}
