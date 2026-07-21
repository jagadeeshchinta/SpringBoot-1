package com.jagadeesh.demo.Portfolio;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyPortfolio {
    @GetMapping("/mySelf")
    public String myself() {
        return """
            <h1>About Me</h1>
            <p>
            Hi, I'm Sandeep, a final-year Computer Science and Engineering student at
            Lovely Professional University (LPU). I am passionate about Java Full Stack Development,
            Data Structures & Algorithms, and Backend Development using Spring Boot. I am currently
            preparing for software engineering roles in top product and service-based companies.
            </p>

            <ul>
                <li>GitHub: <a href="https://github.com/sandeep-6666">https://github.com/sandeep-6666</a></li>
                <li>LeetCode: <a href="https://leetcode.com/u/sandeepchebrolu6/">LEETCODE_LINK</a></li>
            </ul>
            """;
    }

    @GetMapping("/education")
    public String getEducation() {
        return """
            <h2>Education</h2>

            <ul>
                <li><b>Bachelor of Technology (B.Tech)</b></li>
                <li>Computer Science and Engineering</li>
                <li>Lovely Professional University (LPU)</li>
                <li>Currently in Final Year</li>
            </ul>
            """;
    }

    @GetMapping("/skills")
    public String getSkills() {
        return """
            <h2>Technical Skills</h2>

            <ul>
                <li>Java</li>
                <li>Spring Boot</li>
                <li>Spring MVC</li>
                <li>Spring Data JPA</li>
                <li>Hibernate</li>
                <li>REST APIs</li>
                <li>C++</li>
                <li>C</li>
                <li>Python</li>
                <li>HTML</li>
                <li>CSS</li>
                <li>JavaScript</li>
                <li>React</li>
                <li>MySQL</li>
                <li>MongoDB</li>
                <li>Git & GitHub</li>
                <li>Maven</li>
                <li>Data Structures & Algorithms</li>
            </ul>
            """;
    }

    @GetMapping("/projectname")
    public String getProjects() {
        return """
            <h2>Projects</h2>

            <ol>
                <li>
                    <b>AI-Powered Inventory and Sales Management System (StockPilot)</b><br>
                    Built using React, Node.js, Express.js, and MongoDB for inventory and sales management.
                </li>

                <li>
                    <b>Art Gallery Website</b><br>
                    Developed using React, Node.js, Express.js, and MongoDB with user authentication and artwork management.
                </li>

                <li>
                    <b>SHA-256 Hash Generator</b><br>
                    Java application implementing SHA-256 hashing for secure data encryption.
                </li>
            </ol>
            """;
    }

    @GetMapping("/contact")
    public String getContact() {
        return """
            <h2>Contact</h2>

            <ul>
                <li>Name: Sandeep </li>
                <li>Role: Aspiring Software Engineer | Java Full Stack Developer</li>
                <li>GitHub:
                    <a href="https://github.com/sandeep-6666">
                    https://github.com/sandeep-6666
                    </a>
                </li>
            </ul>
            """;
    }
}

