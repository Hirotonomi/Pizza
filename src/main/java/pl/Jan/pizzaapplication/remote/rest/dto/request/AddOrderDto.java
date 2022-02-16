package pl.Jan.pizzaapplication.remote.rest.dto.request;

import java.util.List;

public class AddOrderDto
{
    private List<PizzaOrderDto> pizzas;
    private PersonsOrderDto person;

    public AddOrderDto()
    {

    }

    public AddOrderDto(List<PizzaOrderDto> pizzas, PersonsOrderDto person)
    {
        this.pizzas = pizzas;
        this.person = person;
    }


    public List<PizzaOrderDto> getPizzas()
    {
        return pizzas;
    }
    public void setPizzas(List<PizzaOrderDto> pizzas)
    {
        this.pizzas = pizzas;
    }

    public PersonsOrderDto getPerson()
    {
        return person;
    }
    public void setPerson(PersonsOrderDto person)
    {
        this.person = person;
    }
}
