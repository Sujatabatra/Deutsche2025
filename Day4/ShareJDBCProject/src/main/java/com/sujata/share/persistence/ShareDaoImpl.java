package com.sujata.share.persistence;

import com.sujata.share.entity.Share;

import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;

public class ShareDaoImpl implements ShareDao {
    @Override
    public ArrayList<Share> getAllRecords() {

        ArrayList<Share> shares=new ArrayList<>();
        Connection connection=null;
        PreparedStatement preparedStatement=null;
        try {
//            1. Connect
//            1.1 Register Driver
            Class.forName("org.postgresql.Driver");
//          1.2 Connect to DB  url: jdbc:postgresql://ipaddress:portno/database name
            connection= DriverManager.getConnection("jdbc:postgresql://localhost:5433/batch3","postgres","sujata");

//            2. Statement
            preparedStatement=connection.prepareStatement("SELECT * FROM SHARE");
//            DQL : executeQuery()

            ResultSet resultSet= preparedStatement.executeQuery();

//            3.Process Result
            while(resultSet.next()){
                int id=resultSet.getInt("SHARE_ID");
                String name=resultSet.getString("SHARE_NAME");
                int marketPrice=resultSet.getInt("MARKET_PRICE");
                LocalDate issueDate=resultSet.getObject("ISSUEDATE", LocalDate.class);

                Share share=new Share(id,name,marketPrice,issueDate);
                shares.add(share);
            }
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        finally {
//            4. Close Connection
            try {
                connection.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }

        }
        return shares;
    }

    @Override
    public int insertRecord(Share share) {

        int rows=0;
        PreparedStatement preparedStatement=null;
        try(Connection connection= DriverManager.getConnection("jdbc:postgresql://localhost:5433/batch3","postgres","sujata");) {

            Class.forName("org.postgresql.Driver");


            preparedStatement=connection.prepareStatement("INSERT INTO share(share_id, share_name, market_price, issuedate)" +
                    " VALUES (?, ?, ?, ?)");

            preparedStatement.setInt(1,share.getShareId());
            preparedStatement.setString(2,share.getShareName());
            preparedStatement.setInt(3,share.getMarketPrice());
            preparedStatement.setObject(4,share.getIssueDate());

//            DML : executeUpdate()

            rows=preparedStatement.executeUpdate();

        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            return 0;
//            throw new RuntimeException(e);
        }

        return rows;
    }
}
