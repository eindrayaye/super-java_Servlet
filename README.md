# super-java_Servlet

What Is a Servlet?

A servlet is a Java programming language class that is used to extend the capabilities of servers that host applications accessed by means of a request-response programming model. Although servlets can respond to any type of request, they are commonly used to extend the applications hosted by web servers. For such applications, Java Servlet technology defines HTTP-specific servlet classes.

The javax.servlet and javax.servlet.http packages provide interfaces and classes for writing servlets. All servlets must implement the Servlet interface, which defines life-cycle methods. When implementing a generic service, you can use or extend the GenericServlet class provided with the Java Servlet API. The HttpServlet class provides methods, such as doGet and doPost, for handling HTTP-specific services.

***************************

Project Assignment - 1

(1) Create a log in page with UserID and Password Boxes

    set the UserID as :admin
    
    set Password ad : admin
    
(2) Create a test web page

(3) Call the log-in page, 

    If UserID and/or Password is/are incorrect, display "Incorrect ...."
    
    If UserID and/or Password is/are incorrect, display the Wecome test page

>>>>>>>>>>>>>>>

Solution (Use JDK - Eclipse)
Make sure to have Tom Cat server

(1) Create a Project

(2) Create a package

(3) Create:

    1 - LoginServlet Class
    
    2 - Login.html (Path: src>main>WEB-INF>webapp> (Here))
    
    3 - Welcome.html (Path: src>main>WEB-INF>webapp> (Here))
    
(4) Launch server/ Display the page

(5) Test


-- END---
