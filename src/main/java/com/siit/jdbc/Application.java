package com.siit.jdbc;

import com.siit.jdbc.spring_data_jpa.EmployeeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableJpaRepositories
@EnableTransactionManagement
public class Application implements CommandLineRunner {

    @Autowired
    private ApplicationContext applicationContext;

    private static SpringApplication springApplication = new SpringApplication(Application.class);

    public static void main(String[] args) {
        springApplication.run(args);

    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println();
        /*
        EmpRepository empRepository = (EmpRepository) applicationContext.getBean("empRepository");
        int id = 13;
        Employee johnDoe = Employee.builder()
                                   .id(id)
                                   .name("John Doe")
                                   .hiredate(LocalDate.of(2000, 10, 12))
                                   .salary(2000)
                                   .job("it-ist")
                                   .build();

        empRepository.save(johnDoe);
        List<Employee> employee = empRepository.findById(id);
        System.out.println("Employee retrieved = " + employee);
        empRepository.delete(id);
        */

        EmployeeService service = applicationContext.getBean(EmployeeService.class);

        service.findAll()
               .forEach(employee -> System.out.println("employee = " + employee +
                       "\n\t department = " + employee.getDepartment()));

    }
}
