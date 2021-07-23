import com.userweb.dao.Person;

import javax.rmi.CORBA.Stub;
import java.sql.*;


/**
 * @author :Zlw
 * date : 2021/7/19 14:15
 */


public class User {

    //连接数据库
    public Connection getConnection(){
        static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
        static final String DB_URL = "jdbc:mysql://localhost:3306/userweb";

        // 数据库的用户名与密码
        static final String USER = "root";
        static final String PASS = "123456";

        //数据库连接对象
        Connection conn = null;

        try{
            //加载驱动
            Class.forName(JDBC_DRIVER);
            //链接数据库
            conn = DriverManager.getConnection(DB_URL,USER,PASS);
        }catch(ClassNotFoundException e){
            //TODO Auto-generated catch block
            e.printStackTrace();
        }
        return conn;
    }

    //查找：按ID
    public Person














/**
*测试
 */
/*
//测试数据库的链接以及数据读取
   static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost:3306/userweb";

    // MySQL 8.0 以上版本 - JDBC 驱动名及数据库 URL
    //static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    //static final String DB_URL = "jdbc:mysql://localhost:3306/RUNOOB?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC";


    // 数据库的用户名与密码，需要根据自己的设置
    static final String USER = "root";
    static final String PASS = "123456";

    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        try{
            // 注册 JDBC 驱动
            Class.forName(JDBC_DRIVER);

            // 打开链接
            System.out.println("连接数据库...");
            conn = DriverManager.getConnection(DB_URL,USER,PASS);

            // 执行查询
            System.out.println(" 实例化Statement对象...");
            stmt = conn.createStatement();
            String sql;
            sql = "SELECT * FROM useinfo";
            ResultSet rs = stmt.executeQuery(sql);

            // 展开结果集数据库
            while(rs.next()){
                // 通过字段检索
                int id  = rs.getInt("用户ID");
                String name = rs.getString("用户名称");
                String url = rs.getString("身份证号");

                // 输出数据
                System.out.print("ID: " + id);
                System.out.print(", 站点名称: " + name);
                System.out.print(", 站点 URL: " + url);
                System.out.print("\n");
            }
            // 完成后关闭
            rs.close();
            stmt.close();
            conn.close();
        }catch(SQLException se){
            // 处理 JDBC 错误
            se.printStackTrace();
        }catch(Exception e){
            // 处理 Class.forName 错误
            e.printStackTrace();
        }finally{
            // 关闭资源
            try{
                if(stmt!=null) stmt.close();
            }catch(SQLException se2){
            }// 什么都不做
            try{
                if(conn!=null) conn.close();
            }catch(SQLException se){
                se.printStackTrace();
            }
        }
        System.out.println("Goodbye!");
    }*/

    //


}
