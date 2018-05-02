package Laborator10;

import java.sql.*;

public class Main {
    public static void main(String[] args) {
        try {
            Connection con = DBUtil.getConnection(DBType.MYSQLDB);

            /*Select date*/
            String sql_1 = "select * from agenda";
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sql_1);

            while(rs.next())
                System.out.println(rs.getString(1) + " " +rs.getString(2));

            /*Insert date*/
            String sq1_2 = "insert into agenda values('Popescu', 'Ion', '0212101010','0230123123', 'test@gmail.com', 'Test, nr 25', 'Bucuresti'," +
                    "'Bucuresti', '111111')";
            int result_insert = stmt.executeUpdate(sq1_2);

            if (result_insert > 0)
                System.out.println("Successfully Inserted");
            else
                System.out.println("Insert Failed");

            /*Update date*/
            String sq1_3 = "update agenda set `telefon fix` = '0212112021' where nume like 'Popescu'";
            int result_update  = stmt.executeUpdate(sq1_3);
            if (result_update > 0)
                System.out.println("row successfully Updated");
            else
                System.out.println("update failed");

            /*Delete date*/
            String sql_4 = "delete from agenda where nume like 'Popescu'";
            int result_delete  = stmt.executeUpdate(sql_4);
            if (result_delete > 0)
                System.out.println("row successfully deleted");
            else
                System.out.println("delete failed");

            /*Insert with batch*/
            String sql_5 = "insert into agenda values('Popescu', 'Ion', '0212101010','0230123123', 'test@gmail.com', 'Test, nr 25', 'Bucuresti'," +
                    "'Bucuresti', '111111')";
            for(int i=0;i<100;i++)
                stmt.addBatch(sql_5);
            //Executare batch
            stmt.executeBatch();

            //Stergere de date dupa insert-ul facut cu batch
            stmt.executeUpdate(sql_4);

            /*PreparedStatement*/
            String sql_6 = "insert into agenda values(?,?,?,?,?,?,?,?,?)";
            con.setAutoCommit(false);

            PreparedStatement pstmt = con.prepareStatement(sql_6);
            pstmt.setString(1, "Popa");
            pstmt.setString(2,"Marin");
            pstmt.setString(3, "0190100100");
            pstmt.setString(4, "0290200200");
            pstmt.setString(5, "test@yahoo.com");
            pstmt.setString(6, "Brasov, nr 20");
            pstmt.setString(7, "Brasov");
            pstmt.setString(8, "Brasov");
            pstmt.setString(9, "190190");
            pstmt.execute();

            con.commit();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
