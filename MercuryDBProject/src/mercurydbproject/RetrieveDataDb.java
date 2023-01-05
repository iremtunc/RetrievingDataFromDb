/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mercurydbproject;

/**
 *
 * @author Irem Tunc
 */
public class RetrieveDataDb {
       private IRetrieveDataDb retrieveDataDb;
       
       public void ExportTo(IRetrieveDataDb retrieveDataDb)      
       {
           this.retrieveDataDb=retrieveDataDb;
       }
       
       public String Export()
       {
           return this.retrieveDataDb.RetrievingDataFromDb();
       }
}
