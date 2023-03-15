package in.banks.cards.controller;

import in.banks.cards.model.Cards;
import in.banks.cards.model.Customer;
import in.banks.cards.repository.CardsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CardsController {
    @Autowired
    private CardsRepository cardsRepository;
    @PostMapping("/cards")
    public List<Cards> getCardDetails(@RequestBody Customer customer){
        List<Cards> cardsList = cardsRepository.findByCustomerId(customer.getCustomerId());
        return cardsList;
    }
}
