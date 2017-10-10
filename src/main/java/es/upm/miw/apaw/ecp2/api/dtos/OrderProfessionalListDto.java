package es.upm.miw.apaw.ecp2.api.dtos;

import java.util.List;

import es.upm.miw.apaw.ecp2.api.entities.Order;

public class OrderProfessionalListDto {

    private OrderDto themeDto;

    private List<Integer> voteList;

    public OrderProfessionalListDto() {
    }

    public OrderProfessionalListDto(Order order, List<Integer> voteList) {
        themeDto = new OrderDto(order);
        this.voteList = voteList;
    }

    public OrderDto getThemeDto() {
        return themeDto;
    }

    public List<Integer> getVoteList() {
        return voteList;
    }

    @Override
    public String toString() {
        return "{" + themeDto + "," + voteList + "}";
    }

}
