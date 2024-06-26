package dio.web.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dio.web.api.model.Usuario;
import dio.web.api.repository.UserRepository;

@RestController
@RequestMapping("/users")
public class UsuarioController {
  @Autowired
  private UserRepository repository;

  @GetMapping() // quando se tem mais um GetMapping, é preciso colocar uma 'rota' atraves dessa
                // url, vai ser executado isso
  public List<Usuario> getUsers() {
    return repository.findAll();
  }

  @GetMapping("/{userName}") // usando parametro na url
  public Usuario getOne(@PathVariable("userName") String userName) {
    return repository.findByUsername(userName);
  }

  @DeleteMapping("/{id}")
  public void delete(@PathVariable("id") Integer id) {
    repository.deleteById(id);
  }

  @PostMapping()
  public void postUser(@RequestBody Usuario usuario) {
    repository.save(usuario);
  }
}
