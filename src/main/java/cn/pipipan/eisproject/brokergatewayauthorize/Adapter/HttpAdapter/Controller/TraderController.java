package cn.pipipan.eisproject.brokergatewayauthorize.Adapter.HttpAdapter.Controller;

import cn.pipipan.eisproject.brokergatewayauthorize.Domain.Model.User.Trader;
import cn.pipipan.eisproject.brokergatewayauthorize.Domain.Model.User.TraderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TraderController {
    @Autowired
    TraderRepository traderRepository;

    @PostMapping("trader")
    public Trader signUp(Trader trader){
        return traderRepository.save(trader);
    }

    @GetMapping("trader")
    public List<Trader> findAll(){
        return traderRepository.findAll();
    }
}
