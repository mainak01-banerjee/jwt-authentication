This is a backend authentication system built using Spring Boot and JWT (JSON Web Token).
It provides secure user authentication and authorization using stateless session management.


🚀 Features
1.User registration and login
2.JWT-based authentication
3.Role-based access control (if you implemented roles)
4.Password encryption using BCrypt
5.Secure REST APIs
6.Stateless session handling


🛠️ Tech Stack
1.Java
2.Spring Boot
3.Spring Security
4.JWT (JSON Web Token)
5.MySQL
6.Maven


com.example.mainak
 ├── auth/
 ├── config/
 ├── controllers/
 ├── module/
 ├── repository/
 ├── security/
 ├── service/
 └── MainakApplication.java

 
EndPoints
POST /api/v1/auth/register   → Register user
POST /api/v1/auth/login      → Login + JWT token
GET  /hello                  → Test endpoint
GET  /home                   → UI forward (optional)


👨‍💻 Author
Mainak Banerjee
GitHub: https://github.com/mainak01-banerjee
