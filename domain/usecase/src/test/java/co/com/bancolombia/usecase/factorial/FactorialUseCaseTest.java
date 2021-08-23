package co.com.bancolombia.usecase.factorial;

import co.com.bancolombia.model.calculadora.gateways.CalculadoraRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class FactorialUseCaseTest {

    MathematicsService mathematicsService;
    CalculadoraRepository mockedRepo;

    @BeforeEach
    void setUp(){

        mockedRepo = Mockito.mock(CalculadoraRepository.class);
        mathematicsService = new FactorialUseCase(mockedRepo);
    }

    //tdd
    @Test
    void testNegativos(){

        // given
        String givenVal = "nombre1";
        ArgumentCaptor<String> givenNameCaptor = ArgumentCaptor.forClass(String.class);
        //when
        when(mockedRepo.txPerPerson(givenNameCaptor.capture())).thenReturn(10);
        //then
        var actualResult = mathematicsService.factorialOf(givenVal);
        String userInput = givenNameCaptor.getValue();
        assertThat(userInput).isEqualTo(givenVal);
        assertThat(actualResult).isEqualTo(1_000);
    }

}
