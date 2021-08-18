package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import db.DBConn;

public class AdminDao {

	public int getLogin(String admin_id, String admin_pwd) {
		Connection        conn  = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		int yn = -1;
		try {
			DBConn db = new DBConn();
			conn = db.getConnection();
			String sql = " SELECT ADMIN_PWD FROM ADMIN WHERE ADMIN_ID = ?";
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, admin_id);
			System.out.println(admin_id);
			System.out.println(admin_pwd);
			rs = pstmt.executeQuery();
			if( rs.next()) {
				System.out.println(rs.getString(1));
				if(admin_pwd.equals(rs.getString(1))){
					yn = 1;  // 비밀번호가 맞다면 1을 리턴
					System.out.println("로그인 성공");
					
				} else  {
					yn = 0;  //비밀번호 오류 
					System.out.println("패스워드 다름");
				}
			} else {
				System.out.println("아이디없음");
			}
					
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				try {
					if( rs != null )    rs.close();
					if( pstmt != null ) pstmt.close();
					if( conn  != null ) conn.close();
				} catch (SQLException e) {
				}
			}
			return yn;
		}

}
