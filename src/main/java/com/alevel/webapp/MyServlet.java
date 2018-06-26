package com.alevel.webapp;

import com.google.common.io.CharStreams;
import com.google.common.net.MediaType;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Arrays;

@WebServlet(urlPatterns = "/sort")
public class MyServlet extends HttpServlet {

    private static final String CONTENT_TYPE = "Content-Type";


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        BufferedReader reader = request.getReader();
        String requestBody = CharStreams.toString(reader);

        int[] numbers = Converter.toIntArray(Splitter.toStringArray(requestBody));
        Arrays.sort(numbers);

        response.setHeader(CONTENT_TYPE, MediaType.PLAIN_TEXT_UTF_8.type());
        response.getWriter().write(Arrays.toString(numbers));
    }
}
