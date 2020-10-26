package com.liferay.training.portlet.jsr286;

 import java.io.IOException;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.Portlet;
import javax.portlet.PortletConfig;
import javax.portlet.PortletContext;
import javax.portlet.PortletException;
import javax.portlet.PortletRequestDispatcher;
import javax.portlet.PortletSession;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

 public class JSR286Portlet implements Portlet {

     @Override
     public void init(PortletConfig config) throws PortletException {
         System.out.println("JSR286Portlet.init()");
     }

     @Override
     public void processAction(ActionRequest actionRequest, ActionResponse actionResponse)
         throws PortletException, IOException {

         System.out.println("JSR286Portlet.processAction()");
     }

     @Override
     public void render(RenderRequest renderRequest, RenderResponse renderResponse)
         throws PortletException, IOException {

         System.out.println("JSR286Portlet.render()");

//         PrintWriter printWriter = renderResponse.getWriter();        
//         printWriter.write("Output from the JSR286Portlet's render() method.");
         
         String path = "/view.jsp";

         PortletSession portletSession = renderRequest.getPortletSession();
         PortletContext portletContext = portletSession.getPortletContext();
         PortletRequestDispatcher portletRequestDispatcher = portletContext.getRequestDispatcher(path);

         if (portletRequestDispatcher == null) {
             System.err.println(path + " is not a valid include");
         }
         else {
             portletRequestDispatcher.include(renderRequest, renderResponse);
         }

     }

     @Override
     public void destroy() {
         System.out.println("JSR286Portlet.destroy()");
     }
 }