package com.savchenko.homeworks.hometask27;

import com.savchenko.homeworks.hometask25.PojoCountry;
import lombok.extern.slf4j.Slf4j;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.rmi.ServerException;

@Slf4j
@WebServlet("/country")
public class CountryGetAsJsonServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServerException, IOException {

        try {

            PrintWriter out = response.getWriter();
            String Code = request.getParameter("Code").trim();
            CountryInformation countryInformation = new CountryInformation();
            PojoCountry country = countryInformation.getInfo(Code);
            response.setContentType("application/json");
            response.setCharacterEncoding("UTF-8");

            while (country.getCode() != null) {
                CountryJsonWriter countryJsonWriter = new CountryJsonWriter();
                countryJsonWriter.writeCountryToJson(country);
            }
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}