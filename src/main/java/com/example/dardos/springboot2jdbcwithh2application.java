package com.example.dardos;

public class springboot2jdbcwithh2application {

    private logger logger = loggerfactory.getlogger(this.getclass());

    @autowired
    studentjdbcrepository repository;

    public static void main(string[] args) {
        springapplication.run(springboot2jdbcwithh2application.class, args);
    }

    @override
    public void run(string...args) throws exception {

        logger.info("student id 10001 -> {}", repository.findbyid(10001 l));
    }
}
