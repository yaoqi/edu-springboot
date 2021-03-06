package com.nhnent.edu.springboot.web.filter.webappdemofilter2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.filter.GenericFilterBean;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.IOException;

public class Log1Filter extends GenericFilterBean{
    private static final Logger log = LoggerFactory.getLogger(Log1Filter.class);

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        log.info("LOG1 Filter");
        filterChain.doFilter(servletRequest, servletResponse);
    }
}
