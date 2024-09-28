package ru.productstar.servlets;

import javax.portlet.GenericPortlet;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
import java.io.IOException;

public class SimplePortlet extends GenericPortlet {
    @Override
    protected void doView(RenderRequest request, RenderResponse response) throws PortletException, IOException {
        var writer = response.getWriter();

        response.setContentType("text/html");
        writer.println("<h1>Заголовок портлета</h1>");
        writer.println("<p>Текст портлета</p>");
    }
}