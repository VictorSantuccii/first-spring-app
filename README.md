# 🌱 **First Spring App** 🚀

Bem-vindo à minha primeira aplicação usando **Spring Boot**! 🎉 Este projeto foi criado para aprender os fundamentos do **Spring Boot** de maneira simples e prática. 💡

---

## 📋 **O que é este projeto?**

Este é um projeto básico que utiliza Spring Boot para criar uma API REST simples com algumas funcionalidades:

- **GET**: Retorna uma mensagem de boas-vindas.  
- **POST**: Permite enviar informações como nome de usuário.  
- **Manipulação de parâmetros**: Mostra como trabalhar com `@PathVariable`, `@RequestBody`, e `@RequestParam`.

---

## 🔧 **Ferramentas Utilizadas**

🛠️ **Tecnologias**:
- **Java** ☕  
- **Spring Boot** 🌟  
- **Spring Web** 🌐  
- **Spring Boot DevTools** 🚀  
- **Lombok** ✨

---

## 🚀 **Como Rodar o Projeto?**

1. Clone o repositório:  
   ```bash
   git clone https://github.com/sant/first-spring-app.git
   cd first-spring-app
   ```

2. Execute o projeto:  
   ```bash
   ./mvnw spring-boot:run
   ```

3. Acesse os endpoints:  
   - **GET**: `http://localhost:8080/hello-world`  
   - **POST**: `http://localhost:8080/hello-world`  
     - Enviar um JSON no corpo:  
       ```json
       {
         "name": "Victor Santucci"
       }
       ```  
   - **POST** com parâmetros:  
     `http://localhost:8080/hello-world/{id}?filter=value`  

---

## 🛠️ **Código Simplificado**

Aqui está um resumo da funcionalidade:

### **Controller: HelloWorldController**

```java
@RestController
@RequestMapping("hello-world")
@Profile("dev") // Apenas para ambiente de desenvolvimento
public class HelloWorldController {

    private final HelloWorldService helloWorldService;

    public HelloWorldController(HelloWorldService helloWorldService) {
        this.helloWorldService = helloWorldService;
    }

    // Retorna uma mensagem de boas-vindas
    @GetMapping
    public String helloWorld() {
        return helloWorldService.helloWorld("Santucci");
    }

    // Retorna mensagem usando dados do corpo da requisição
    @PostMapping("")
    public String helloWorldPost(@RequestBody User body) {
        return "Hello World " + body.getName();
    }

    // Retorna mensagem com ID e filtro
    @PostMapping("/{id}")
    public String helloWorldPost2(
            @PathVariable("id") String id,
            @RequestParam(value = "filter", defaultValue = "nenhum") String filter,
            @RequestBody User body) {
        return "Hello World " + body.getName() + " ID: " + id + " Filter: " + filter;
    }
}
```

### **Service: HelloWorldService**

```java
@Service
public class HelloWorldService {

    public String helloWorld(String name) {
        return "Hello World " + name + "!";
    }
}
```

### **Modelo: User**

```java
@Data // Lombok para getters, setters e toString
public class User {
    private String name;
}
```

---

## 🧩 **Próximos Passos**

- 🔍 Aprender mais sobre Spring Data JPA.  
- 🛡️ Implementar autenticação e segurança com Spring Security.  
- 📚 Expandir o projeto com testes unitários.

---

## 💬 **Contato**

📧 E-mail: victorsantuccii@gmail.com  

✨ **Obrigado por conferir minha aplicação!** ✨

---
