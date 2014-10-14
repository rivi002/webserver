/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bs;

import db.Dbconection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author Dumindu
 */
public class Oparations {
    
    Connection con = Dbconection.getConnection();
    Statement statement = null;
    ResultSet resultSet = null;
    
    
   public  List<person> getdata()
           
   {
       List<person> personlist = new ArrayList<person>();
       
   try {
            statement = con.createStatement();
            resultSet = statement.executeQuery("select * from  EAD.PERSON");
            
            while (resultSet.next()) {
                person p = new person();

                p.setId(resultSet.getInt("id"));
                p.setName(resultSet.getString("name"));
                p.setAddress(resultSet.getString("address"));
                
                System.out.println("name");

                personlist.add(p);
            }
        } catch (SQLException ex) {
            
        } finally {
            
        }
        return personlist;
    }
   
   
   /*
   public void add(Supplier supplier) {
                try {
                    
                        String queryString = "INSERT INTO Supplier(sup_name,sup_address,sup_status) values('"+supplier.getName()+"','"+supplier.getAddress()+"',"+true+")";
                        connection = getConnection();
                        ptmt = connection.prepareStatement(queryString);                                               
                        ptmt.executeUpdate();
                        
                        
                        queryString="INSERT INTO Supplier_contact values(?,?,?,?) ";
                        ptmt = connection.prepareStatement(queryString);
                        ptmt.setInt(1,supid );
                        ptmt.setInt(2, supplier.getPhone());
                        ptmt.setString(3, supplier.getEmail());
                        ptmt.setInt(4, supplier.getFax());
                        ptmt.executeUpdate();
                        
                        JOptionPane.showMessageDialog(null, "Supplier '"+supplier.getName()+"' information added successfully", "Successfull", 3);//successful message
                } catch (SQLException e) {
                        e.printStackTrace();
                } finally {
                        try {
                                if (ptmt != null)
                                        ptmt.close();
                                if (connection != null)
                                        connection.close();
                        } catch (SQLException e) {
                                e.printStackTrace();
                        } catch (Exception e) {
                                e.printStackTrace();
                        }

                }

        }
   
   
   */
}