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
public class ExportToPdf implements IRetrieveDataDb{

    @Override
    public String RetrievingDataFromDb() {
        return "The data was exported to PDF.";
    }
    
}
