/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clothes.util;

import clothes.business.Product;
import java.util.List;

/**
 *
 * @author curti
 */
public class IProductServices {

    /**
     *
     * @param currentPage
     * @param numOfRecords
     * @return
     */
    public List<Product> findProducts(int currentPage, int numOfRecords);
    public int getNumberOfRows();
}
