package com.game.game;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;




@RestController
public class GameController {
private guessingGame GuessingGame;




    @GetMapping
    public String help() {
        return "Welcome to the number guessing game";
        
    }

    @PostMapping("/enter")
    public String entergame(@RequestParam(value = "name") String name)throws ControllerException {
        this.GuessingGame = new guessingGame(name);
        return "Guess thee number";
    }

    @PostMapping("/number")
    public String getnumber(@RequestParam(value = "n")int n)throws ControllerException {
        return this.GuessingGame.gameStart(n);
    }
    @GetMapping("/help")
	public String Help(){
		return this.GuessingGame.getHelp();


}
@GetMapping("/info")
public String stats(){
    return this.GuessingGame.getInfo();
}
}

//     @GetMapping("/Player")
//    public  getPlayer() {
//     return p;

    

//     }

// @PostMapping("/Player")
// public void postName() {
//  p = new Player();


// }
// @PutMapping("/Player")
// public void putName(@RequestParam String name, Integer age) {
//     p.setName(name);
//     p.setAge(age);
// }



    



// @DeleteMapping("/Player")
// public void deleteName() {
//     p = null;
// }


// }
// @GetMapping("/vehicle")
// public Vehicle getVehicle(@RequestParam String model) {
//     if (v.getModel().equals(model)){
//         return v;
//     }
//     else{
//         return null;
//     }

//  }
    
// }



/**
 * GET /vehicle
 * POST /vehicle
 * PUT /vehicle
 * DELETE/vehicle
 */