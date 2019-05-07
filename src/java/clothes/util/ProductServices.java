/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clothes.util;

import clothes.business.Product;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author curti
 */
public class ProductServices extends IProductServices{
    
    @Override
    public List<Product> findProducts(int currentPage, int recordsPerPage)  {

        List<Product> products = null;
        
        int start = currentPage * recordsPerPage - recordsPerPage;
        
        try {
            String sql = "SELECT * FROM Countries LIMIT ?, ?";
            
            SimpleDriverDataSource ds = new SimpleDriverDataSource();
            ds.setDriver(new com.mysql.jdbc.Driver());
            ds.setUrl("jdbc:mysql://localhost:3307/earnyour");
            ds.setUsername("root");
            ds.setPassword("sesame");
            
            JdbcTemplate jtm = new JdbcTemplate(ds);
            products = jtm.query(sql, new Object[] {start, recordsPerPage}, 
                    new BeanPropertyRowMapper(Product.class));
            
        } catch (SQLException ex) {
            Logger.getLogger(ProductServices.class.getName()).log(Level.SEVERE, 
                null, ex);
        }
        
        return products;
    }    
      
    @Override
    public int getNumberOfRows() {
        
        int numOfRows = 0;
        
        try {
            String sql = "SELECT COUNT(Id) FROM Countries";
            
            SimpleDriverDataSource ds = new SimpleDriverDataSource();
            ds.setDriver(new com.mysql.jdbc.Driver());
            ds.setUrl("jdbc:mysql://localhost:3306/testdb");
            ds.setUsername("testuser");
            ds.setPassword("test623");
            
            JdbcTemplate jtm = new JdbcTemplate(ds);
            numOfRows = jtm.queryForObject(sql, Integer.class);
            
        } catch (SQLException ex) {
            Logger.getLogger(ProductServices.class.getName()).log(Level.SEVERE, 
                null, ex);
        }
        
        return numOfRows;
    }
}
