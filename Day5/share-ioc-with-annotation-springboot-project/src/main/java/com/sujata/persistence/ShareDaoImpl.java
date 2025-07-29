package com.sujata.persistence;

import com.sujata.entity.Share;
import org.springframework.stereotype.Component;

import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Component
public class ShareDaoImpl implements ShareDao {
    @Override
    public List<Share> getAllRecords() {
        List<Share> shareList = new ArrayList<>();

        Statement statement = null;
        try (Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5433/batch3", "postgres",
                "sujata");) {

            Class.forName("org.postgresql.Driver");
            statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery("SELECT * FROM SHARE");

            while (resultSet.next()) {
                int id = resultSet.getInt("SHARE_ID");
                String name = resultSet.getString("SHARE_NAME");
                int marketPrice = resultSet.getInt("MARKET_PRICE");
                LocalDate date=resultSet.getObject("ISSUEDATE", LocalDate.class);
                Share share=new Share(id,name,marketPrice,date);
                shareList.add(share);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        return shareList;

    }

    @Override
    public int insertRecord(Share share) {
        PreparedStatement preparedStatement = null;
        int rows=0;
        try (Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5433/batch3", "postgres",
                "sujata");) {

            Class.forName("org.postgresql.Driver");
            preparedStatement = connection.prepareStatement("INSERT INTO SHARE VALUES(?,?,?,?)");
            preparedStatement.setInt(1,share.getShareId());
            preparedStatement.setString(2,share.getShareName());
            preparedStatement.setInt(3,share.getMarket_price());
            preparedStatement.setObject(4,share.getIssueDate());

            rows=preparedStatement.executeUpdate();

            } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }catch (SQLException ex) {
            throw new RuntimeException(ex);
        }

        return rows;

    }
}
