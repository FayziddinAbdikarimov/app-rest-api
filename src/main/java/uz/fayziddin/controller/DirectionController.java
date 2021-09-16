package uz.fayziddin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import uz.fayziddin.entity.Direction;
import uz.fayziddin.repository.DirectionRepository;

import java.util.List;

@RestController
@RequestMapping("/direction")
public class DirectionController {
    @Autowired
    DirectionRepository directionRepository;

    @GetMapping
    public List<Direction> grtDirectList(){
        return directionRepository.findAll();
    }

    @PostMapping("/save")
    public Direction saveDirection(@RequestBody Direction newDirection){
        return directionRepository.save(newDirection);
    }

    @PutMapping("/edit/{id}")
    public <id> Direction editDirection(@RequestBody Direction editDirection,
                                   @PathVariable Integer id){
       Direction direction = directionRepository.findById(id).orElseThrow(()->
               new RuntimeException("Direction is not present!"));
       direction.setName(editDirection.getName());
       direction.setDescription(editDirection.getDescription());
       return directionRepository.save(direction);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteDirection(@PathVariable Integer id){
        directionRepository.deleteById(id);
    }

    @GetMapping("/{id}")
    public Direction getById(@PathVariable Integer id){
        return directionRepository.findById(id).orElseThrow(()->
                new RuntimeException("Direction is not present!"));
    }


}
