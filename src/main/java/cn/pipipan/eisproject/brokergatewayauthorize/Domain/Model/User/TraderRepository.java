package cn.pipipan.eisproject.brokergatewayauthorize.Domain.Model.User;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface TraderRepository extends MongoRepository<Trader, String> {
    public Trader findTraderByTraderNameEquals(String traderName);
}
