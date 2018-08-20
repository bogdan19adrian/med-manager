package ro.go.bogdan.medmanager.config;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class SimpleCORSFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        final HttpServletResponse response = (HttpServletResponse) servletResponse;
        final HttpServletRequest request = ((HttpServletRequest) servletRequest);


        response.setHeader("Access-Control-Allow-Origin", "*");
        response.setHeader("Access-Control-Allow-Methods", "HEAD, OPTIONS, GET, POST, PUT, HEAD, PATCH, DELETE");
        response.setHeader("Access-Control-Max-Age", "3600");
        response.setHeader("Access-Control-Allow-Credentials", "true");
        response.setHeader("Access-Control-Allow-Headers",
                "Origin, X-Requested-With, Content-Range, Content-Disposition, "
                        + "Content-Type, Authorization, X-Auth-Token, X-Access-Token, X-XSRF-TOKEN, "
                        + "accept, Access-Control-Request-Method,"
                        + "cache-control, pragma, x-jwt-token, X-API-KEY");

        if (!request.getMethod().equals("OPTIONS")) {
            if (request.getCharacterEncoding() == null) {
                request.setCharacterEncoding("UTF-8");
            }
            filterChain.doFilter(request, response);
        }
    }

    @Override
    public void destroy() {

    }
}
