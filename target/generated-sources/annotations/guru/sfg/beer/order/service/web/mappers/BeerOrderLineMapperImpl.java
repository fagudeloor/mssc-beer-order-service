package guru.sfg.beer.order.service.web.mappers;

import guru.sfg.beer.order.service.domain.BeerOrderLine;
import guru.sfg.brewery.model.BeerOrderLineDto;
import javax.annotation.processing.Generated;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-04-22T20:30:25-0500",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 11.0.18 (Amazon.com Inc.)"
)
@Component
@Primary
public class BeerOrderLineMapperImpl extends BeerOrderLineMapperDecorator implements BeerOrderLineMapper {

    @Autowired
    @Qualifier("delegate")
    private BeerOrderLineMapper delegate;

    @Override
    public BeerOrderLine dtoToBeerOrderLine(BeerOrderLineDto dto)  {
        return delegate.dtoToBeerOrderLine( dto );
    }
}
