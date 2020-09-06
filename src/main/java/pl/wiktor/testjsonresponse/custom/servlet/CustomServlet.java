package pl.wiktor.testjsonresponse.custom.servlet;

import lombok.extern.slf4j.Slf4j;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Slf4j
@WebServlet(name = "CustomServlet", urlPatterns = {"/custom/*"})
public class CustomServlet extends HttpServlet {
    @Override
    public void init(ServletConfig config) throws ServletException {
        log.info("CustomServlet INIT METHOD CALLED!");
        super.init(config);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        log.info("CustomServlet extends HttpServlet: doGet");
        super.doGet(req, resp);
    }


}
