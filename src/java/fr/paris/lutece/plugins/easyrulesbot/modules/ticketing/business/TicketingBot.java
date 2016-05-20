/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.paris.lutece.plugins.easyrulesbot.modules.ticketing.business;

import fr.paris.lutece.plugins.easyrulesbot.business.Bot;
import fr.paris.lutece.portal.service.util.AppLogService;
import fr.paris.lutece.portal.service.util.AppPropertiesService;
import fr.paris.lutece.util.httpaccess.HttpAccess;
import fr.paris.lutece.util.httpaccess.HttpAccessException;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author closea
 */
public class TicketingBot extends Bot 
{
    private static final String PROPERTY_LAST_MESSAGE = "module.easyrulesbot.facilfamilles.lastMessage";
    private static final String PROPERTY_URL_TICKETING = "easyrulesbot-ticketing.url.ticketing";

    /**
     * {@inheritDoc }
     */
    @Override
    public String processData( HttpServletRequest request, Map<String, String> mapData, Locale locale )
    {
        /*
        Map<String,String> mapParameters = new HashMap<String,String>();
        HttpAccess httpAccess = new HttpAccess();
        mapParameters.put(  "page", "ticket" );
        mapParameters.put(  "action", "createTicket"  );
        mapParameters.put(  "", "" );
        mapParameters.put(  "", "" );
        mapParameters.put(  "", "" );
        mapParameters.put(  "", "" );
        mapParameters.put(  "", "" );
        
        String strUrl = AppPropertiesService.getProperty( PROPERTY_URL_TICKETING );
        try
        {
            httpAccess.doPost( strUrl , mapParameters );
        }
        catch( HttpAccessException ex )
        {
            AppLogService.error( "Error ", ex );
        }
        */
        return "Votre demande a été envoyée";
    }
}
